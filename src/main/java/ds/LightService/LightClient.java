package ds.LightService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class LightClient {
    private static final Logger logger = Logger.getLogger(LightClient.class.getName());

    public static void main(String[] args) throws InterruptedException {
//        String host = "localhost";
//        int port = 50052;
        // Create a new channel and stub
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        LightServiceGrpc.LightServiceStub stub = LightServiceGrpc.newStub(channel);

        // Call turnOnOff RPC
        LightRequest turnOnRequest = LightRequest.newBuilder().setIsOn(true).build();
        stub.turnOnOff(turnOnRequest, new StreamObserver<Empty>() {
            @Override
            public void onNext(Empty empty) {
                logger.info("turnOnOff response received");
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("turnOnOff error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("turnOnOff completed");
            }
        });

        // Call getCurrentBrightness RPC
        LightRequest getCurrentBrightnessRequest = LightRequest.newBuilder().build();
        stub.getCurrentBrightness(getCurrentBrightnessRequest, new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse response) {
                logger.info("getCurrentBrightness response received with brightness = " + response.getBrightness());
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("getCurrentBrightness error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("getCurrentBrightness completed");
            }
        });

        // Call setBrightness RPC
        StreamObserver<LightRequest> setBrightnessRequestObserver = stub.setBrightness(new StreamObserver<LightResponse>() {
            @Override
            public void onNext(LightResponse response) {
                logger.info("setBrightness response received with brightness = " + response.getBrightness());
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("setBrightness error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("setBrightness completed");
            }
        });

        // Send multiple setBrightness requests using the same observer
        setBrightnessRequestObserver.onNext(LightRequest.newBuilder().setBrightness(100).build());
        setBrightnessRequestObserver.onNext(LightRequest.newBuilder().setBrightness(75).build());
        setBrightnessRequestObserver.onNext(LightRequest.newBuilder().setBrightness(50).build());

        // Notify the server that all requests have been sent
        setBrightnessRequestObserver.onCompleted();

        // Block main thread to prevent termination
        new CountDownLatch(1).await();

        // Shutdown the channel
        channel.shutdown();
    }
}

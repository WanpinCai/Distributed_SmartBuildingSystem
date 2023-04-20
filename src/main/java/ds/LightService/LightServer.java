package ds.LightService;

import ds.LightService.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import ds.LightService.LightServiceGrpc;



import java.io.IOException;
import java.util.logging.Logger;

public class LightServer extends LightServiceGrpc.LightServiceImplBase {

    private static final Logger logger = Logger.getLogger(LightServiceImpl.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a new gRPC server using ServerBuilder
        Server server = ServerBuilder.forPort(50052).addService(new LightServer()).build();

        // Start the server
        server.start();

        logger.info("Server started, listening on " + server.getPort());

        // Block main thread to prevent termination
        server.awaitTermination();
    }

    @Override
    public void turnOnOff(LightRequest request, StreamObserver<Empty> responseObserver) {
        // Perform turnOnOff logic here
        logger.info("turnOnOff called with isOn = " + request.getIsOn());

        // Send empty response
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrentBrightness(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        // Perform getCurrentBrightness logic here
        logger.info("getCurrentBrightness called");

        // Create LightResponse object with dummy brightness value of 50
        LightResponse response = LightResponse.newBuilder().setBrightness(50).build();

        // Send response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<LightRequest> setBrightness(StreamObserver<LightResponse> responseObserver) {
        // Return a new StreamObserver to handle incoming LightRequest messages
        return new StreamObserver<LightRequest>() {
            @Override
            public void onNext(LightRequest request) {
                // Perform setBrightness logic here
                logger.info("setBrightness called with brightness = " + request.getBrightness());

                // Create LightResponse object with dummy brightness value of 75
                LightResponse response = LightResponse.newBuilder().setBrightness(75).build();

                // Send response back to client
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                // Log error and complete responseObserver
                logger.warning("setBrightness error: " + throwable.getMessage());
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                // Log completion and complete responseObserver
                logger.info("setBrightness completed");
                responseObserver.onCompleted();
            }
        };
    }
}

package ds.HavcService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class HavcClient {
    public static void main(String[] args) {
        // 创建gRPC通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // 创建HvacService客户端
        HvacServiceGrpc.HvacServiceStub stub = HvacServiceGrpc.newStub(channel);

        // 调用setTemperature方法
        TemperatureRequest temperatureRequest = TemperatureRequest.newBuilder().setTemperature(25).build();
        stub.setTemperature(temperatureRequest, new StreamObserver<ConfirmationMessage>() {
            @Override
            public void onNext(ConfirmationMessage confirmationMessage) {
                String message = confirmationMessage.getMessage();
                System.out.println("Have server is start");
                System.out.println("Confirmation Message: " + message);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("setTemperature completed.");
            }
        });

        // 调用getTemperatureStream方法
        TemperatureRequest temperatureRequest2 = TemperatureRequest.newBuilder().setTemperature(25).build();
        stub.getTemperatureStream(temperatureRequest2, new StreamObserver<TemperatureValue>() {
            @Override
            public void onNext(TemperatureValue temperatureValue) {
                int temperature = temperatureValue.getTemperature();
                System.out.println("Current temperature: " + temperature + " degrees.");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("getTemperatureStream completed.");
            }
        });

        // 调用controlTemperature方法
        StreamObserver<TemperatureValue> temperatureValueStreamObserver = stub.controlTemperature(new StreamObserver<TemperatureValue>() {
            @Override
            public void onNext(TemperatureValue temperatureValue) {
                int temperature = temperatureValue.getTemperature();
                System.out.println("Updated temperature: " + temperature + " degrees.");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("controlTemperature completed.");
            }
        });

        // 发送温度更新
        for (int i = 0; i < 5; i++) {
            int temperature = 25 + i;
            TemperatureValue temperatureValue = TemperatureValue.newBuilder().setTemperature(temperature).build();
            temperatureValueStreamObserver.onNext(temperatureValue);
        }
        temperatureValueStreamObserver.onCompleted();

        // 关闭gRPC通道
        channel.shutdown();
    }
}

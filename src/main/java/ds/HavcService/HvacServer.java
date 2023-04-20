package ds.HavcService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class HvacServer {
    public static void main(String[] args) throws Exception {
        // 创建gRPC服务
        Server server = ServerBuilder.forPort(50051)
                .addService(new HvacServiceImpl())
                .build();

        // 启动gRPC服务
        server.start();
        System.out.println("gRPC server started!");

        // 阻塞线程，等待服务关闭
        server.awaitTermination();
    }

    // 实现HvacService服务的具体方法
    private static class HvacServiceImpl extends HvacServiceGrpc.HvacServiceImplBase {
        @Override
        public void setTemperature(TemperatureRequest request, StreamObserver<ConfirmationMessage> responseObserver) {
            int temperature = request.getTemperature();
            // 处理设置温度的逻辑
            String message = "Temperature set to " + temperature + " degrees.";
            ConfirmationMessage confirmation = ConfirmationMessage.newBuilder().setMessage(message).build();
            responseObserver.onNext(confirmation);
            responseObserver.onCompleted();
        }

        @Override
        public void getTemperatureStream(TemperatureRequest request, StreamObserver<TemperatureValue> responseObserver) throws InterruptedException {
            int temperature = request.getTemperature();
            // 处理获取温度流的逻辑
            for (int i = 0; i < 10; i++) {
                temperature += i;
                TemperatureValue temperatureValue = TemperatureValue.newBuilder().setTemperature(temperature).build();
                responseObserver.onNext(temperatureValue);
                Thread.sleep(1000); // 模拟1秒钟后更新温度
            }
            responseObserver.onCompleted();
        }

        @Override
        public StreamObserver<TemperatureValue> controlTemperature(StreamObserver<TemperatureValue> responseObserver) {
            // 处理控制温度的逻辑
            return new StreamObserver<TemperatureValue>() {
                @Override
                public void onNext(TemperatureValue temperatureValue) {
                    int temperature = temperatureValue.getTemperature();
                    // 处理温度更新逻辑
                    temperature += 5;
                    TemperatureValue newTemperatureValue = TemperatureValue.newBuilder().setTemperature(temperature).build();
                    responseObserver.onNext(newTemperatureValue);
                }

                @Override
                public void onError(Throwable throwable) {
                    // 处理错误逻辑
                }

                @Override
                public void onCompleted() {
                    responseObserver.onCompleted();
                }
            };
        }
    }
}

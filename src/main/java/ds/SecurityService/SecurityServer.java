package ds.SecurityService;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class SecurityServer extends SecurityServiceGrpc.SecurityServiceImplBase {
    public static void main(String[] args) throws IOException {
        SecurityServer CheckAccess = new SecurityServer();
        int port = 50053;

        Server server;
        try {
            server = ServerBuilder.forPort(port).addService((BindableService) CheckAccess).build().start();
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void checkAccess(AccessRequest request, StreamObserver<AccessResponse> responseObserver) {
        // TODO: 实现 CheckAccess 方法逻辑
        boolean hasAccess = true; // 假设用户有访问权限
        AccessResponse response = AccessResponse.newBuilder().setHasAccess(hasAccess).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorRoomActivity(AccessRequest request, StreamObserver<ActivityEvent> responseObserver) {
        // TODO: 实现 MonitorRoomActivity 方法逻辑
        ActivityEvent event = ActivityEvent.newBuilder()
                .setEventType("Some event type")
                .setDescription("Some event description")
                .build();
        responseObserver.onNext(event);
        // 模拟在1秒后发送第二个事件
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        event = ActivityEvent.newBuilder()
                .setEventType("Another event type")
                .setDescription("Another event description")
                .build();
        responseObserver.onNext(event);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AccessRequest> checkMultipleAccess(StreamObserver<AccessResponse> responseObserver) {
        // TODO: 实现 CheckMultipleAccess 方法逻辑
        return new StreamObserver<AccessRequest>() {
            @Override
            public void onNext(AccessRequest request) {
                boolean hasAccess = true; // 假设用户有访问权限
                AccessResponse response = AccessResponse.newBuilder().setHasAccess(hasAccess).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

}

package ds.SecurityService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SecurityClient {
    private final ManagedChannel channel;
    private final SecurityServiceGrpc.SecurityServiceBlockingStub blockingStub;
    private final SecurityServiceGrpc.SecurityServiceStub asyncStub;

    public SecurityClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = SecurityServiceGrpc.newBlockingStub(channel);
        asyncStub = SecurityServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void checkAccess(String userId, String roomId) {
        AccessRequest request = AccessRequest.newBuilder()
                .setUserId(userId)
                .setRoomId(roomId)
                .build();
        AccessResponse response = blockingStub.checkAccess(request);
        System.out.println("Has access: " + response.getHasAccess());
    }

    public void monitorRoomActivity(String userId, String roomId) throws InterruptedException {
        AccessRequest request = AccessRequest.newBuilder()
                .setUserId(userId)
                .setRoomId(roomId)
                .build();
        CountDownLatch latch = new CountDownLatch(1);
        asyncStub.monitorRoomActivity(request, new StreamObserver<ActivityEvent>() {
            @Override
            public void onNext(ActivityEvent event) {
                System.out.println("Received event: " + event.getEventType() + " - " + event.getDescription());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming completed");
                latch.countDown();
            }
        });
        latch.await();
    }

    public void checkMultipleAccess(String userId1, String roomId1, String userId2, String roomId2) {
        StreamObserver<AccessRequest> requestObserver = asyncStub.checkMultipleAccess(new StreamObserver<AccessResponse>() {
            @Override
            public void onNext(AccessResponse response) {
                System.out.println("Has access: " + response.getHasAccess());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming completed");
            }
        });

        requestObserver.onNext(AccessRequest.newBuilder()
                .setUserId(userId1)
                .setRoomId(roomId1)
                .build());
        requestObserver.onNext(AccessRequest.newBuilder()
                .setUserId(userId2)
                .setRoomId(roomId2)
                .build());
        requestObserver.onCompleted();
    }

    public static void main(String[] args) throws InterruptedException {
        SecurityClient client = new SecurityClient("localhost", 50053);

        // 调用 CheckAccess 方法
        client.checkAccess("user1", "room1");

        // 调用 MonitorRoomActivity 方法
        client.monitorRoomActivity("user1", "room1");

        // 调用 CheckMultipleAccess 方法
        client.checkMultipleAccess("user1", "room1", "user2", "room2");

        client.shutdown();
    }
}

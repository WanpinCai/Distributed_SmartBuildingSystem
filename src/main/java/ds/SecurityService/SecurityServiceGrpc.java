package ds.SecurityService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: security_service.proto")
public final class SecurityServiceGrpc {

  private SecurityServiceGrpc() {}

  public static final String SERVICE_NAME = "SecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.AccessResponse> getCheckAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckAccess",
      requestType = ds.SecurityService.AccessRequest.class,
      responseType = ds.SecurityService.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.AccessResponse> getCheckAccessMethod() {
    io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest, ds.SecurityService.AccessResponse> getCheckAccessMethod;
    if ((getCheckAccessMethod = SecurityServiceGrpc.getCheckAccessMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getCheckAccessMethod = SecurityServiceGrpc.getCheckAccessMethod) == null) {
          SecurityServiceGrpc.getCheckAccessMethod = getCheckAccessMethod = 
              io.grpc.MethodDescriptor.<ds.SecurityService.AccessRequest, ds.SecurityService.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SecurityService", "CheckAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.AccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.AccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("CheckAccess"))
                  .build();
          }
        }
     }
     return getCheckAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.ActivityEvent> getMonitorRoomActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorRoomActivity",
      requestType = ds.SecurityService.AccessRequest.class,
      responseType = ds.SecurityService.ActivityEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.ActivityEvent> getMonitorRoomActivityMethod() {
    io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest, ds.SecurityService.ActivityEvent> getMonitorRoomActivityMethod;
    if ((getMonitorRoomActivityMethod = SecurityServiceGrpc.getMonitorRoomActivityMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getMonitorRoomActivityMethod = SecurityServiceGrpc.getMonitorRoomActivityMethod) == null) {
          SecurityServiceGrpc.getMonitorRoomActivityMethod = getMonitorRoomActivityMethod = 
              io.grpc.MethodDescriptor.<ds.SecurityService.AccessRequest, ds.SecurityService.ActivityEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SecurityService", "MonitorRoomActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.AccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.ActivityEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("MonitorRoomActivity"))
                  .build();
          }
        }
     }
     return getMonitorRoomActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.AccessResponse> getCheckMultipleAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMultipleAccess",
      requestType = ds.SecurityService.AccessRequest.class,
      responseType = ds.SecurityService.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest,
      ds.SecurityService.AccessResponse> getCheckMultipleAccessMethod() {
    io.grpc.MethodDescriptor<ds.SecurityService.AccessRequest, ds.SecurityService.AccessResponse> getCheckMultipleAccessMethod;
    if ((getCheckMultipleAccessMethod = SecurityServiceGrpc.getCheckMultipleAccessMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getCheckMultipleAccessMethod = SecurityServiceGrpc.getCheckMultipleAccessMethod) == null) {
          SecurityServiceGrpc.getCheckMultipleAccessMethod = getCheckMultipleAccessMethod = 
              io.grpc.MethodDescriptor.<ds.SecurityService.AccessRequest, ds.SecurityService.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SecurityService", "CheckMultipleAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.AccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SecurityService.AccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("CheckMultipleAccess"))
                  .build();
          }
        }
     }
     return getCheckMultipleAccessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityServiceStub newStub(io.grpc.Channel channel) {
    return new SecurityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecurityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC method
     * </pre>
     */
    public void checkAccess(ds.SecurityService.AccessRequest request,
        io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC method
     * </pre>
     */
    public void monitorRoomActivity(ds.SecurityService.AccessRequest request,
        io.grpc.stub.StreamObserver<ds.SecurityService.ActivityEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorRoomActivityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.SecurityService.AccessRequest> checkMultipleAccess(
        io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckMultipleAccessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.SecurityService.AccessRequest,
                ds.SecurityService.AccessResponse>(
                  this, METHODID_CHECK_ACCESS)))
          .addMethod(
            getMonitorRoomActivityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.SecurityService.AccessRequest,
                ds.SecurityService.ActivityEvent>(
                  this, METHODID_MONITOR_ROOM_ACTIVITY)))
          .addMethod(
            getCheckMultipleAccessMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.SecurityService.AccessRequest,
                ds.SecurityService.AccessResponse>(
                  this, METHODID_CHECK_MULTIPLE_ACCESS)))
          .build();
    }
  }

  /**
   */
  public static final class SecurityServiceStub extends io.grpc.stub.AbstractStub<SecurityServiceStub> {
    private SecurityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC method
     * </pre>
     */
    public void checkAccess(ds.SecurityService.AccessRequest request,
        io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC method
     * </pre>
     */
    public void monitorRoomActivity(ds.SecurityService.AccessRequest request,
        io.grpc.stub.StreamObserver<ds.SecurityService.ActivityEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorRoomActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.SecurityService.AccessRequest> checkMultipleAccess(
        io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCheckMultipleAccessMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SecurityServiceBlockingStub extends io.grpc.stub.AbstractStub<SecurityServiceBlockingStub> {
    private SecurityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC method
     * </pre>
     */
    public ds.SecurityService.AccessResponse checkAccess(ds.SecurityService.AccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming RPC method
     * </pre>
     */
    public java.util.Iterator<ds.SecurityService.ActivityEvent> monitorRoomActivity(
        ds.SecurityService.AccessRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorRoomActivityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecurityServiceFutureStub extends io.grpc.stub.AbstractStub<SecurityServiceFutureStub> {
    private SecurityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.SecurityService.AccessResponse> checkAccess(
        ds.SecurityService.AccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_ACCESS = 0;
  private static final int METHODID_MONITOR_ROOM_ACTIVITY = 1;
  private static final int METHODID_CHECK_MULTIPLE_ACCESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_ACCESS:
          serviceImpl.checkAccess((ds.SecurityService.AccessRequest) request,
              (io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse>) responseObserver);
          break;
        case METHODID_MONITOR_ROOM_ACTIVITY:
          serviceImpl.monitorRoomActivity((ds.SecurityService.AccessRequest) request,
              (io.grpc.stub.StreamObserver<ds.SecurityService.ActivityEvent>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_MULTIPLE_ACCESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkMultipleAccess(
              (io.grpc.stub.StreamObserver<ds.SecurityService.AccessResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.SecurityService.SecurityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityService");
    }
  }

  private static final class SecurityServiceFileDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier {
    SecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityServiceMethodDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityServiceFileDescriptorSupplier())
              .addMethod(getCheckAccessMethod())
              .addMethod(getMonitorRoomActivityMethod())
              .addMethod(getCheckMultipleAccessMethod())
              .build();
        }
      }
    }
    return result;
  }
}

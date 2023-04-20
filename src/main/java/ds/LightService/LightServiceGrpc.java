package ds.LightService;

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
    comments = "Source: lightingService.proto")
public final class LightServiceGrpc {

  private LightServiceGrpc() {}

  public static final String SERVICE_NAME = "LightService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.Empty> getTurnOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnOff",
      requestType = ds.LightService.LightRequest.class,
      responseType = ds.LightService.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.Empty> getTurnOnOffMethod() {
    io.grpc.MethodDescriptor<ds.LightService.LightRequest, ds.LightService.Empty> getTurnOnOffMethod;
    if ((getTurnOnOffMethod = LightServiceGrpc.getTurnOnOffMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getTurnOnOffMethod = LightServiceGrpc.getTurnOnOffMethod) == null) {
          LightServiceGrpc.getTurnOnOffMethod = getTurnOnOffMethod = 
              io.grpc.MethodDescriptor.<ds.LightService.LightRequest, ds.LightService.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LightService", "turnOnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("turnOnOff"))
                  .build();
          }
        }
     }
     return getTurnOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.LightResponse> getGetCurrentBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentBrightness",
      requestType = ds.LightService.LightRequest.class,
      responseType = ds.LightService.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.LightResponse> getGetCurrentBrightnessMethod() {
    io.grpc.MethodDescriptor<ds.LightService.LightRequest, ds.LightService.LightResponse> getGetCurrentBrightnessMethod;
    if ((getGetCurrentBrightnessMethod = LightServiceGrpc.getGetCurrentBrightnessMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getGetCurrentBrightnessMethod = LightServiceGrpc.getGetCurrentBrightnessMethod) == null) {
          LightServiceGrpc.getGetCurrentBrightnessMethod = getGetCurrentBrightnessMethod = 
              io.grpc.MethodDescriptor.<ds.LightService.LightRequest, ds.LightService.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LightService", "getCurrentBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("getCurrentBrightness"))
                  .build();
          }
        }
     }
     return getGetCurrentBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.LightResponse> getSetBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBrightness",
      requestType = ds.LightService.LightRequest.class,
      responseType = ds.LightService.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.LightService.LightRequest,
      ds.LightService.LightResponse> getSetBrightnessMethod() {
    io.grpc.MethodDescriptor<ds.LightService.LightRequest, ds.LightService.LightResponse> getSetBrightnessMethod;
    if ((getSetBrightnessMethod = LightServiceGrpc.getSetBrightnessMethod) == null) {
      synchronized (LightServiceGrpc.class) {
        if ((getSetBrightnessMethod = LightServiceGrpc.getSetBrightnessMethod) == null) {
          LightServiceGrpc.getSetBrightnessMethod = getSetBrightnessMethod = 
              io.grpc.MethodDescriptor.<ds.LightService.LightRequest, ds.LightService.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LightService", "setBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.LightService.LightResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightServiceMethodDescriptorSupplier("setBrightness"))
                  .build();
          }
        }
     }
     return getSetBrightnessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightServiceStub newStub(io.grpc.Channel channel) {
    return new LightServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC Method to turn on or off the light
     * </pre>
     */
    public void turnOnOff(ds.LightService.LightRequest request,
        io.grpc.stub.StreamObserver<ds.LightService.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnOffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC Method to get current brightness value
     * </pre>
     */
    public void getCurrentBrightness(ds.LightService.LightRequest request,
        io.grpc.stub.StreamObserver<ds.LightService.LightResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentBrightnessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC Method to set brightness value
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.LightService.LightRequest> setBrightness(
        io.grpc.stub.StreamObserver<ds.LightService.LightResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetBrightnessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.LightService.LightRequest,
                ds.LightService.Empty>(
                  this, METHODID_TURN_ON_OFF)))
          .addMethod(
            getGetCurrentBrightnessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.LightService.LightRequest,
                ds.LightService.LightResponse>(
                  this, METHODID_GET_CURRENT_BRIGHTNESS)))
          .addMethod(
            getSetBrightnessMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.LightService.LightRequest,
                ds.LightService.LightResponse>(
                  this, METHODID_SET_BRIGHTNESS)))
          .build();
    }
  }

  /**
   */
  public static final class LightServiceStub extends io.grpc.stub.AbstractStub<LightServiceStub> {
    private LightServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method to turn on or off the light
     * </pre>
     */
    public void turnOnOff(ds.LightService.LightRequest request,
        io.grpc.stub.StreamObserver<ds.LightService.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC Method to get current brightness value
     * </pre>
     */
    public void getCurrentBrightness(ds.LightService.LightRequest request,
        io.grpc.stub.StreamObserver<ds.LightService.LightResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC Method to set brightness value
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.LightService.LightRequest> setBrightness(
        io.grpc.stub.StreamObserver<ds.LightService.LightResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSetBrightnessMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class LightServiceBlockingStub extends io.grpc.stub.AbstractStub<LightServiceBlockingStub> {
    private LightServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method to turn on or off the light
     * </pre>
     */
    public ds.LightService.Empty turnOnOff(ds.LightService.LightRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnOffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming RPC Method to get current brightness value
     * </pre>
     */
    public java.util.Iterator<ds.LightService.LightResponse> getCurrentBrightness(
        ds.LightService.LightRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrentBrightnessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightServiceFutureStub extends io.grpc.stub.AbstractStub<LightServiceFutureStub> {
    private LightServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method to turn on or off the light
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.LightService.Empty> turnOnOff(
        ds.LightService.LightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_OFF = 0;
  private static final int METHODID_GET_CURRENT_BRIGHTNESS = 1;
  private static final int METHODID_SET_BRIGHTNESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_OFF:
          serviceImpl.turnOnOff((ds.LightService.LightRequest) request,
              (io.grpc.stub.StreamObserver<ds.LightService.Empty>) responseObserver);
          break;
        case METHODID_GET_CURRENT_BRIGHTNESS:
          serviceImpl.getCurrentBrightness((ds.LightService.LightRequest) request,
              (io.grpc.stub.StreamObserver<ds.LightService.LightResponse>) responseObserver);
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
        case METHODID_SET_BRIGHTNESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setBrightness(
              (io.grpc.stub.StreamObserver<ds.LightService.LightResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.LightService.LightServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightService");
    }
  }

  private static final class LightServiceFileDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier {
    LightServiceFileDescriptorSupplier() {}
  }

  private static final class LightServiceMethodDescriptorSupplier
      extends LightServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightServiceFileDescriptorSupplier())
              .addMethod(getTurnOnOffMethod())
              .addMethod(getGetCurrentBrightnessMethod())
              .addMethod(getSetBrightnessMethod())
              .build();
        }
      }
    }
    return result;
  }
}

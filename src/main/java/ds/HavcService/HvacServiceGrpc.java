package ds.HavcService;

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
    comments = "Source: HAVC_service.proto")
public final class HvacServiceGrpc {

  private HvacServiceGrpc() {}

  public static final String SERVICE_NAME = "HvacService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest,
      ds.HavcService.ConfirmationMessage> getSetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setTemperature",
      requestType = ds.HavcService.TemperatureRequest.class,
      responseType = ds.HavcService.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest,
      ds.HavcService.ConfirmationMessage> getSetTemperatureMethod() {
    io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest, ds.HavcService.ConfirmationMessage> getSetTemperatureMethod;
    if ((getSetTemperatureMethod = HvacServiceGrpc.getSetTemperatureMethod) == null) {
      synchronized (HvacServiceGrpc.class) {
        if ((getSetTemperatureMethod = HvacServiceGrpc.getSetTemperatureMethod) == null) {
          HvacServiceGrpc.getSetTemperatureMethod = getSetTemperatureMethod = 
              io.grpc.MethodDescriptor.<ds.HavcService.TemperatureRequest, ds.HavcService.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HvacService", "setTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.ConfirmationMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new HvacServiceMethodDescriptorSupplier("setTemperature"))
                  .build();
          }
        }
     }
     return getSetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest,
      ds.HavcService.TemperatureValue> getGetTemperatureStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTemperatureStream",
      requestType = ds.HavcService.TemperatureRequest.class,
      responseType = ds.HavcService.TemperatureValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest,
      ds.HavcService.TemperatureValue> getGetTemperatureStreamMethod() {
    io.grpc.MethodDescriptor<ds.HavcService.TemperatureRequest, ds.HavcService.TemperatureValue> getGetTemperatureStreamMethod;
    if ((getGetTemperatureStreamMethod = HvacServiceGrpc.getGetTemperatureStreamMethod) == null) {
      synchronized (HvacServiceGrpc.class) {
        if ((getGetTemperatureStreamMethod = HvacServiceGrpc.getGetTemperatureStreamMethod) == null) {
          HvacServiceGrpc.getGetTemperatureStreamMethod = getGetTemperatureStreamMethod = 
              io.grpc.MethodDescriptor.<ds.HavcService.TemperatureRequest, ds.HavcService.TemperatureValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "HvacService", "getTemperatureStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.TemperatureValue.getDefaultInstance()))
                  .setSchemaDescriptor(new HvacServiceMethodDescriptorSupplier("getTemperatureStream"))
                  .build();
          }
        }
     }
     return getGetTemperatureStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.HavcService.TemperatureValue,
      ds.HavcService.TemperatureValue> getControlTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "controlTemperature",
      requestType = ds.HavcService.TemperatureValue.class,
      responseType = ds.HavcService.TemperatureValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.HavcService.TemperatureValue,
      ds.HavcService.TemperatureValue> getControlTemperatureMethod() {
    io.grpc.MethodDescriptor<ds.HavcService.TemperatureValue, ds.HavcService.TemperatureValue> getControlTemperatureMethod;
    if ((getControlTemperatureMethod = HvacServiceGrpc.getControlTemperatureMethod) == null) {
      synchronized (HvacServiceGrpc.class) {
        if ((getControlTemperatureMethod = HvacServiceGrpc.getControlTemperatureMethod) == null) {
          HvacServiceGrpc.getControlTemperatureMethod = getControlTemperatureMethod = 
              io.grpc.MethodDescriptor.<ds.HavcService.TemperatureValue, ds.HavcService.TemperatureValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "HvacService", "controlTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.TemperatureValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.HavcService.TemperatureValue.getDefaultInstance()))
                  .setSchemaDescriptor(new HvacServiceMethodDescriptorSupplier("controlTemperature"))
                  .build();
          }
        }
     }
     return getControlTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HvacServiceStub newStub(io.grpc.Channel channel) {
    return new HvacServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HvacServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HvacServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HvacServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HvacServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HvacServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC Method
     * </pre>
     */
    public void setTemperature(ds.HavcService.TemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.HavcService.ConfirmationMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC Method
     * </pre>
     */
    public void getTemperatureStream(ds.HavcService.TemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> responseObserver) throws InterruptedException {
      asyncUnimplementedUnaryCall(getGetTemperatureStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC Method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> controlTemperature(
        io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> responseObserver) {
      return asyncUnimplementedStreamingCall(getControlTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.HavcService.TemperatureRequest,
                ds.HavcService.ConfirmationMessage>(
                  this, METHODID_SET_TEMPERATURE)))
          .addMethod(
            getGetTemperatureStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.HavcService.TemperatureRequest,
                ds.HavcService.TemperatureValue>(
                  this, METHODID_GET_TEMPERATURE_STREAM)))
          .addMethod(
            getControlTemperatureMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.HavcService.TemperatureValue,
                ds.HavcService.TemperatureValue>(
                  this, METHODID_CONTROL_TEMPERATURE)))
          .build();
    }
  }

  /**
   */
  public static final class HvacServiceStub extends io.grpc.stub.AbstractStub<HvacServiceStub> {
    private HvacServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HvacServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HvacServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HvacServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method
     * </pre>
     */
    public void setTemperature(ds.HavcService.TemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.HavcService.ConfirmationMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming RPC Method
     * </pre>
     */
    public void getTemperatureStream(ds.HavcService.TemperatureRequest request,
        io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetTemperatureStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC Method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> controlTemperature(
        io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getControlTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HvacServiceBlockingStub extends io.grpc.stub.AbstractStub<HvacServiceBlockingStub> {
    private HvacServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HvacServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HvacServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HvacServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method
     * </pre>
     */
    public ds.HavcService.ConfirmationMessage setTemperature(ds.HavcService.TemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming RPC Method
     * </pre>
     */
    public java.util.Iterator<ds.HavcService.TemperatureValue> getTemperatureStream(
        ds.HavcService.TemperatureRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetTemperatureStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HvacServiceFutureStub extends io.grpc.stub.AbstractStub<HvacServiceFutureStub> {
    private HvacServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HvacServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HvacServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HvacServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC Method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.HavcService.ConfirmationMessage> setTemperature(
        ds.HavcService.TemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_TEMPERATURE = 0;
  private static final int METHODID_GET_TEMPERATURE_STREAM = 1;
  private static final int METHODID_CONTROL_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HvacServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HvacServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_TEMPERATURE:
          serviceImpl.setTemperature((ds.HavcService.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<ds.HavcService.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_GET_TEMPERATURE_STREAM:
          try {
            serviceImpl.getTemperatureStream((TemperatureRequest) request,
                (io.grpc.stub.StreamObserver<TemperatureValue>) responseObserver);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
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
        case METHODID_CONTROL_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.controlTemperature(
              (io.grpc.stub.StreamObserver<ds.HavcService.TemperatureValue>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HvacServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HvacServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.HavcService.HavcServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HvacService");
    }
  }

  private static final class HvacServiceFileDescriptorSupplier
      extends HvacServiceBaseDescriptorSupplier {
    HvacServiceFileDescriptorSupplier() {}
  }

  private static final class HvacServiceMethodDescriptorSupplier
      extends HvacServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HvacServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HvacServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HvacServiceFileDescriptorSupplier())
              .addMethod(getSetTemperatureMethod())
              .addMethod(getGetTemperatureStreamMethod())
              .addMethod(getControlTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}

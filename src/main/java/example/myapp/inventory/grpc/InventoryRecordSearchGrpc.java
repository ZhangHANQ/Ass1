package example.myapp.inventory.grpc;

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
    comments = "Source: inventory.proto")
public final class InventoryRecordSearchGrpc {

  private InventoryRecordSearchGrpc() {}

  public static final String SERVICE_NAME = "inventory.InventoryRecordSearch";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<example.myapp.inventory.grpc.InventoryRequest,
      example.myapp.inventory.grpc.InventoryReply> getReSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReSearch",
      requestType = example.myapp.inventory.grpc.InventoryRequest.class,
      responseType = example.myapp.inventory.grpc.InventoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<example.myapp.inventory.grpc.InventoryRequest,
      example.myapp.inventory.grpc.InventoryReply> getReSearchMethod() {
    io.grpc.MethodDescriptor<example.myapp.inventory.grpc.InventoryRequest, example.myapp.inventory.grpc.InventoryReply> getReSearchMethod;
    if ((getReSearchMethod = InventoryRecordSearchGrpc.getReSearchMethod) == null) {
      synchronized (InventoryRecordSearchGrpc.class) {
        if ((getReSearchMethod = InventoryRecordSearchGrpc.getReSearchMethod) == null) {
          InventoryRecordSearchGrpc.getReSearchMethod = getReSearchMethod = 
              io.grpc.MethodDescriptor.<example.myapp.inventory.grpc.InventoryRequest, example.myapp.inventory.grpc.InventoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventory.InventoryRecordSearch", "ReSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.InventoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  example.myapp.inventory.grpc.InventoryReply.getDefaultInstance()))
                  .setSchemaDescriptor(new InventoryRecordSearchMethodDescriptorSupplier("ReSearch"))
                  .build();
          }
        }
     }
     return getReSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryRecordSearchStub newStub(io.grpc.Channel channel) {
    return new InventoryRecordSearchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryRecordSearchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryRecordSearchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryRecordSearchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryRecordSearchFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryRecordSearchImplBase implements io.grpc.BindableService {

    /**
     */
    public void reSearch(example.myapp.inventory.grpc.InventoryRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.InventoryReply> responseObserver) {
      asyncUnimplementedUnaryCall(getReSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                example.myapp.inventory.grpc.InventoryRequest,
                example.myapp.inventory.grpc.InventoryReply>(
                  this, METHODID_RE_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryRecordSearchStub extends io.grpc.stub.AbstractStub<InventoryRecordSearchStub> {
    private InventoryRecordSearchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryRecordSearchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRecordSearchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryRecordSearchStub(channel, callOptions);
    }

    /**
     */
    public void reSearch(example.myapp.inventory.grpc.InventoryRequest request,
        io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.InventoryReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryRecordSearchBlockingStub extends io.grpc.stub.AbstractStub<InventoryRecordSearchBlockingStub> {
    private InventoryRecordSearchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryRecordSearchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRecordSearchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryRecordSearchBlockingStub(channel, callOptions);
    }

    /**
     */
    public example.myapp.inventory.grpc.InventoryReply reSearch(example.myapp.inventory.grpc.InventoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getReSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryRecordSearchFutureStub extends io.grpc.stub.AbstractStub<InventoryRecordSearchFutureStub> {
    private InventoryRecordSearchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryRecordSearchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryRecordSearchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryRecordSearchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<example.myapp.inventory.grpc.InventoryReply> reSearch(
        example.myapp.inventory.grpc.InventoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RE_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryRecordSearchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryRecordSearchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RE_SEARCH:
          serviceImpl.reSearch((example.myapp.inventory.grpc.InventoryRequest) request,
              (io.grpc.stub.StreamObserver<example.myapp.inventory.grpc.InventoryReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InventoryRecordSearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryRecordSearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return example.myapp.inventory.grpc.InventoryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryRecordSearch");
    }
  }

  private static final class InventoryRecordSearchFileDescriptorSupplier
      extends InventoryRecordSearchBaseDescriptorSupplier {
    InventoryRecordSearchFileDescriptorSupplier() {}
  }

  private static final class InventoryRecordSearchMethodDescriptorSupplier
      extends InventoryRecordSearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryRecordSearchMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryRecordSearchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryRecordSearchFileDescriptorSupplier())
              .addMethod(getReSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}

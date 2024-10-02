package dk.via.slaughterhouse;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: slaughterhouse.proto")
public final class SlaughterhouseServiceGrpc {

  private SlaughterhouseServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.SlaughterhouseService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.Animal,
      dk.via.slaughterhouse.Animal> METHOD_REGISTER_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.Animal, dk.via.slaughterhouse.Animal>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "registerAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.Animal.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.Animal.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.ProductId,
      dk.via.slaughterhouse.AnimalListResponse> METHOD_GET_ANIMALS_IN_PRODUCT =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.ProductId, dk.via.slaughterhouse.AnimalListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "getAnimalsInProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalId,
      dk.via.slaughterhouse.ProductListResponse> METHOD_GET_PRODUCTS_BY_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalId, dk.via.slaughterhouse.ProductListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "getProductsByAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductListResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseServiceStub newStub(io.grpc.Channel channel) {
    return new SlaughterhouseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SlaughterhouseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SlaughterhouseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SlaughterhouseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerAnimal(dk.via.slaughterhouse.Animal request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.Animal> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_ANIMAL, responseObserver);
    }

    /**
     */
    public void getAnimalsInProduct(dk.via.slaughterhouse.ProductId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMALS_IN_PRODUCT, responseObserver);
    }

    /**
     */
    public void getProductsByAnimal(dk.via.slaughterhouse.AnimalId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_BY_ANIMAL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.Animal,
                dk.via.slaughterhouse.Animal>(
                  this, METHODID_REGISTER_ANIMAL)))
          .addMethod(
            METHOD_GET_ANIMALS_IN_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.ProductId,
                dk.via.slaughterhouse.AnimalListResponse>(
                  this, METHODID_GET_ANIMALS_IN_PRODUCT)))
          .addMethod(
            METHOD_GET_PRODUCTS_BY_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalId,
                dk.via.slaughterhouse.ProductListResponse>(
                  this, METHODID_GET_PRODUCTS_BY_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterhouseServiceStub extends io.grpc.stub.AbstractStub<SlaughterhouseServiceStub> {
    private SlaughterhouseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterhouseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterhouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerAnimal(dk.via.slaughterhouse.Animal request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.Animal> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsInProduct(dk.via.slaughterhouse.ProductId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_IN_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductsByAnimal(dk.via.slaughterhouse.AnimalId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_ANIMAL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterhouseServiceBlockingStub extends io.grpc.stub.AbstractStub<SlaughterhouseServiceBlockingStub> {
    private SlaughterhouseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterhouseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterhouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.Animal registerAnimal(dk.via.slaughterhouse.Animal request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.AnimalListResponse getAnimalsInProduct(dk.via.slaughterhouse.ProductId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMALS_IN_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.ProductListResponse getProductsByAnimal(dk.via.slaughterhouse.AnimalId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_BY_ANIMAL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterhouseServiceFutureStub extends io.grpc.stub.AbstractStub<SlaughterhouseServiceFutureStub> {
    private SlaughterhouseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SlaughterhouseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SlaughterhouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.Animal> registerAnimal(
        dk.via.slaughterhouse.Animal request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalListResponse> getAnimalsInProduct(
        dk.via.slaughterhouse.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMALS_IN_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.ProductListResponse> getProductsByAnimal(
        dk.via.slaughterhouse.AnimalId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_ANIMAL, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ANIMAL = 0;
  private static final int METHODID_GET_ANIMALS_IN_PRODUCT = 1;
  private static final int METHODID_GET_PRODUCTS_BY_ANIMAL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterhouseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterhouseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ANIMAL:
          serviceImpl.registerAnimal((dk.via.slaughterhouse.Animal) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.Animal>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_IN_PRODUCT:
          serviceImpl.getAnimalsInProduct((dk.via.slaughterhouse.ProductId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalListResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_ANIMAL:
          serviceImpl.getProductsByAnimal((dk.via.slaughterhouse.AnimalId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductListResponse>) responseObserver);
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

  private static final class SlaughterhouseServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.Slaughterhouse.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterhouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseServiceDescriptorSupplier())
              .addMethod(METHOD_REGISTER_ANIMAL)
              .addMethod(METHOD_GET_ANIMALS_IN_PRODUCT)
              .addMethod(METHOD_GET_PRODUCTS_BY_ANIMAL)
              .build();
        }
      }
    }
    return result;
  }
}

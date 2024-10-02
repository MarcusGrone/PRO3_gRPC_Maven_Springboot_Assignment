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
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalData,
      dk.via.slaughterhouse.AnimalData> METHOD_REGISTER_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalData, dk.via.slaughterhouse.AnimalData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "registerAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalPartData,
      dk.via.slaughterhouse.AnimalPartData> METHOD_REGISTER_ANIMAL_PART =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalPartData, dk.via.slaughterhouse.AnimalPartData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "registerAnimalPart"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.ProductData,
      dk.via.slaughterhouse.ProductData> METHOD_REGISTER_PRODUCT =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.ProductData, dk.via.slaughterhouse.ProductData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "registerProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalId,
      dk.via.slaughterhouse.AnimalData> METHOD_READ_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalId, dk.via.slaughterhouse.AnimalData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "readAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalPartId,
      dk.via.slaughterhouse.AnimalPartData> METHOD_READ_ANIMAL_PART =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalPartId, dk.via.slaughterhouse.AnimalPartData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "readAnimalPart"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.ProductId,
      dk.via.slaughterhouse.ProductData> METHOD_READ_PRODUCT =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.ProductId, dk.via.slaughterhouse.ProductData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "readProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.PartTypeId,
      dk.via.slaughterhouse.PartTypeData> METHOD_READ_PART_TYPE =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.PartTypeId, dk.via.slaughterhouse.PartTypeData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "readPartType"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.PartTypeId.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.PartTypeData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_UPDATE_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "updateAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalPartData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_UPDATE_ANIMAL_PART =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalPartData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "updateAnimalPart"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.ProductData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.ProductData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "updateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_REMOVE_ANIMAL =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "removeAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.AnimalPartData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_REMOVE_ANIMAL_PART =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.AnimalPartData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "removeAnimalPart"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.ProductData,
      dk.via.slaughterhouse.EmptyMessage> METHOD_REMOVE_PRODUCT =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.ProductData, dk.via.slaughterhouse.EmptyMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "removeProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.EmptyMessage,
      dk.via.slaughterhouse.AnimalsData> METHOD_GET_ALL_ANIMALS =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.EmptyMessage, dk.via.slaughterhouse.AnimalsData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "getAllAnimals"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalsData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.EmptyMessage,
      dk.via.slaughterhouse.AnimalPartsData> METHOD_GET_ANIMAL_PARTS =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.EmptyMessage, dk.via.slaughterhouse.AnimalPartsData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "getAnimalParts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.AnimalPartsData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<dk.via.slaughterhouse.EmptyMessage,
      dk.via.slaughterhouse.ProductsData> METHOD_GET_ALL_PRODUCTS =
      io.grpc.MethodDescriptor.<dk.via.slaughterhouse.EmptyMessage, dk.via.slaughterhouse.ProductsData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "dk.via.slaughterhouse.SlaughterhouseService", "getAllProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.EmptyMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              dk.via.slaughterhouse.ProductsData.getDefaultInstance()))
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
     * <pre>
     * Create:
     * </pre>
     */
    public void registerAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_ANIMAL, responseObserver);
    }

    /**
     */
    public void registerAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_ANIMAL_PART, responseObserver);
    }

    /**
     */
    public void registerProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_PRODUCT, responseObserver);
    }

    /**
     * <pre>
     * Read:
     * </pre>
     */
    public void readAnimal(dk.via.slaughterhouse.AnimalId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_ANIMAL, responseObserver);
    }

    /**
     */
    public void readAnimalPart(dk.via.slaughterhouse.AnimalPartId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_ANIMAL_PART, responseObserver);
    }

    /**
     */
    public void readProduct(dk.via.slaughterhouse.ProductId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_PRODUCT, responseObserver);
    }

    /**
     */
    public void readPartType(dk.via.slaughterhouse.PartTypeId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.PartTypeData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ_PART_TYPE, responseObserver);
    }

    /**
     * <pre>
     * Update:
     * </pre>
     */
    public void updateAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ANIMAL, responseObserver);
    }

    /**
     */
    public void updateAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ANIMAL_PART, responseObserver);
    }

    /**
     */
    public void updateProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    /**
     * <pre>
     * Delete:
     * </pre>
     */
    public void removeAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_ANIMAL, responseObserver);
    }

    /**
     */
    public void removeAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_ANIMAL_PART, responseObserver);
    }

    /**
     */
    public void removeProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_PRODUCT, responseObserver);
    }

    /**
     * <pre>
     * Get All:
     * </pre>
     */
    public void getAllAnimals(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalsData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_ANIMALS, responseObserver);
    }

    /**
     */
    public void getAnimalParts(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartsData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMAL_PARTS, responseObserver);
    }

    /**
     */
    public void getAllProducts(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductsData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_PRODUCTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalData,
                dk.via.slaughterhouse.AnimalData>(
                  this, METHODID_REGISTER_ANIMAL)))
          .addMethod(
            METHOD_REGISTER_ANIMAL_PART,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalPartData,
                dk.via.slaughterhouse.AnimalPartData>(
                  this, METHODID_REGISTER_ANIMAL_PART)))
          .addMethod(
            METHOD_REGISTER_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.ProductData,
                dk.via.slaughterhouse.ProductData>(
                  this, METHODID_REGISTER_PRODUCT)))
          .addMethod(
            METHOD_READ_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalId,
                dk.via.slaughterhouse.AnimalData>(
                  this, METHODID_READ_ANIMAL)))
          .addMethod(
            METHOD_READ_ANIMAL_PART,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalPartId,
                dk.via.slaughterhouse.AnimalPartData>(
                  this, METHODID_READ_ANIMAL_PART)))
          .addMethod(
            METHOD_READ_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.ProductId,
                dk.via.slaughterhouse.ProductData>(
                  this, METHODID_READ_PRODUCT)))
          .addMethod(
            METHOD_READ_PART_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.PartTypeId,
                dk.via.slaughterhouse.PartTypeData>(
                  this, METHODID_READ_PART_TYPE)))
          .addMethod(
            METHOD_UPDATE_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            METHOD_UPDATE_ANIMAL_PART,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalPartData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_UPDATE_ANIMAL_PART)))
          .addMethod(
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.ProductData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            METHOD_REMOVE_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_REMOVE_ANIMAL)))
          .addMethod(
            METHOD_REMOVE_ANIMAL_PART,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.AnimalPartData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_REMOVE_ANIMAL_PART)))
          .addMethod(
            METHOD_REMOVE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.ProductData,
                dk.via.slaughterhouse.EmptyMessage>(
                  this, METHODID_REMOVE_PRODUCT)))
          .addMethod(
            METHOD_GET_ALL_ANIMALS,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.EmptyMessage,
                dk.via.slaughterhouse.AnimalsData>(
                  this, METHODID_GET_ALL_ANIMALS)))
          .addMethod(
            METHOD_GET_ANIMAL_PARTS,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.EmptyMessage,
                dk.via.slaughterhouse.AnimalPartsData>(
                  this, METHODID_GET_ANIMAL_PARTS)))
          .addMethod(
            METHOD_GET_ALL_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.EmptyMessage,
                dk.via.slaughterhouse.ProductsData>(
                  this, METHODID_GET_ALL_PRODUCTS)))
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
     * <pre>
     * Create:
     * </pre>
     */
    public void registerAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL_PART, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read:
     * </pre>
     */
    public void readAnimal(dk.via.slaughterhouse.AnimalId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAnimalPart(dk.via.slaughterhouse.AnimalPartId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_ANIMAL_PART, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readProduct(dk.via.slaughterhouse.ProductId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readPartType(dk.via.slaughterhouse.PartTypeId request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.PartTypeData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ_PART_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update:
     * </pre>
     */
    public void updateAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL_PART, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete:
     * </pre>
     */
    public void removeAnimal(dk.via.slaughterhouse.AnimalData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeAnimalPart(dk.via.slaughterhouse.AnimalPartData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_ANIMAL_PART, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeProduct(dk.via.slaughterhouse.ProductData request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get All:
     * </pre>
     */
    public void getAllAnimals(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalsData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ANIMALS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalParts(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartsData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_PARTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProducts(dk.via.slaughterhouse.EmptyMessage request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductsData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request, responseObserver);
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
     * <pre>
     * Create:
     * </pre>
     */
    public dk.via.slaughterhouse.AnimalData registerAnimal(dk.via.slaughterhouse.AnimalData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.AnimalPartData registerAnimalPart(dk.via.slaughterhouse.AnimalPartData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_ANIMAL_PART, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.ProductData registerProduct(dk.via.slaughterhouse.ProductData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_PRODUCT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Read:
     * </pre>
     */
    public dk.via.slaughterhouse.AnimalData readAnimal(dk.via.slaughterhouse.AnimalId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.AnimalPartData readAnimalPart(dk.via.slaughterhouse.AnimalPartId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_ANIMAL_PART, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.ProductData readProduct(dk.via.slaughterhouse.ProductId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.PartTypeData readPartType(dk.via.slaughterhouse.PartTypeId request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ_PART_TYPE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update:
     * </pre>
     */
    public dk.via.slaughterhouse.EmptyMessage updateAnimal(dk.via.slaughterhouse.AnimalData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.EmptyMessage updateAnimalPart(dk.via.slaughterhouse.AnimalPartData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ANIMAL_PART, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.EmptyMessage updateProduct(dk.via.slaughterhouse.ProductData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete:
     * </pre>
     */
    public dk.via.slaughterhouse.EmptyMessage removeAnimal(dk.via.slaughterhouse.AnimalData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.EmptyMessage removeAnimalPart(dk.via.slaughterhouse.AnimalPartData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_ANIMAL_PART, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.EmptyMessage removeProduct(dk.via.slaughterhouse.ProductData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_PRODUCT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Get All:
     * </pre>
     */
    public dk.via.slaughterhouse.AnimalsData getAllAnimals(dk.via.slaughterhouse.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_ANIMALS, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.AnimalPartsData getAnimalParts(dk.via.slaughterhouse.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMAL_PARTS, getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.ProductsData getAllProducts(dk.via.slaughterhouse.EmptyMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_PRODUCTS, getCallOptions(), request);
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
     * <pre>
     * Create:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalData> registerAnimal(
        dk.via.slaughterhouse.AnimalData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalPartData> registerAnimalPart(
        dk.via.slaughterhouse.AnimalPartData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_ANIMAL_PART, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.ProductData> registerProduct(
        dk.via.slaughterhouse.ProductData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_PRODUCT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Read:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalData> readAnimal(
        dk.via.slaughterhouse.AnimalId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalPartData> readAnimalPart(
        dk.via.slaughterhouse.AnimalPartId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_ANIMAL_PART, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.ProductData> readProduct(
        dk.via.slaughterhouse.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.PartTypeData> readPartType(
        dk.via.slaughterhouse.PartTypeId request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ_PART_TYPE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> updateAnimal(
        dk.via.slaughterhouse.AnimalData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> updateAnimalPart(
        dk.via.slaughterhouse.AnimalPartData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ANIMAL_PART, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> updateProduct(
        dk.via.slaughterhouse.ProductData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> removeAnimal(
        dk.via.slaughterhouse.AnimalData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> removeAnimalPart(
        dk.via.slaughterhouse.AnimalPartData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_ANIMAL_PART, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.EmptyMessage> removeProduct(
        dk.via.slaughterhouse.ProductData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_PRODUCT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Get All:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalsData> getAllAnimals(
        dk.via.slaughterhouse.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_ANIMALS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.AnimalPartsData> getAnimalParts(
        dk.via.slaughterhouse.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_PARTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.ProductsData> getAllProducts(
        dk.via.slaughterhouse.EmptyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PRODUCTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ANIMAL = 0;
  private static final int METHODID_REGISTER_ANIMAL_PART = 1;
  private static final int METHODID_REGISTER_PRODUCT = 2;
  private static final int METHODID_READ_ANIMAL = 3;
  private static final int METHODID_READ_ANIMAL_PART = 4;
  private static final int METHODID_READ_PRODUCT = 5;
  private static final int METHODID_READ_PART_TYPE = 6;
  private static final int METHODID_UPDATE_ANIMAL = 7;
  private static final int METHODID_UPDATE_ANIMAL_PART = 8;
  private static final int METHODID_UPDATE_PRODUCT = 9;
  private static final int METHODID_REMOVE_ANIMAL = 10;
  private static final int METHODID_REMOVE_ANIMAL_PART = 11;
  private static final int METHODID_REMOVE_PRODUCT = 12;
  private static final int METHODID_GET_ALL_ANIMALS = 13;
  private static final int METHODID_GET_ANIMAL_PARTS = 14;
  private static final int METHODID_GET_ALL_PRODUCTS = 15;

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
          serviceImpl.registerAnimal((dk.via.slaughterhouse.AnimalData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData>) responseObserver);
          break;
        case METHODID_REGISTER_ANIMAL_PART:
          serviceImpl.registerAnimalPart((dk.via.slaughterhouse.AnimalPartData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData>) responseObserver);
          break;
        case METHODID_REGISTER_PRODUCT:
          serviceImpl.registerProduct((dk.via.slaughterhouse.ProductData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData>) responseObserver);
          break;
        case METHODID_READ_ANIMAL:
          serviceImpl.readAnimal((dk.via.slaughterhouse.AnimalId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalData>) responseObserver);
          break;
        case METHODID_READ_ANIMAL_PART:
          serviceImpl.readAnimalPart((dk.via.slaughterhouse.AnimalPartId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartData>) responseObserver);
          break;
        case METHODID_READ_PRODUCT:
          serviceImpl.readProduct((dk.via.slaughterhouse.ProductId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductData>) responseObserver);
          break;
        case METHODID_READ_PART_TYPE:
          serviceImpl.readPartType((dk.via.slaughterhouse.PartTypeId) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.PartTypeData>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((dk.via.slaughterhouse.AnimalData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL_PART:
          serviceImpl.updateAnimalPart((dk.via.slaughterhouse.AnimalPartData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((dk.via.slaughterhouse.ProductData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_REMOVE_ANIMAL:
          serviceImpl.removeAnimal((dk.via.slaughterhouse.AnimalData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_REMOVE_ANIMAL_PART:
          serviceImpl.removeAnimalPart((dk.via.slaughterhouse.AnimalPartData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_REMOVE_PRODUCT:
          serviceImpl.removeProduct((dk.via.slaughterhouse.ProductData) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.EmptyMessage>) responseObserver);
          break;
        case METHODID_GET_ALL_ANIMALS:
          serviceImpl.getAllAnimals((dk.via.slaughterhouse.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalsData>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_PARTS:
          serviceImpl.getAnimalParts((dk.via.slaughterhouse.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.AnimalPartsData>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((dk.via.slaughterhouse.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.ProductsData>) responseObserver);
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
              .addMethod(METHOD_REGISTER_ANIMAL_PART)
              .addMethod(METHOD_REGISTER_PRODUCT)
              .addMethod(METHOD_READ_ANIMAL)
              .addMethod(METHOD_READ_ANIMAL_PART)
              .addMethod(METHOD_READ_PRODUCT)
              .addMethod(METHOD_READ_PART_TYPE)
              .addMethod(METHOD_UPDATE_ANIMAL)
              .addMethod(METHOD_UPDATE_ANIMAL_PART)
              .addMethod(METHOD_UPDATE_PRODUCT)
              .addMethod(METHOD_REMOVE_ANIMAL)
              .addMethod(METHOD_REMOVE_ANIMAL_PART)
              .addMethod(METHOD_REMOVE_PRODUCT)
              .addMethod(METHOD_GET_ALL_ANIMALS)
              .addMethod(METHOD_GET_ANIMAL_PARTS)
              .addMethod(METHOD_GET_ALL_PRODUCTS)
              .build();
        }
      }
    }
    return result;
  }
}

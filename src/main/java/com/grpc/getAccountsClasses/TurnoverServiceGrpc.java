package com.grpc.getAccountsClasses;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: test.proto")
public final class TurnoverServiceGrpc {

  private TurnoverServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.getAccountsClasses.TurnoverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeTurnoverRequest,
      com.grpc.getAccountsClasses.removeTurnoverResponse> getRemoveTurnoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeTurnover",
      requestType = com.grpc.getAccountsClasses.removeTurnoverRequest.class,
      responseType = com.grpc.getAccountsClasses.removeTurnoverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeTurnoverRequest,
      com.grpc.getAccountsClasses.removeTurnoverResponse> getRemoveTurnoverMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeTurnoverRequest, com.grpc.getAccountsClasses.removeTurnoverResponse> getRemoveTurnoverMethod;
    if ((getRemoveTurnoverMethod = TurnoverServiceGrpc.getRemoveTurnoverMethod) == null) {
      synchronized (TurnoverServiceGrpc.class) {
        if ((getRemoveTurnoverMethod = TurnoverServiceGrpc.getRemoveTurnoverMethod) == null) {
          TurnoverServiceGrpc.getRemoveTurnoverMethod = getRemoveTurnoverMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.removeTurnoverRequest, com.grpc.getAccountsClasses.removeTurnoverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeTurnover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.removeTurnoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.removeTurnoverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TurnoverServiceMethodDescriptorSupplier("removeTurnover"))
              .build();
        }
      }
    }
    return getRemoveTurnoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findTurnoverByIbanRequest,
      com.grpc.getAccountsClasses.findTurnoverByIbanResponse> getFindTurnoverByIbanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findTurnoverByIban",
      requestType = com.grpc.getAccountsClasses.findTurnoverByIbanRequest.class,
      responseType = com.grpc.getAccountsClasses.findTurnoverByIbanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findTurnoverByIbanRequest,
      com.grpc.getAccountsClasses.findTurnoverByIbanResponse> getFindTurnoverByIbanMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findTurnoverByIbanRequest, com.grpc.getAccountsClasses.findTurnoverByIbanResponse> getFindTurnoverByIbanMethod;
    if ((getFindTurnoverByIbanMethod = TurnoverServiceGrpc.getFindTurnoverByIbanMethod) == null) {
      synchronized (TurnoverServiceGrpc.class) {
        if ((getFindTurnoverByIbanMethod = TurnoverServiceGrpc.getFindTurnoverByIbanMethod) == null) {
          TurnoverServiceGrpc.getFindTurnoverByIbanMethod = getFindTurnoverByIbanMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.findTurnoverByIbanRequest, com.grpc.getAccountsClasses.findTurnoverByIbanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findTurnoverByIban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.findTurnoverByIbanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.findTurnoverByIbanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TurnoverServiceMethodDescriptorSupplier("findTurnoverByIban"))
              .build();
        }
      }
    }
    return getFindTurnoverByIbanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addTurnoverRequest,
      com.grpc.getAccountsClasses.addTurnoverResponse> getAddTurnoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTurnover",
      requestType = com.grpc.getAccountsClasses.addTurnoverRequest.class,
      responseType = com.grpc.getAccountsClasses.addTurnoverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addTurnoverRequest,
      com.grpc.getAccountsClasses.addTurnoverResponse> getAddTurnoverMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addTurnoverRequest, com.grpc.getAccountsClasses.addTurnoverResponse> getAddTurnoverMethod;
    if ((getAddTurnoverMethod = TurnoverServiceGrpc.getAddTurnoverMethod) == null) {
      synchronized (TurnoverServiceGrpc.class) {
        if ((getAddTurnoverMethod = TurnoverServiceGrpc.getAddTurnoverMethod) == null) {
          TurnoverServiceGrpc.getAddTurnoverMethod = getAddTurnoverMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.addTurnoverRequest, com.grpc.getAccountsClasses.addTurnoverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addTurnover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.addTurnoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.addTurnoverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TurnoverServiceMethodDescriptorSupplier("addTurnover"))
              .build();
        }
      }
    }
    return getAddTurnoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateTurnoverRequest,
      com.grpc.getAccountsClasses.updateTurnoverResponse> getUpdateTurnoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTurnover",
      requestType = com.grpc.getAccountsClasses.updateTurnoverRequest.class,
      responseType = com.grpc.getAccountsClasses.updateTurnoverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateTurnoverRequest,
      com.grpc.getAccountsClasses.updateTurnoverResponse> getUpdateTurnoverMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateTurnoverRequest, com.grpc.getAccountsClasses.updateTurnoverResponse> getUpdateTurnoverMethod;
    if ((getUpdateTurnoverMethod = TurnoverServiceGrpc.getUpdateTurnoverMethod) == null) {
      synchronized (TurnoverServiceGrpc.class) {
        if ((getUpdateTurnoverMethod = TurnoverServiceGrpc.getUpdateTurnoverMethod) == null) {
          TurnoverServiceGrpc.getUpdateTurnoverMethod = getUpdateTurnoverMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.updateTurnoverRequest, com.grpc.getAccountsClasses.updateTurnoverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTurnover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.updateTurnoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.updateTurnoverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TurnoverServiceMethodDescriptorSupplier("updateTurnover"))
              .build();
        }
      }
    }
    return getUpdateTurnoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.turnoversRequest,
      com.grpc.getAccountsClasses.turnoversResponse> getTurnoversMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnovers",
      requestType = com.grpc.getAccountsClasses.turnoversRequest.class,
      responseType = com.grpc.getAccountsClasses.turnoversResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.turnoversRequest,
      com.grpc.getAccountsClasses.turnoversResponse> getTurnoversMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.turnoversRequest, com.grpc.getAccountsClasses.turnoversResponse> getTurnoversMethod;
    if ((getTurnoversMethod = TurnoverServiceGrpc.getTurnoversMethod) == null) {
      synchronized (TurnoverServiceGrpc.class) {
        if ((getTurnoversMethod = TurnoverServiceGrpc.getTurnoversMethod) == null) {
          TurnoverServiceGrpc.getTurnoversMethod = getTurnoversMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.turnoversRequest, com.grpc.getAccountsClasses.turnoversResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "turnovers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.turnoversRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.turnoversResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TurnoverServiceMethodDescriptorSupplier("turnovers"))
              .build();
        }
      }
    }
    return getTurnoversMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TurnoverServiceStub newStub(io.grpc.Channel channel) {
    return new TurnoverServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TurnoverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TurnoverServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TurnoverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TurnoverServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TurnoverServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void removeTurnover(com.grpc.getAccountsClasses.removeTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeTurnoverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTurnoverMethod(), responseObserver);
    }

    /**
     */
    public void findTurnoverByIban(com.grpc.getAccountsClasses.findTurnoverByIbanRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findTurnoverByIbanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindTurnoverByIbanMethod(), responseObserver);
    }

    /**
     */
    public void addTurnover(com.grpc.getAccountsClasses.addTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addTurnoverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTurnoverMethod(), responseObserver);
    }

    /**
     */
    public void updateTurnover(com.grpc.getAccountsClasses.updateTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateTurnoverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTurnoverMethod(), responseObserver);
    }

    /**
     */
    public void turnovers(com.grpc.getAccountsClasses.turnoversRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.turnoversResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnoversMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveTurnoverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.removeTurnoverRequest,
                com.grpc.getAccountsClasses.removeTurnoverResponse>(
                  this, METHODID_REMOVE_TURNOVER)))
          .addMethod(
            getFindTurnoverByIbanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.findTurnoverByIbanRequest,
                com.grpc.getAccountsClasses.findTurnoverByIbanResponse>(
                  this, METHODID_FIND_TURNOVER_BY_IBAN)))
          .addMethod(
            getAddTurnoverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.addTurnoverRequest,
                com.grpc.getAccountsClasses.addTurnoverResponse>(
                  this, METHODID_ADD_TURNOVER)))
          .addMethod(
            getUpdateTurnoverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.updateTurnoverRequest,
                com.grpc.getAccountsClasses.updateTurnoverResponse>(
                  this, METHODID_UPDATE_TURNOVER)))
          .addMethod(
            getTurnoversMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.turnoversRequest,
                com.grpc.getAccountsClasses.turnoversResponse>(
                  this, METHODID_TURNOVERS)))
          .build();
    }
  }

  /**
   */
  public static final class TurnoverServiceStub extends io.grpc.stub.AbstractStub<TurnoverServiceStub> {
    private TurnoverServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TurnoverServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TurnoverServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TurnoverServiceStub(channel, callOptions);
    }

    /**
     */
    public void removeTurnover(com.grpc.getAccountsClasses.removeTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeTurnoverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTurnoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTurnoverByIban(com.grpc.getAccountsClasses.findTurnoverByIbanRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findTurnoverByIbanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindTurnoverByIbanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addTurnover(com.grpc.getAccountsClasses.addTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addTurnoverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTurnoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTurnover(com.grpc.getAccountsClasses.updateTurnoverRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateTurnoverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTurnoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnovers(com.grpc.getAccountsClasses.turnoversRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.turnoversResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnoversMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TurnoverServiceBlockingStub extends io.grpc.stub.AbstractStub<TurnoverServiceBlockingStub> {
    private TurnoverServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TurnoverServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TurnoverServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TurnoverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.getAccountsClasses.removeTurnoverResponse removeTurnover(com.grpc.getAccountsClasses.removeTurnoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTurnoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.findTurnoverByIbanResponse findTurnoverByIban(com.grpc.getAccountsClasses.findTurnoverByIbanRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindTurnoverByIbanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.addTurnoverResponse addTurnover(com.grpc.getAccountsClasses.addTurnoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTurnoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.updateTurnoverResponse updateTurnover(com.grpc.getAccountsClasses.updateTurnoverRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTurnoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.turnoversResponse turnovers(com.grpc.getAccountsClasses.turnoversRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnoversMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TurnoverServiceFutureStub extends io.grpc.stub.AbstractStub<TurnoverServiceFutureStub> {
    private TurnoverServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TurnoverServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TurnoverServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TurnoverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.removeTurnoverResponse> removeTurnover(
        com.grpc.getAccountsClasses.removeTurnoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTurnoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.findTurnoverByIbanResponse> findTurnoverByIban(
        com.grpc.getAccountsClasses.findTurnoverByIbanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindTurnoverByIbanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.addTurnoverResponse> addTurnover(
        com.grpc.getAccountsClasses.addTurnoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTurnoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.updateTurnoverResponse> updateTurnover(
        com.grpc.getAccountsClasses.updateTurnoverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTurnoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.turnoversResponse> turnovers(
        com.grpc.getAccountsClasses.turnoversRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnoversMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_TURNOVER = 0;
  private static final int METHODID_FIND_TURNOVER_BY_IBAN = 1;
  private static final int METHODID_ADD_TURNOVER = 2;
  private static final int METHODID_UPDATE_TURNOVER = 3;
  private static final int METHODID_TURNOVERS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TurnoverServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TurnoverServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_TURNOVER:
          serviceImpl.removeTurnover((com.grpc.getAccountsClasses.removeTurnoverRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeTurnoverResponse>) responseObserver);
          break;
        case METHODID_FIND_TURNOVER_BY_IBAN:
          serviceImpl.findTurnoverByIban((com.grpc.getAccountsClasses.findTurnoverByIbanRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findTurnoverByIbanResponse>) responseObserver);
          break;
        case METHODID_ADD_TURNOVER:
          serviceImpl.addTurnover((com.grpc.getAccountsClasses.addTurnoverRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addTurnoverResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TURNOVER:
          serviceImpl.updateTurnover((com.grpc.getAccountsClasses.updateTurnoverRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateTurnoverResponse>) responseObserver);
          break;
        case METHODID_TURNOVERS:
          serviceImpl.turnovers((com.grpc.getAccountsClasses.turnoversRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.turnoversResponse>) responseObserver);
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

  private static abstract class TurnoverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TurnoverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.getAccountsClasses.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TurnoverService");
    }
  }

  private static final class TurnoverServiceFileDescriptorSupplier
      extends TurnoverServiceBaseDescriptorSupplier {
    TurnoverServiceFileDescriptorSupplier() {}
  }

  private static final class TurnoverServiceMethodDescriptorSupplier
      extends TurnoverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TurnoverServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TurnoverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TurnoverServiceFileDescriptorSupplier())
              .addMethod(getRemoveTurnoverMethod())
              .addMethod(getFindTurnoverByIbanMethod())
              .addMethod(getAddTurnoverMethod())
              .addMethod(getUpdateTurnoverMethod())
              .addMethod(getTurnoversMethod())
              .build();
        }
      }
    }
    return result;
  }
}

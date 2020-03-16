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
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.getAccountsClasses.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeAccountRequest,
      com.grpc.getAccountsClasses.removeAccountResponse> getRemoveAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeAccount",
      requestType = com.grpc.getAccountsClasses.removeAccountRequest.class,
      responseType = com.grpc.getAccountsClasses.removeAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeAccountRequest,
      com.grpc.getAccountsClasses.removeAccountResponse> getRemoveAccountMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.removeAccountRequest, com.grpc.getAccountsClasses.removeAccountResponse> getRemoveAccountMethod;
    if ((getRemoveAccountMethod = AccountServiceGrpc.getRemoveAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getRemoveAccountMethod = AccountServiceGrpc.getRemoveAccountMethod) == null) {
          AccountServiceGrpc.getRemoveAccountMethod = getRemoveAccountMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.removeAccountRequest, com.grpc.getAccountsClasses.removeAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.removeAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.removeAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("removeAccount"))
              .build();
        }
      }
    }
    return getRemoveAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findAccountByIbanRequest,
      com.grpc.getAccountsClasses.findAccountByIbanResponse> getFindAccountByIbanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAccountByIban",
      requestType = com.grpc.getAccountsClasses.findAccountByIbanRequest.class,
      responseType = com.grpc.getAccountsClasses.findAccountByIbanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findAccountByIbanRequest,
      com.grpc.getAccountsClasses.findAccountByIbanResponse> getFindAccountByIbanMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.findAccountByIbanRequest, com.grpc.getAccountsClasses.findAccountByIbanResponse> getFindAccountByIbanMethod;
    if ((getFindAccountByIbanMethod = AccountServiceGrpc.getFindAccountByIbanMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getFindAccountByIbanMethod = AccountServiceGrpc.getFindAccountByIbanMethod) == null) {
          AccountServiceGrpc.getFindAccountByIbanMethod = getFindAccountByIbanMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.findAccountByIbanRequest, com.grpc.getAccountsClasses.findAccountByIbanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAccountByIban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.findAccountByIbanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.findAccountByIbanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("findAccountByIban"))
              .build();
        }
      }
    }
    return getFindAccountByIbanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addAccountRequest,
      com.grpc.getAccountsClasses.addAccountResponse> getAddAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAccount",
      requestType = com.grpc.getAccountsClasses.addAccountRequest.class,
      responseType = com.grpc.getAccountsClasses.addAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addAccountRequest,
      com.grpc.getAccountsClasses.addAccountResponse> getAddAccountMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.addAccountRequest, com.grpc.getAccountsClasses.addAccountResponse> getAddAccountMethod;
    if ((getAddAccountMethod = AccountServiceGrpc.getAddAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAddAccountMethod = AccountServiceGrpc.getAddAccountMethod) == null) {
          AccountServiceGrpc.getAddAccountMethod = getAddAccountMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.addAccountRequest, com.grpc.getAccountsClasses.addAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.addAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.addAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("addAccount"))
              .build();
        }
      }
    }
    return getAddAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateAccountRequest,
      com.grpc.getAccountsClasses.updateAccountResponse> getUpdateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAccount",
      requestType = com.grpc.getAccountsClasses.updateAccountRequest.class,
      responseType = com.grpc.getAccountsClasses.updateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateAccountRequest,
      com.grpc.getAccountsClasses.updateAccountResponse> getUpdateAccountMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.updateAccountRequest, com.grpc.getAccountsClasses.updateAccountResponse> getUpdateAccountMethod;
    if ((getUpdateAccountMethod = AccountServiceGrpc.getUpdateAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateAccountMethod = AccountServiceGrpc.getUpdateAccountMethod) == null) {
          AccountServiceGrpc.getUpdateAccountMethod = getUpdateAccountMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.updateAccountRequest, com.grpc.getAccountsClasses.updateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.updateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.updateAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("updateAccount"))
              .build();
        }
      }
    }
    return getUpdateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.accountsRequest,
      com.grpc.getAccountsClasses.accountsResponse> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accounts",
      requestType = com.grpc.getAccountsClasses.accountsRequest.class,
      responseType = com.grpc.getAccountsClasses.accountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.accountsRequest,
      com.grpc.getAccountsClasses.accountsResponse> getAccountsMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.accountsRequest, com.grpc.getAccountsClasses.accountsResponse> getAccountsMethod;
    if ((getAccountsMethod = AccountServiceGrpc.getAccountsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAccountsMethod = AccountServiceGrpc.getAccountsMethod) == null) {
          AccountServiceGrpc.getAccountsMethod = getAccountsMethod =
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.accountsRequest, com.grpc.getAccountsClasses.accountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.accountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.accountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("accounts"))
              .build();
        }
      }
    }
    return getAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    return new AccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void removeAccount(com.grpc.getAccountsClasses.removeAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveAccountMethod(), responseObserver);
    }

    /**
     */
    public void findAccountByIban(com.grpc.getAccountsClasses.findAccountByIbanRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findAccountByIbanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAccountByIbanMethod(), responseObserver);
    }

    /**
     */
    public void addAccount(com.grpc.getAccountsClasses.addAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAccountMethod(), responseObserver);
    }

    /**
     */
    public void updateAccount(com.grpc.getAccountsClasses.updateAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountMethod(), responseObserver);
    }

    /**
     */
    public void accounts(com.grpc.getAccountsClasses.accountsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.accountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.removeAccountRequest,
                com.grpc.getAccountsClasses.removeAccountResponse>(
                  this, METHODID_REMOVE_ACCOUNT)))
          .addMethod(
            getFindAccountByIbanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.findAccountByIbanRequest,
                com.grpc.getAccountsClasses.findAccountByIbanResponse>(
                  this, METHODID_FIND_ACCOUNT_BY_IBAN)))
          .addMethod(
            getAddAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.addAccountRequest,
                com.grpc.getAccountsClasses.addAccountResponse>(
                  this, METHODID_ADD_ACCOUNT)))
          .addMethod(
            getUpdateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.updateAccountRequest,
                com.grpc.getAccountsClasses.updateAccountResponse>(
                  this, METHODID_UPDATE_ACCOUNT)))
          .addMethod(
            getAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.accountsRequest,
                com.grpc.getAccountsClasses.accountsResponse>(
                  this, METHODID_ACCOUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractStub<AccountServiceStub> {
    private AccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void removeAccount(com.grpc.getAccountsClasses.removeAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAccountByIban(com.grpc.getAccountsClasses.findAccountByIbanRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findAccountByIbanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAccountByIbanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAccount(com.grpc.getAccountsClasses.addAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccount(com.grpc.getAccountsClasses.updateAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void accounts(com.grpc.getAccountsClasses.accountsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.accountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.getAccountsClasses.removeAccountResponse removeAccount(com.grpc.getAccountsClasses.removeAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.findAccountByIbanResponse findAccountByIban(com.grpc.getAccountsClasses.findAccountByIbanRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAccountByIbanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.addAccountResponse addAccount(com.grpc.getAccountsClasses.addAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.updateAccountResponse updateAccount(com.grpc.getAccountsClasses.updateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.getAccountsClasses.accountsResponse accounts(com.grpc.getAccountsClasses.accountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.removeAccountResponse> removeAccount(
        com.grpc.getAccountsClasses.removeAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.findAccountByIbanResponse> findAccountByIban(
        com.grpc.getAccountsClasses.findAccountByIbanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAccountByIbanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.addAccountResponse> addAccount(
        com.grpc.getAccountsClasses.addAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.updateAccountResponse> updateAccount(
        com.grpc.getAccountsClasses.updateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.accountsResponse> accounts(
        com.grpc.getAccountsClasses.accountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE_ACCOUNT = 0;
  private static final int METHODID_FIND_ACCOUNT_BY_IBAN = 1;
  private static final int METHODID_ADD_ACCOUNT = 2;
  private static final int METHODID_UPDATE_ACCOUNT = 3;
  private static final int METHODID_ACCOUNTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_ACCOUNT:
          serviceImpl.removeAccount((com.grpc.getAccountsClasses.removeAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.removeAccountResponse>) responseObserver);
          break;
        case METHODID_FIND_ACCOUNT_BY_IBAN:
          serviceImpl.findAccountByIban((com.grpc.getAccountsClasses.findAccountByIbanRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.findAccountByIbanResponse>) responseObserver);
          break;
        case METHODID_ADD_ACCOUNT:
          serviceImpl.addAccount((com.grpc.getAccountsClasses.addAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.addAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT:
          serviceImpl.updateAccount((com.grpc.getAccountsClasses.updateAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.updateAccountResponse>) responseObserver);
          break;
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((com.grpc.getAccountsClasses.accountsRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.accountsResponse>) responseObserver);
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.getAccountsClasses.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getRemoveAccountMethod())
              .addMethod(getFindAccountByIbanMethod())
              .addMethod(getAddAccountMethod())
              .addMethod(getUpdateAccountMethod())
              .addMethod(getAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package org.nebulas.rpc.proto;

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
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: rpc.proto")
public final class AdminServiceGrpc {

  private AdminServiceGrpc() {}

  public static final String SERVICE_NAME = "org.nebulas.rpc.proto.AdminService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAccountsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.AccountsResponse> METHOD_ACCOUNTS = getAccountsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.AccountsResponse> getAccountsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.AccountsResponse> getAccountsMethod() {
    return getAccountsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.AccountsResponse> getAccountsMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.AccountsResponse> getAccountsMethod;
    if ((getAccountsMethod = AdminServiceGrpc.getAccountsMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getAccountsMethod = AdminServiceGrpc.getAccountsMethod) == null) {
          AdminServiceGrpc.getAccountsMethod = getAccountsMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.AccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "Accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NonParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.AccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("Accounts"))
                  .build();
          }
        }
     }
     return getAccountsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getNewAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NewAccountRequest,
      org.nebulas.rpc.proto.Rpc.NewAccountResponse> METHOD_NEW_ACCOUNT = getNewAccountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NewAccountRequest,
      org.nebulas.rpc.proto.Rpc.NewAccountResponse> getNewAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NewAccountRequest,
      org.nebulas.rpc.proto.Rpc.NewAccountResponse> getNewAccountMethod() {
    return getNewAccountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NewAccountRequest,
      org.nebulas.rpc.proto.Rpc.NewAccountResponse> getNewAccountMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NewAccountRequest, org.nebulas.rpc.proto.Rpc.NewAccountResponse> getNewAccountMethod;
    if ((getNewAccountMethod = AdminServiceGrpc.getNewAccountMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getNewAccountMethod = AdminServiceGrpc.getNewAccountMethod) == null) {
          AdminServiceGrpc.getNewAccountMethod = getNewAccountMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NewAccountRequest, org.nebulas.rpc.proto.Rpc.NewAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "NewAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NewAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NewAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("NewAccount"))
                  .build();
          }
        }
     }
     return getNewAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnlockAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest,
      org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> METHOD_UNLOCK_ACCOUNT = getUnlockAccountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest,
      org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> getUnlockAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest,
      org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> getUnlockAccountMethod() {
    return getUnlockAccountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest,
      org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> getUnlockAccountMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest, org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> getUnlockAccountMethod;
    if ((getUnlockAccountMethod = AdminServiceGrpc.getUnlockAccountMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getUnlockAccountMethod = AdminServiceGrpc.getUnlockAccountMethod) == null) {
          AdminServiceGrpc.getUnlockAccountMethod = getUnlockAccountMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.UnlockAccountRequest, org.nebulas.rpc.proto.Rpc.UnlockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "UnlockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.UnlockAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.UnlockAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("UnlockAccount"))
                  .build();
          }
        }
     }
     return getUnlockAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLockAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.LockAccountRequest,
      org.nebulas.rpc.proto.Rpc.LockAccountResponse> METHOD_LOCK_ACCOUNT = getLockAccountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.LockAccountRequest,
      org.nebulas.rpc.proto.Rpc.LockAccountResponse> getLockAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.LockAccountRequest,
      org.nebulas.rpc.proto.Rpc.LockAccountResponse> getLockAccountMethod() {
    return getLockAccountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.LockAccountRequest,
      org.nebulas.rpc.proto.Rpc.LockAccountResponse> getLockAccountMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.LockAccountRequest, org.nebulas.rpc.proto.Rpc.LockAccountResponse> getLockAccountMethod;
    if ((getLockAccountMethod = AdminServiceGrpc.getLockAccountMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getLockAccountMethod = AdminServiceGrpc.getLockAccountMethod) == null) {
          AdminServiceGrpc.getLockAccountMethod = getLockAccountMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.LockAccountRequest, org.nebulas.rpc.proto.Rpc.LockAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "LockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.LockAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.LockAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("LockAccount"))
                  .build();
          }
        }
     }
     return getLockAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendTransactionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> METHOD_SEND_TRANSACTION = getSendTransactionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionMethod() {
    return getSendTransactionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionMethod;
    if ((getSendTransactionMethod = AdminServiceGrpc.getSendTransactionMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getSendTransactionMethod = AdminServiceGrpc.getSendTransactionMethod) == null) {
          AdminServiceGrpc.getSendTransactionMethod = getSendTransactionMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "SendTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SendTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("SendTransaction"))
                  .build();
          }
        }
     }
     return getSendTransactionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSignHashMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignHashRequest,
      org.nebulas.rpc.proto.Rpc.SignHashResponse> METHOD_SIGN_HASH = getSignHashMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignHashRequest,
      org.nebulas.rpc.proto.Rpc.SignHashResponse> getSignHashMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignHashRequest,
      org.nebulas.rpc.proto.Rpc.SignHashResponse> getSignHashMethod() {
    return getSignHashMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignHashRequest,
      org.nebulas.rpc.proto.Rpc.SignHashResponse> getSignHashMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignHashRequest, org.nebulas.rpc.proto.Rpc.SignHashResponse> getSignHashMethod;
    if ((getSignHashMethod = AdminServiceGrpc.getSignHashMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getSignHashMethod = AdminServiceGrpc.getSignHashMethod) == null) {
          AdminServiceGrpc.getSignHashMethod = getSignHashMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.SignHashRequest, org.nebulas.rpc.proto.Rpc.SignHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "SignHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SignHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SignHashResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("SignHash"))
                  .build();
          }
        }
     }
     return getSignHashMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSignTransactionWithPassphraseMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> METHOD_SIGN_TRANSACTION_WITH_PASSPHRASE = getSignTransactionWithPassphraseMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> getSignTransactionWithPassphraseMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> getSignTransactionWithPassphraseMethod() {
    return getSignTransactionWithPassphraseMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> getSignTransactionWithPassphraseMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest, org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> getSignTransactionWithPassphraseMethod;
    if ((getSignTransactionWithPassphraseMethod = AdminServiceGrpc.getSignTransactionWithPassphraseMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getSignTransactionWithPassphraseMethod = AdminServiceGrpc.getSignTransactionWithPassphraseMethod) == null) {
          AdminServiceGrpc.getSignTransactionWithPassphraseMethod = getSignTransactionWithPassphraseMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest, org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "SignTransactionWithPassphrase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("SignTransactionWithPassphrase"))
                  .build();
          }
        }
     }
     return getSignTransactionWithPassphraseMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendTransactionWithPassphraseMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> METHOD_SEND_TRANSACTION_WITH_PASSPHRASE = getSendTransactionWithPassphraseMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionWithPassphraseMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionWithPassphraseMethod() {
    return getSendTransactionWithPassphraseMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionWithPassphraseMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendTransactionWithPassphraseMethod;
    if ((getSendTransactionWithPassphraseMethod = AdminServiceGrpc.getSendTransactionWithPassphraseMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getSendTransactionWithPassphraseMethod = AdminServiceGrpc.getSendTransactionWithPassphraseMethod) == null) {
          AdminServiceGrpc.getSendTransactionWithPassphraseMethod = getSendTransactionWithPassphraseMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "SendTransactionWithPassphrase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SendTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("SendTransactionWithPassphrase"))
                  .build();
          }
        }
     }
     return getSendTransactionWithPassphraseMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStartPprofMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.PprofRequest,
      org.nebulas.rpc.proto.Rpc.PprofResponse> METHOD_START_PPROF = getStartPprofMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.PprofRequest,
      org.nebulas.rpc.proto.Rpc.PprofResponse> getStartPprofMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.PprofRequest,
      org.nebulas.rpc.proto.Rpc.PprofResponse> getStartPprofMethod() {
    return getStartPprofMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.PprofRequest,
      org.nebulas.rpc.proto.Rpc.PprofResponse> getStartPprofMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.PprofRequest, org.nebulas.rpc.proto.Rpc.PprofResponse> getStartPprofMethod;
    if ((getStartPprofMethod = AdminServiceGrpc.getStartPprofMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getStartPprofMethod = AdminServiceGrpc.getStartPprofMethod) == null) {
          AdminServiceGrpc.getStartPprofMethod = getStartPprofMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.PprofRequest, org.nebulas.rpc.proto.Rpc.PprofResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "StartPprof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.PprofRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.PprofResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("StartPprof"))
                  .build();
          }
        }
     }
     return getStartPprofMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getNodeInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.NodeInfoResponse> METHOD_NODE_INFO = getNodeInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.NodeInfoResponse> getNodeInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.NodeInfoResponse> getNodeInfoMethod() {
    return getNodeInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.NodeInfoResponse> getNodeInfoMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.NodeInfoResponse> getNodeInfoMethod;
    if ((getNodeInfoMethod = AdminServiceGrpc.getNodeInfoMethod) == null) {
      synchronized (AdminServiceGrpc.class) {
        if ((getNodeInfoMethod = AdminServiceGrpc.getNodeInfoMethod) == null) {
          AdminServiceGrpc.getNodeInfoMethod = getNodeInfoMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.NodeInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.AdminService", "NodeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NonParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NodeInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AdminServiceMethodDescriptorSupplier("NodeInfo"))
                  .build();
          }
        }
     }
     return getNodeInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdminServiceStub newStub(io.grpc.Channel channel) {
    return new AdminServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdminServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AdminServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdminServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AdminServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AdminServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Accounts return account list.
     * </pre>
     */
    public void accounts(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.AccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountsMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * NewAccount create a new account with passphrase
     * </pre>
     */
    public void newAccount(org.nebulas.rpc.proto.Rpc.NewAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NewAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNewAccountMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * UnlockAccount unlock account with passphrase
     * </pre>
     */
    public void unlockAccount(org.nebulas.rpc.proto.Rpc.UnlockAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockAccountMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * LockAccount lock account
     * </pre>
     */
    public void lockAccount(org.nebulas.rpc.proto.Rpc.LockAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.LockAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockAccountMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Verify, sign, and send the transaction.
     * </pre>
     */
    public void sendTransaction(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTransactionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Sign sign msg
     * </pre>
     */
    public void signHash(org.nebulas.rpc.proto.Rpc.SignHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignHashMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Sign sign transaction
     * </pre>
     */
    public void signTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignTransactionWithPassphraseMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * SendTransactionWithPassphrase send transaction with passphrase
     * </pre>
     */
    public void sendTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTransactionWithPassphraseMethodHelper(), responseObserver);
    }

    /**
     */
    public void startPprof(org.nebulas.rpc.proto.Rpc.PprofRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.PprofResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartPprofMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Return the p2p node info.
     * </pre>
     */
    public void nodeInfo(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NodeInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNodeInfoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NonParamsRequest,
                org.nebulas.rpc.proto.Rpc.AccountsResponse>(
                  this, METHODID_ACCOUNTS)))
          .addMethod(
            getNewAccountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NewAccountRequest,
                org.nebulas.rpc.proto.Rpc.NewAccountResponse>(
                  this, METHODID_NEW_ACCOUNT)))
          .addMethod(
            getUnlockAccountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.UnlockAccountRequest,
                org.nebulas.rpc.proto.Rpc.UnlockAccountResponse>(
                  this, METHODID_UNLOCK_ACCOUNT)))
          .addMethod(
            getLockAccountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.LockAccountRequest,
                org.nebulas.rpc.proto.Rpc.LockAccountResponse>(
                  this, METHODID_LOCK_ACCOUNT)))
          .addMethod(
            getSendTransactionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.TransactionRequest,
                org.nebulas.rpc.proto.Rpc.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION)))
          .addMethod(
            getSignHashMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.SignHashRequest,
                org.nebulas.rpc.proto.Rpc.SignHashResponse>(
                  this, METHODID_SIGN_HASH)))
          .addMethod(
            getSignTransactionWithPassphraseMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest,
                org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse>(
                  this, METHODID_SIGN_TRANSACTION_WITH_PASSPHRASE)))
          .addMethod(
            getSendTransactionWithPassphraseMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest,
                org.nebulas.rpc.proto.Rpc.SendTransactionResponse>(
                  this, METHODID_SEND_TRANSACTION_WITH_PASSPHRASE)))
          .addMethod(
            getStartPprofMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.PprofRequest,
                org.nebulas.rpc.proto.Rpc.PprofResponse>(
                  this, METHODID_START_PPROF)))
          .addMethod(
            getNodeInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NonParamsRequest,
                org.nebulas.rpc.proto.Rpc.NodeInfoResponse>(
                  this, METHODID_NODE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class AdminServiceStub extends io.grpc.stub.AbstractStub<AdminServiceStub> {
    private AdminServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts return account list.
     * </pre>
     */
    public void accounts(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.AccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewAccount create a new account with passphrase
     * </pre>
     */
    public void newAccount(org.nebulas.rpc.proto.Rpc.NewAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NewAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewAccountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnlockAccount unlock account with passphrase
     * </pre>
     */
    public void unlockAccount(org.nebulas.rpc.proto.Rpc.UnlockAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockAccountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockAccount lock account
     * </pre>
     */
    public void lockAccount(org.nebulas.rpc.proto.Rpc.LockAccountRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.LockAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockAccountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify, sign, and send the transaction.
     * </pre>
     */
    public void sendTransaction(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTransactionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sign sign msg
     * </pre>
     */
    public void signHash(org.nebulas.rpc.proto.Rpc.SignHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignHashMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sign sign transaction
     * </pre>
     */
    public void signTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignTransactionWithPassphraseMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendTransactionWithPassphrase send transaction with passphrase
     * </pre>
     */
    public void sendTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTransactionWithPassphraseMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startPprof(org.nebulas.rpc.proto.Rpc.PprofRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.PprofResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartPprofMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the p2p node info.
     * </pre>
     */
    public void nodeInfo(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NodeInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNodeInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AdminServiceBlockingStub extends io.grpc.stub.AbstractStub<AdminServiceBlockingStub> {
    private AdminServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts return account list.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.AccountsResponse accounts(org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountsMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewAccount create a new account with passphrase
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.NewAccountResponse newAccount(org.nebulas.rpc.proto.Rpc.NewAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getNewAccountMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnlockAccount unlock account with passphrase
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.UnlockAccountResponse unlockAccount(org.nebulas.rpc.proto.Rpc.UnlockAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockAccountMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockAccount lock account
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.LockAccountResponse lockAccount(org.nebulas.rpc.proto.Rpc.LockAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockAccountMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify, sign, and send the transaction.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.SendTransactionResponse sendTransaction(org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendTransactionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sign sign msg
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.SignHashResponse signHash(org.nebulas.rpc.proto.Rpc.SignHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignHashMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sign sign transaction
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse signTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignTransactionWithPassphraseMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendTransactionWithPassphrase send transaction with passphrase
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.SendTransactionResponse sendTransactionWithPassphrase(org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendTransactionWithPassphraseMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.nebulas.rpc.proto.Rpc.PprofResponse startPprof(org.nebulas.rpc.proto.Rpc.PprofRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartPprofMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the p2p node info.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.NodeInfoResponse nodeInfo(org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getNodeInfoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AdminServiceFutureStub extends io.grpc.stub.AbstractStub<AdminServiceFutureStub> {
    private AdminServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AdminServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdminServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AdminServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Accounts return account list.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.AccountsResponse> accounts(
        org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountsMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewAccount create a new account with passphrase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.NewAccountResponse> newAccount(
        org.nebulas.rpc.proto.Rpc.NewAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNewAccountMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnlockAccount unlock account with passphrase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.UnlockAccountResponse> unlockAccount(
        org.nebulas.rpc.proto.Rpc.UnlockAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockAccountMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockAccount lock account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.LockAccountResponse> lockAccount(
        org.nebulas.rpc.proto.Rpc.LockAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockAccountMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify, sign, and send the transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> sendTransaction(
        org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTransactionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sign sign msg
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.SignHashResponse> signHash(
        org.nebulas.rpc.proto.Rpc.SignHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignHashMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sign sign transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse> signTransactionWithPassphrase(
        org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignTransactionWithPassphraseMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendTransactionWithPassphrase send transaction with passphrase
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> sendTransactionWithPassphrase(
        org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTransactionWithPassphraseMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.PprofResponse> startPprof(
        org.nebulas.rpc.proto.Rpc.PprofRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartPprofMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the p2p node info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.NodeInfoResponse> nodeInfo(
        org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNodeInfoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNTS = 0;
  private static final int METHODID_NEW_ACCOUNT = 1;
  private static final int METHODID_UNLOCK_ACCOUNT = 2;
  private static final int METHODID_LOCK_ACCOUNT = 3;
  private static final int METHODID_SEND_TRANSACTION = 4;
  private static final int METHODID_SIGN_HASH = 5;
  private static final int METHODID_SIGN_TRANSACTION_WITH_PASSPHRASE = 6;
  private static final int METHODID_SEND_TRANSACTION_WITH_PASSPHRASE = 7;
  private static final int METHODID_START_PPROF = 8;
  private static final int METHODID_NODE_INFO = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdminServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdminServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((org.nebulas.rpc.proto.Rpc.NonParamsRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.AccountsResponse>) responseObserver);
          break;
        case METHODID_NEW_ACCOUNT:
          serviceImpl.newAccount((org.nebulas.rpc.proto.Rpc.NewAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NewAccountResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_ACCOUNT:
          serviceImpl.unlockAccount((org.nebulas.rpc.proto.Rpc.UnlockAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.UnlockAccountResponse>) responseObserver);
          break;
        case METHODID_LOCK_ACCOUNT:
          serviceImpl.lockAccount((org.nebulas.rpc.proto.Rpc.LockAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.LockAccountResponse>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION:
          serviceImpl.sendTransaction((org.nebulas.rpc.proto.Rpc.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_SIGN_HASH:
          serviceImpl.signHash((org.nebulas.rpc.proto.Rpc.SignHashRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignHashResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION_WITH_PASSPHRASE:
          serviceImpl.signTransactionWithPassphrase((org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SignTransactionPassphraseResponse>) responseObserver);
          break;
        case METHODID_SEND_TRANSACTION_WITH_PASSPHRASE:
          serviceImpl.sendTransactionWithPassphrase((org.nebulas.rpc.proto.Rpc.SendTransactionPassphraseRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_START_PPROF:
          serviceImpl.startPprof((org.nebulas.rpc.proto.Rpc.PprofRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.PprofResponse>) responseObserver);
          break;
        case METHODID_NODE_INFO:
          serviceImpl.nodeInfo((org.nebulas.rpc.proto.Rpc.NonParamsRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.NodeInfoResponse>) responseObserver);
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

  private static abstract class AdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdminServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.nebulas.rpc.proto.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdminService");
    }
  }

  private static final class AdminServiceFileDescriptorSupplier
      extends AdminServiceBaseDescriptorSupplier {
    AdminServiceFileDescriptorSupplier() {}
  }

  private static final class AdminServiceMethodDescriptorSupplier
      extends AdminServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdminServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AdminServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdminServiceFileDescriptorSupplier())
              .addMethod(getAccountsMethodHelper())
              .addMethod(getNewAccountMethodHelper())
              .addMethod(getUnlockAccountMethodHelper())
              .addMethod(getLockAccountMethodHelper())
              .addMethod(getSendTransactionMethodHelper())
              .addMethod(getSignHashMethodHelper())
              .addMethod(getSignTransactionWithPassphraseMethodHelper())
              .addMethod(getSendTransactionWithPassphraseMethodHelper())
              .addMethod(getStartPprofMethodHelper())
              .addMethod(getNodeInfoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}

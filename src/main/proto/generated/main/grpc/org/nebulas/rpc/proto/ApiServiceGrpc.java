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
 * <pre>
 * RPC API interface.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: rpc.proto")
public final class ApiServiceGrpc {

  private ApiServiceGrpc() {}

  public static final String SERVICE_NAME = "org.nebulas.rpc.proto.ApiService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNebStateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GetNebStateResponse> METHOD_GET_NEB_STATE = getGetNebStateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GetNebStateResponse> getGetNebStateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GetNebStateResponse> getGetNebStateMethod() {
    return getGetNebStateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GetNebStateResponse> getGetNebStateMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.GetNebStateResponse> getGetNebStateMethod;
    if ((getGetNebStateMethod = ApiServiceGrpc.getGetNebStateMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetNebStateMethod = ApiServiceGrpc.getGetNebStateMethod) == null) {
          ApiServiceGrpc.getGetNebStateMethod = getGetNebStateMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.GetNebStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetNebState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NonParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetNebStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetNebState"))
                  .build();
          }
        }
     }
     return getGetNebStateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLatestIrreversibleBlockMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> METHOD_LATEST_IRREVERSIBLE_BLOCK = getLatestIrreversibleBlockMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getLatestIrreversibleBlockMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getLatestIrreversibleBlockMethod() {
    return getLatestIrreversibleBlockMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getLatestIrreversibleBlockMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.BlockResponse> getLatestIrreversibleBlockMethod;
    if ((getLatestIrreversibleBlockMethod = ApiServiceGrpc.getLatestIrreversibleBlockMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getLatestIrreversibleBlockMethod = ApiServiceGrpc.getLatestIrreversibleBlockMethod) == null) {
          ApiServiceGrpc.getLatestIrreversibleBlockMethod = getLatestIrreversibleBlockMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "LatestIrreversibleBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NonParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.BlockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("LatestIrreversibleBlock"))
                  .build();
          }
        }
     }
     return getLatestIrreversibleBlockMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountStateMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest,
      org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> METHOD_GET_ACCOUNT_STATE = getGetAccountStateMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest,
      org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> getGetAccountStateMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest,
      org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> getGetAccountStateMethod() {
    return getGetAccountStateMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest,
      org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> getGetAccountStateMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest, org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> getGetAccountStateMethod;
    if ((getGetAccountStateMethod = ApiServiceGrpc.getGetAccountStateMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetAccountStateMethod = ApiServiceGrpc.getGetAccountStateMethod) == null) {
          ApiServiceGrpc.getGetAccountStateMethod = getGetAccountStateMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.GetAccountStateRequest, org.nebulas.rpc.proto.Rpc.GetAccountStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetAccountState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetAccountStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetAccountStateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetAccountState"))
                  .build();
          }
        }
     }
     return getGetAccountStateMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCallMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.CallResponse> METHOD_CALL = getCallMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.CallResponse> getCallMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.CallResponse> getCallMethod() {
    return getCallMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.CallResponse> getCallMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.CallResponse> getCallMethod;
    if ((getCallMethod = ApiServiceGrpc.getCallMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getCallMethod = ApiServiceGrpc.getCallMethod) == null) {
          ApiServiceGrpc.getCallMethod = getCallMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.CallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "Call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.CallResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Call"))
                  .build();
          }
        }
     }
     return getCallMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendRawTransactionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> METHOD_SEND_RAW_TRANSACTION = getSendRawTransactionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendRawTransactionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendRawTransactionMethod() {
    return getSendRawTransactionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest,
      org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendRawTransactionMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse> getSendRawTransactionMethod;
    if ((getSendRawTransactionMethod = ApiServiceGrpc.getSendRawTransactionMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSendRawTransactionMethod = ApiServiceGrpc.getSendRawTransactionMethod) == null) {
          ApiServiceGrpc.getSendRawTransactionMethod = getSendRawTransactionMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest, org.nebulas.rpc.proto.Rpc.SendTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "SendRawTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SendTransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("SendRawTransaction"))
                  .build();
          }
        }
     }
     return getSendRawTransactionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBlockByHashMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> METHOD_GET_BLOCK_BY_HASH = getGetBlockByHashMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHashMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHashMethod() {
    return getGetBlockByHashMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHashMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest, org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHashMethod;
    if ((getGetBlockByHashMethod = ApiServiceGrpc.getGetBlockByHashMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetBlockByHashMethod = ApiServiceGrpc.getGetBlockByHashMethod) == null) {
          ApiServiceGrpc.getGetBlockByHashMethod = getGetBlockByHashMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest, org.nebulas.rpc.proto.Rpc.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetBlockByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.BlockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetBlockByHash"))
                  .build();
          }
        }
     }
     return getGetBlockByHashMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBlockByHeightMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> METHOD_GET_BLOCK_BY_HEIGHT = getGetBlockByHeightMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHeightMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHeightMethod() {
    return getGetBlockByHeightMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest,
      org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHeightMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest, org.nebulas.rpc.proto.Rpc.BlockResponse> getGetBlockByHeightMethod;
    if ((getGetBlockByHeightMethod = ApiServiceGrpc.getGetBlockByHeightMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetBlockByHeightMethod = ApiServiceGrpc.getGetBlockByHeightMethod) == null) {
          ApiServiceGrpc.getGetBlockByHeightMethod = getGetBlockByHeightMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest, org.nebulas.rpc.proto.Rpc.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetBlockByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.BlockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetBlockByHeight"))
                  .build();
          }
        }
     }
     return getGetBlockByHeightMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTransactionReceiptMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest,
      org.nebulas.rpc.proto.Rpc.TransactionResponse> METHOD_GET_TRANSACTION_RECEIPT = getGetTransactionReceiptMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest,
      org.nebulas.rpc.proto.Rpc.TransactionResponse> getGetTransactionReceiptMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest,
      org.nebulas.rpc.proto.Rpc.TransactionResponse> getGetTransactionReceiptMethod() {
    return getGetTransactionReceiptMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest,
      org.nebulas.rpc.proto.Rpc.TransactionResponse> getGetTransactionReceiptMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest, org.nebulas.rpc.proto.Rpc.TransactionResponse> getGetTransactionReceiptMethod;
    if ((getGetTransactionReceiptMethod = ApiServiceGrpc.getGetTransactionReceiptMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetTransactionReceiptMethod = ApiServiceGrpc.getGetTransactionReceiptMethod) == null) {
          ApiServiceGrpc.getGetTransactionReceiptMethod = getGetTransactionReceiptMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest, org.nebulas.rpc.proto.Rpc.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetTransactionReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.TransactionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetTransactionReceipt"))
                  .build();
          }
        }
     }
     return getGetTransactionReceiptMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSubscribeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SubscribeRequest,
      org.nebulas.rpc.proto.Rpc.SubscribeResponse> METHOD_SUBSCRIBE = getSubscribeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SubscribeRequest,
      org.nebulas.rpc.proto.Rpc.SubscribeResponse> getSubscribeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SubscribeRequest,
      org.nebulas.rpc.proto.Rpc.SubscribeResponse> getSubscribeMethod() {
    return getSubscribeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SubscribeRequest,
      org.nebulas.rpc.proto.Rpc.SubscribeResponse> getSubscribeMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.SubscribeRequest, org.nebulas.rpc.proto.Rpc.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getSubscribeMethod = ApiServiceGrpc.getSubscribeMethod) == null) {
          ApiServiceGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.SubscribeRequest, org.nebulas.rpc.proto.Rpc.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.SubscribeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGasPriceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GasPriceResponse> METHOD_GET_GAS_PRICE = getGetGasPriceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GasPriceResponse> getGetGasPriceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GasPriceResponse> getGetGasPriceMethod() {
    return getGetGasPriceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest,
      org.nebulas.rpc.proto.Rpc.GasPriceResponse> getGetGasPriceMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.GasPriceResponse> getGetGasPriceMethod;
    if ((getGetGasPriceMethod = ApiServiceGrpc.getGetGasPriceMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetGasPriceMethod = ApiServiceGrpc.getGetGasPriceMethod) == null) {
          ApiServiceGrpc.getGetGasPriceMethod = getGetGasPriceMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.NonParamsRequest, org.nebulas.rpc.proto.Rpc.GasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.NonParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GasPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetGasPrice"))
                  .build();
          }
        }
     }
     return getGetGasPriceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEstimateGasMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.GasResponse> METHOD_ESTIMATE_GAS = getEstimateGasMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.GasResponse> getEstimateGasMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.GasResponse> getEstimateGasMethod() {
    return getEstimateGasMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest,
      org.nebulas.rpc.proto.Rpc.GasResponse> getEstimateGasMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.GasResponse> getEstimateGasMethod;
    if ((getEstimateGasMethod = ApiServiceGrpc.getEstimateGasMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getEstimateGasMethod = ApiServiceGrpc.getEstimateGasMethod) == null) {
          ApiServiceGrpc.getEstimateGasMethod = getEstimateGasMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.TransactionRequest, org.nebulas.rpc.proto.Rpc.GasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "EstimateGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GasResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("EstimateGas"))
                  .build();
          }
        }
     }
     return getEstimateGasMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetEventsByHashMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.HashRequest,
      org.nebulas.rpc.proto.Rpc.EventsResponse> METHOD_GET_EVENTS_BY_HASH = getGetEventsByHashMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.HashRequest,
      org.nebulas.rpc.proto.Rpc.EventsResponse> getGetEventsByHashMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.HashRequest,
      org.nebulas.rpc.proto.Rpc.EventsResponse> getGetEventsByHashMethod() {
    return getGetEventsByHashMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.HashRequest,
      org.nebulas.rpc.proto.Rpc.EventsResponse> getGetEventsByHashMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.HashRequest, org.nebulas.rpc.proto.Rpc.EventsResponse> getGetEventsByHashMethod;
    if ((getGetEventsByHashMethod = ApiServiceGrpc.getGetEventsByHashMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetEventsByHashMethod = ApiServiceGrpc.getGetEventsByHashMethod) == null) {
          ApiServiceGrpc.getGetEventsByHashMethod = getGetEventsByHashMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.HashRequest, org.nebulas.rpc.proto.Rpc.EventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetEventsByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.HashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.EventsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetEventsByHash"))
                  .build();
          }
        }
     }
     return getGetEventsByHashMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDynastyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest,
      org.nebulas.rpc.proto.Rpc.GetDynastyResponse> METHOD_GET_DYNASTY = getGetDynastyMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest,
      org.nebulas.rpc.proto.Rpc.GetDynastyResponse> getGetDynastyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest,
      org.nebulas.rpc.proto.Rpc.GetDynastyResponse> getGetDynastyMethod() {
    return getGetDynastyMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest,
      org.nebulas.rpc.proto.Rpc.GetDynastyResponse> getGetDynastyMethodHelper() {
    io.grpc.MethodDescriptor<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest, org.nebulas.rpc.proto.Rpc.GetDynastyResponse> getGetDynastyMethod;
    if ((getGetDynastyMethod = ApiServiceGrpc.getGetDynastyMethod) == null) {
      synchronized (ApiServiceGrpc.class) {
        if ((getGetDynastyMethod = ApiServiceGrpc.getGetDynastyMethod) == null) {
          ApiServiceGrpc.getGetDynastyMethod = getGetDynastyMethod = 
              io.grpc.MethodDescriptor.<org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest, org.nebulas.rpc.proto.Rpc.GetDynastyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "org.nebulas.rpc.proto.ApiService", "GetDynasty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.nebulas.rpc.proto.Rpc.GetDynastyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ApiServiceMethodDescriptorSupplier("GetDynasty"))
                  .build();
          }
        }
     }
     return getGetDynastyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiServiceStub newStub(io.grpc.Channel channel) {
    return new ApiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApiServiceFutureStub(channel);
  }

  /**
   * <pre>
   * RPC API interface.
   * </pre>
   */
  public static abstract class ApiServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Return the state of the neb.
     * </pre>
     */
    public void getNebState(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetNebStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNebStateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Return the latest irreversible block.
     * </pre>
     */
    public void latestIrreversibleBlock(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLatestIrreversibleBlockMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Return the state of the account.
     * </pre>
     */
    public void getAccountState(org.nebulas.rpc.proto.Rpc.GetAccountStateRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountStateMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Call transaction
     * </pre>
     */
    public void call(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.CallResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Submit the signed transaction.
     * </pre>
     */
    public void sendRawTransaction(org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendRawTransactionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get block info by the block hash.
     * </pre>
     */
    public void getBlockByHash(org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHashMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get block info by the block height.
     * </pre>
     */
    public void getBlockByHeight(org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHeightMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get transactionReceipt info by tansaction hash.
     * </pre>
     */
    public void getTransactionReceipt(org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.TransactionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionReceiptMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe message
     * </pre>
     */
    public void subscribe(org.nebulas.rpc.proto.Rpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Get GasPrice
     * </pre>
     */
    public void getGasPrice(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGasPriceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * EstimateGas
     * </pre>
     */
    public void estimateGas(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEstimateGasMethodHelper(), responseObserver);
    }

    /**
     */
    public void getEventsByHash(org.nebulas.rpc.proto.Rpc.HashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.EventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventsByHashMethodHelper(), responseObserver);
    }

    /**
     */
    public void getDynasty(org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetDynastyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDynastyMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNebStateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NonParamsRequest,
                org.nebulas.rpc.proto.Rpc.GetNebStateResponse>(
                  this, METHODID_GET_NEB_STATE)))
          .addMethod(
            getLatestIrreversibleBlockMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NonParamsRequest,
                org.nebulas.rpc.proto.Rpc.BlockResponse>(
                  this, METHODID_LATEST_IRREVERSIBLE_BLOCK)))
          .addMethod(
            getGetAccountStateMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.GetAccountStateRequest,
                org.nebulas.rpc.proto.Rpc.GetAccountStateResponse>(
                  this, METHODID_GET_ACCOUNT_STATE)))
          .addMethod(
            getCallMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.TransactionRequest,
                org.nebulas.rpc.proto.Rpc.CallResponse>(
                  this, METHODID_CALL)))
          .addMethod(
            getSendRawTransactionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest,
                org.nebulas.rpc.proto.Rpc.SendTransactionResponse>(
                  this, METHODID_SEND_RAW_TRANSACTION)))
          .addMethod(
            getGetBlockByHashMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest,
                org.nebulas.rpc.proto.Rpc.BlockResponse>(
                  this, METHODID_GET_BLOCK_BY_HASH)))
          .addMethod(
            getGetBlockByHeightMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest,
                org.nebulas.rpc.proto.Rpc.BlockResponse>(
                  this, METHODID_GET_BLOCK_BY_HEIGHT)))
          .addMethod(
            getGetTransactionReceiptMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest,
                org.nebulas.rpc.proto.Rpc.TransactionResponse>(
                  this, METHODID_GET_TRANSACTION_RECEIPT)))
          .addMethod(
            getSubscribeMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.SubscribeRequest,
                org.nebulas.rpc.proto.Rpc.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getGetGasPriceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.NonParamsRequest,
                org.nebulas.rpc.proto.Rpc.GasPriceResponse>(
                  this, METHODID_GET_GAS_PRICE)))
          .addMethod(
            getEstimateGasMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.TransactionRequest,
                org.nebulas.rpc.proto.Rpc.GasResponse>(
                  this, METHODID_ESTIMATE_GAS)))
          .addMethod(
            getGetEventsByHashMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.HashRequest,
                org.nebulas.rpc.proto.Rpc.EventsResponse>(
                  this, METHODID_GET_EVENTS_BY_HASH)))
          .addMethod(
            getGetDynastyMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest,
                org.nebulas.rpc.proto.Rpc.GetDynastyResponse>(
                  this, METHODID_GET_DYNASTY)))
          .build();
    }
  }

  /**
   * <pre>
   * RPC API interface.
   * </pre>
   */
  public static final class ApiServiceStub extends io.grpc.stub.AbstractStub<ApiServiceStub> {
    private ApiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return the state of the neb.
     * </pre>
     */
    public void getNebState(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetNebStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNebStateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the latest irreversible block.
     * </pre>
     */
    public void latestIrreversibleBlock(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLatestIrreversibleBlockMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the state of the account.
     * </pre>
     */
    public void getAccountState(org.nebulas.rpc.proto.Rpc.GetAccountStateRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountStateMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Call transaction
     * </pre>
     */
    public void call(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.CallResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit the signed transaction.
     * </pre>
     */
    public void sendRawTransaction(org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendRawTransactionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get block info by the block hash.
     * </pre>
     */
    public void getBlockByHash(org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHashMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get block info by the block height.
     * </pre>
     */
    public void getBlockByHeight(org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get transactionReceipt info by tansaction hash.
     * </pre>
     */
    public void getTransactionReceipt(org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.TransactionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe message
     * </pre>
     */
    public void subscribe(org.nebulas.rpc.proto.Rpc.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SubscribeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get GasPrice
     * </pre>
     */
    public void getGasPrice(org.nebulas.rpc.proto.Rpc.NonParamsRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGasPriceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateGas
     * </pre>
     */
    public void estimateGas(org.nebulas.rpc.proto.Rpc.TransactionRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEstimateGasMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventsByHash(org.nebulas.rpc.proto.Rpc.HashRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.EventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventsByHashMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDynasty(org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest request,
        io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetDynastyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDynastyMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * RPC API interface.
   * </pre>
   */
  public static final class ApiServiceBlockingStub extends io.grpc.stub.AbstractStub<ApiServiceBlockingStub> {
    private ApiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return the state of the neb.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.GetNebStateResponse getNebState(org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNebStateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the latest irreversible block.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.BlockResponse latestIrreversibleBlock(org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getLatestIrreversibleBlockMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the state of the account.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.GetAccountStateResponse getAccountState(org.nebulas.rpc.proto.Rpc.GetAccountStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountStateMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Call transaction
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.CallResponse call(org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCallMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit the signed transaction.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.SendTransactionResponse sendRawTransaction(org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendRawTransactionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get block info by the block hash.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.BlockResponse getBlockByHash(org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHashMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get block info by the block height.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.BlockResponse getBlockByHeight(org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHeightMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get transactionReceipt info by tansaction hash.
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.TransactionResponse getTransactionReceipt(org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionReceiptMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe message
     * </pre>
     */
    public java.util.Iterator<org.nebulas.rpc.proto.Rpc.SubscribeResponse> subscribe(
        org.nebulas.rpc.proto.Rpc.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get GasPrice
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.GasPriceResponse getGasPrice(org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGasPriceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateGas
     * </pre>
     */
    public org.nebulas.rpc.proto.Rpc.GasResponse estimateGas(org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return blockingUnaryCall(
          getChannel(), getEstimateGasMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.nebulas.rpc.proto.Rpc.EventsResponse getEventsByHash(org.nebulas.rpc.proto.Rpc.HashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventsByHashMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.nebulas.rpc.proto.Rpc.GetDynastyResponse getDynasty(org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDynastyMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * RPC API interface.
   * </pre>
   */
  public static final class ApiServiceFutureStub extends io.grpc.stub.AbstractStub<ApiServiceFutureStub> {
    private ApiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Return the state of the neb.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.GetNebStateResponse> getNebState(
        org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNebStateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the latest irreversible block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.BlockResponse> latestIrreversibleBlock(
        org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLatestIrreversibleBlockMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the state of the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.GetAccountStateResponse> getAccountState(
        org.nebulas.rpc.proto.Rpc.GetAccountStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountStateMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Call transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.CallResponse> call(
        org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCallMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit the signed transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.SendTransactionResponse> sendRawTransaction(
        org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendRawTransactionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get block info by the block hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.BlockResponse> getBlockByHash(
        org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHashMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get block info by the block height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.BlockResponse> getBlockByHeight(
        org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHeightMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get transactionReceipt info by tansaction hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.TransactionResponse> getTransactionReceipt(
        org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionReceiptMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get GasPrice
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.GasPriceResponse> getGasPrice(
        org.nebulas.rpc.proto.Rpc.NonParamsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGasPriceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateGas
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.GasResponse> estimateGas(
        org.nebulas.rpc.proto.Rpc.TransactionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEstimateGasMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.EventsResponse> getEventsByHash(
        org.nebulas.rpc.proto.Rpc.HashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventsByHashMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.nebulas.rpc.proto.Rpc.GetDynastyResponse> getDynasty(
        org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDynastyMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NEB_STATE = 0;
  private static final int METHODID_LATEST_IRREVERSIBLE_BLOCK = 1;
  private static final int METHODID_GET_ACCOUNT_STATE = 2;
  private static final int METHODID_CALL = 3;
  private static final int METHODID_SEND_RAW_TRANSACTION = 4;
  private static final int METHODID_GET_BLOCK_BY_HASH = 5;
  private static final int METHODID_GET_BLOCK_BY_HEIGHT = 6;
  private static final int METHODID_GET_TRANSACTION_RECEIPT = 7;
  private static final int METHODID_SUBSCRIBE = 8;
  private static final int METHODID_GET_GAS_PRICE = 9;
  private static final int METHODID_ESTIMATE_GAS = 10;
  private static final int METHODID_GET_EVENTS_BY_HASH = 11;
  private static final int METHODID_GET_DYNASTY = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NEB_STATE:
          serviceImpl.getNebState((org.nebulas.rpc.proto.Rpc.NonParamsRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetNebStateResponse>) responseObserver);
          break;
        case METHODID_LATEST_IRREVERSIBLE_BLOCK:
          serviceImpl.latestIrreversibleBlock((org.nebulas.rpc.proto.Rpc.NonParamsRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_STATE:
          serviceImpl.getAccountState((org.nebulas.rpc.proto.Rpc.GetAccountStateRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetAccountStateResponse>) responseObserver);
          break;
        case METHODID_CALL:
          serviceImpl.call((org.nebulas.rpc.proto.Rpc.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.CallResponse>) responseObserver);
          break;
        case METHODID_SEND_RAW_TRANSACTION:
          serviceImpl.sendRawTransaction((org.nebulas.rpc.proto.Rpc.SendRawTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SendTransactionResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HASH:
          serviceImpl.getBlockByHash((org.nebulas.rpc.proto.Rpc.GetBlockByHashRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HEIGHT:
          serviceImpl.getBlockByHeight((org.nebulas.rpc.proto.Rpc.GetBlockByHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.BlockResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_RECEIPT:
          serviceImpl.getTransactionReceipt((org.nebulas.rpc.proto.Rpc.GetTransactionByHashRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.TransactionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.nebulas.rpc.proto.Rpc.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.SubscribeResponse>) responseObserver);
          break;
        case METHODID_GET_GAS_PRICE:
          serviceImpl.getGasPrice((org.nebulas.rpc.proto.Rpc.NonParamsRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasPriceResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_GAS:
          serviceImpl.estimateGas((org.nebulas.rpc.proto.Rpc.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GasResponse>) responseObserver);
          break;
        case METHODID_GET_EVENTS_BY_HASH:
          serviceImpl.getEventsByHash((org.nebulas.rpc.proto.Rpc.HashRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.EventsResponse>) responseObserver);
          break;
        case METHODID_GET_DYNASTY:
          serviceImpl.getDynasty((org.nebulas.rpc.proto.Rpc.ByBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<org.nebulas.rpc.proto.Rpc.GetDynastyResponse>) responseObserver);
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

  private static abstract class ApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.nebulas.rpc.proto.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiService");
    }
  }

  private static final class ApiServiceFileDescriptorSupplier
      extends ApiServiceBaseDescriptorSupplier {
    ApiServiceFileDescriptorSupplier() {}
  }

  private static final class ApiServiceMethodDescriptorSupplier
      extends ApiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiServiceFileDescriptorSupplier())
              .addMethod(getGetNebStateMethodHelper())
              .addMethod(getLatestIrreversibleBlockMethodHelper())
              .addMethod(getGetAccountStateMethodHelper())
              .addMethod(getCallMethodHelper())
              .addMethod(getSendRawTransactionMethodHelper())
              .addMethod(getGetBlockByHashMethodHelper())
              .addMethod(getGetBlockByHeightMethodHelper())
              .addMethod(getGetTransactionReceiptMethodHelper())
              .addMethod(getSubscribeMethodHelper())
              .addMethod(getGetGasPriceMethodHelper())
              .addMethod(getEstimateGasMethodHelper())
              .addMethod(getGetEventsByHashMethodHelper())
              .addMethod(getGetDynastyMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}

package org.nebulas.example;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.nebulas.account.AccountManager;
import org.nebulas.core.*;
import rpcpb.ApiServiceGrpc;
import rpcpb.Rpc;

import java.math.BigInteger;

public class TransactionExample {

    private static byte[] passphrase = "passphrase".getBytes();

    public static void main(String args[]) throws Exception {
        AccountManager manager = new AccountManager();

        // binary tx
        int chainID = 100; //1 mainet,1001 testnet, 100 default private
        Address from = manager.newAccount(passphrase);
        Address to = manager.newAccount("topassphrase".getBytes());
        BigInteger value = new BigInteger("0");
        long nonce = 1; // nonce = from.nonce + 1
        Transaction.PayloadType payloadType = Transaction.PayloadType.BINARY;
        byte[] payload = new TransactionBinaryPayload(null).toBytes();
        BigInteger gasPrice = new BigInteger("1000000"); // 0 < gasPrice < 10^12
        BigInteger gasLimit = new BigInteger("20000"); // 20000 < gasPrice < 50*10^9
        Transaction tx = new Transaction(chainID, from, to, value, nonce, payloadType, payload, gasPrice, gasLimit);
        manager.signTransaction(tx,passphrase);
        byte[] rawData = tx.toProto();
        // senrawTransaction with @rawData
        // https://github.com/nebulasio/wiki/blob/master/rpc.md#sendrawtransaction
        SendRawTransaction(rawData);

        // deploy tx
        payloadType = Transaction.PayloadType.DEPLOY;
        payload = new TransactionDeployPayload("js", "var demo = 1;", "").toBytes();
        // deploy from == to
        tx = new Transaction(chainID, from, from, value, nonce, payloadType, payload, gasPrice, gasLimit);
        manager.signTransaction(tx,passphrase);
        rawData = tx.toProto();
        // senrawTransaction with @rawData
        // https://github.com/nebulasio/wiki/blob/master/rpc.md#sendrawtransaction
        SendRawTransaction(rawData);

        // call tx
        payloadType = Transaction.PayloadType.CALL;
        payload = new TransactionCallPayload("function", "").toBytes();
        // call to = contract address
        to = Address.ParseFromString("n1g6JZsQS1uRUySdwvuFJ7FYT4dFoyoSN5q");
        tx = new Transaction(chainID, from, from, value, nonce, payloadType, payload, gasPrice, gasLimit);
        manager.signTransaction(tx,passphrase);
        rawData = tx.toProto();
        // senrawTransaction with @rawData
        // https://github.com/nebulasio/wiki/blob/master/rpc.md#sendrawtransaction
        SendRawTransaction(rawData);
    }

    private static void SendRawTransaction(byte[] data) throws Exception {
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8684).usePlaintext().build();
        Rpc.SendRawTransactionRequest request = Rpc.SendRawTransactionRequest
                .newBuilder()
                .setData(ByteString.copyFrom(data))
                .build();

        ApiServiceGrpc.ApiServiceBlockingStub apiServiceStub = ApiServiceGrpc.newBlockingStub(channel);
        Rpc.SendTransactionResponse response = apiServiceStub.sendRawTransaction(request);
        System.out.println(response);

//        ApiServiceGrpc.ApiServiceStub serviceStub = ApiServiceGrpc.newStub(channel);
//        final CountDownLatch finishLatch = new CountDownLatch(1);
//        StreamObserver<Rpc.SendTransactionResponse> observer = new StreamObserver<Rpc.SendTransactionResponse>() {
//            @Override
//            public void onNext(Rpc.SendTransactionResponse value) {
//                System.out.println(value);
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                finishLatch.countDown();
//            }
//
//            @Override
//            public void onCompleted() {
//                finishLatch.countDown();
//            }
//        };
//
//        serviceStub.sendRawTransaction(request,observer);
    }
}

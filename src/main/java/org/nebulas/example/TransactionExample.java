package org.nebulas.example;

import org.nebulas.account.AccountManager;
import org.nebulas.core.*;

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


        // deploy tx
        payloadType = Transaction.PayloadType.DEPLOY;
        payload = new TransactionDeployPayload("js", "var demo = 1;", "").toBytes();
        // deploy from == to
        tx = new Transaction(chainID, from, from, value, nonce, payloadType, payload, gasPrice, gasLimit);
        manager.signTransaction(tx,passphrase);
        rawData = tx.toProto();
        // senrawTransaction with @rawData
        // https://github.com/nebulasio/wiki/blob/master/rpc.md#sendrawtransaction

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
    }
}

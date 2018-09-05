package io.nebulas.examples;

import io.nebulas.account.AccountManager;
import io.nebulas.client.NebulasClient;
import io.nebulas.client.api.request.SendRawTransactionRequest;
import io.nebulas.client.api.response.RawTransaction;
import io.nebulas.client.api.response.Response;
import io.nebulas.client.impl.HttpNebulasClient;
import io.nebulas.core.Address;
import io.nebulas.core.Transaction;
import io.nebulas.core.TransactionBinaryPayload;
import org.spongycastle.util.encoders.Base64;

import java.math.BigInteger;

public class SendTransactionExample {

    private static byte[] passphrase = "passphrase".getBytes();

    public static void main(String args[]) throws Exception {
        AccountManager manager = new AccountManager();

        // binary tx
        int chainID = 1001; //1 mainet,1001 testnet, 100 default private
        Address from = manager.newAccount(passphrase);
        Address to = Address.ParseFromString("n1g6JZsQS1uRUySdwvuFJ7FYT4dFoyoSN5q");
        BigInteger value = new BigInteger("0");
        long nonce = 1; // nonce = from.nonce + 1
        Transaction.PayloadType payloadType = Transaction.PayloadType.BINARY;
        byte[] payload = new TransactionBinaryPayload(null).toBytes();
        BigInteger gasPrice = new BigInteger("1000000"); // 0 < gasPrice < 10^12
        BigInteger gasLimit = new BigInteger("20000"); // 20000 < gasPrice < 50*10^9
        Transaction tx = new Transaction(chainID, from, to, value, nonce, payloadType, payload, gasPrice, gasLimit);

        manager.signTransaction(tx, passphrase);
        byte[] rawData = tx.toProto();
        String rawTransaction = Base64.toBase64String(rawData);

        NebulasClient nebulasClient = HttpNebulasClient.create("https://testnet.nebulas.io");
        Response<RawTransaction> response = nebulasClient.sendRawTransaction(new SendRawTransactionRequest().setData(rawTransaction));
        System.out.println(response);
    }
}

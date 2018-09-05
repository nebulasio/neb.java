package io.nebulas.examples;

import io.nebulas.account.AccountManager;
import io.nebulas.client.NebulasClient;
import io.nebulas.client.api.request.GetAccountStateRequest;
import io.nebulas.client.api.request.SendRawTransactionRequest;
import io.nebulas.client.api.response.AccountState;
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
        NebulasClient nebulasClient = HttpNebulasClient.create("https://testnet.nebulas.io");

        // copy/read the keyJson string from your KeyStore file.
        String keyJson = "{\"version\":4,\"id\":\"72dd1261-96dc-4463-ad97-dd212795e1a0\",\"address\":\"n1H2Yb5Q6ZfKvs61htVSV4b1U2gr2GA9vo6\",\"crypto\":{\"ciphertext\":\"40352b32f39392b38022c2a778cf8424ab823b2288c85a25f6097c1455837b74\",\"cipherparams\":{\"iv\":\"0f0fb4b21e0727c16aabf339540b80f8\"},\"cipher\":\"aes-128-ctr\",\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"salt\":\"405dfabee17917c4f4f7b818e387200fc83452d57b00d9ea329a5687d07aca01\",\"n\":4096,\"r\":8,\"p\":1},\"mac\":\"59d9d7a36726ce3da1bf2d20d7469800376b0975e7110afbd578cf3401666557\",\"machash\":\"sha3256\"}}";
        byte[] passphrase = "passphrase".getBytes();

        // binary tx
        int chainID = 1001; //1 mainet,1001 testnet, 100 default private
        //Address from = manager.newAccount(passphrase);        //create a new account.
        Address from = manager.load(keyJson.getBytes(), passphrase); //load an accounnt
        Address to = Address.ParseFromString("n1g6JZsQS1uRUySdwvuFJ7FYT4dFoyoSN5q");
        BigInteger value = new BigInteger("0");
        //long nonce = 1; // nonce = from.nonce + 1
        Response<AccountState> accountState = nebulasClient.getAccountState(new GetAccountStateRequest(from.string()));
        Long nonce = accountState.getResult().getNonce() + 1;

        Transaction.PayloadType payloadType = Transaction.PayloadType.BINARY;
        byte[] payload = new TransactionBinaryPayload(null).toBytes();
        BigInteger gasPrice = new BigInteger("1000000"); // 0 < gasPrice < 10^12
        BigInteger gasLimit = new BigInteger("20000"); // 20000 < gasPrice < 50*10^9
        Transaction tx = new Transaction(chainID, from, to, value, nonce, payloadType, payload, gasPrice, gasLimit);

        manager.signTransaction(tx, passphrase);
        byte[] rawData = tx.toProto();
        String rawTransaction = Base64.toBase64String(rawData);

        Response<RawTransaction> response = nebulasClient.sendRawTransaction(new SendRawTransactionRequest().setData(rawTransaction));
        System.out.println(response);
    }
}

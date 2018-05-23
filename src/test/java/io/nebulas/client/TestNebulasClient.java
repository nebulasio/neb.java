package io.nebulas.client;

import io.nebulas.client.api.request.*;
import io.nebulas.client.api.response.*;
import io.nebulas.client.impl.HttpNebulasClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Create by liuyang89 on 2018/05/10
 **/
@RunWith(JUnit4.class)
public class TestNebulasClient {

    private NebulasClient nebulasClient = HttpNebulasClient.create("https://testnet.nebulas.io");

    @Test
    public void testGetNebState() {
        Response<NebState> response = nebulasClient.getNebState();
        System.out.println(response);
    }

    @Test
    public void testGetAccountState() {
        Response<AccountState> response = nebulasClient.getAccountState(new GetAccountStateRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3"));
        System.out.println(response);
    }

    @Test
    public void testLatestIrreversibleBlock() {
        Response<Block> response = nebulasClient.latestIrreversibleBlock();
        System.out.println(response);
    }

    @Test
    public void testCall() {
        Response<CallResult> response =
                nebulasClient.call(new CallRequest("n1Z6SbjLuAEXfhX1UJvXT6BB5osWYxVg3F3", "n1mL2WCZyRi1oELEugfCZoNAW3dt8QpHtJw", "0", 3l, "1000000", "2000000", new Contract().setFunction("transferValue").setArgs("[500]")));
        System.out.println(response);
    }

    @Test
    public void testSendRawTransaction() {
        Response<RawTransaction> response = nebulasClient.sendRawTransaction(new SendRawTransactionRequest().setData("CiCrHtxyyIJks2/RErvBBA862D6iwAaGQ9OK1NisSGAuTBIYGiY1R9Fnx0z0uPkWbPokTeBIHFFKRaosGhgzPLPtjEF5cYRTgu3jz2egqWJwwF/i9wAiEAAAAAAAAAAADeC2s6dkAAAoAjDd/5jSBToICgZiaW5hcnlAZEoQAAAAAAAAAAAAAAAAAA9CQFIQAAAAAAAAAAAAAAAAAABOIFgBYkGLnnvGZEDSlocc202ZRWtUlbl2RHfGNdBY5eajFiHKThfgXIwGixh17LpnZGnYHlmfiGe2zqnFHdj7G8b2XIP2AQ=="));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHash() {
        Response<Block> response = nebulasClient.getBlockByHash(new GetBlockByHashRequest("00000658397a90df6459b8e7e63ad3f4ce8f0a40b8803ff2f29c611b2e0190b8", true));
        System.out.println(response);
    }

    @Test
    public void testGetBlockByHeight() {
        Response<Block> response = nebulasClient.getBlockByHeight(new GetBlockByHeightRequest(1l, true));
        System.out.println(response);
    }

    @Test
    public void testGetTransactionReceipt() {
        Response<TransactionReceipt> response = nebulasClient.getTransactionReceipt(new GetTransactionReceiptRequest("cda54445ffccf4ea17f043e86e54be11b002053f9edbe30ae1fbc0437c2b6a73"));
        System.out.println(response);
    }

    @Test
    public void testGetGasPrice(){
        Response<GasPrice> response = nebulasClient.getGasPrice();
        System.out.println(response);

    }
    @Test
    public void testEstimateGas(){
        Response<EstimateGas> response = nebulasClient.estimateGas(new EstimateGasRequest().setFrom("n1QZMXSZtW7BUerroSms4axNfyBGyFGkrh5").setTo("n1SAeQRVn33bamxN4ehWUT7JGdxipwn8b17").setValue("1000000000000000000").setNonce(1l).setGasPrice("1000000").setGasLimit("2000000"));
        System.out.println(response);
    }

    @Test
    public void testGetEventsByHash(){
        Response<GetEventsByHashResult> response = nebulasClient.getEventsByHash(new GetEventByHashRequest().setHash("ec239d532249f84f158ef8ec9262e1d3d439709ebf4dd5f7c1036b26c6fe8073"));
        System.out.println(response);
    }

    @Test
    public void testSubscribe(){
        Response<Event> response = nebulasClient.subscribe(new SubscribeRequest("chain.linkBlock", "chain.pendingTransaction"));
        System.out.println(response);
    }

    @Test
    public void testGetDynasty(){
        Response<GetMinerResult> response = nebulasClient.getDynasty(new GetMinerRequest(1l));
        System.out.println(response);
    }

}

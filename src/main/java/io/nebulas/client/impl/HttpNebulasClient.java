package io.nebulas.client.impl;

import com.google.gson.reflect.TypeToken;
import io.nebulas.client.NebulasClient;
import io.nebulas.client.api.request.*;
import io.nebulas.client.api.response.*;
import io.nebulas.client.http.HttpClient;
import io.nebulas.client.http.HttpClientListener;
import io.nebulas.client.http.OKHttpClient;
import okhttp3.OkHttpClient;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class HttpNebulasClient implements NebulasClient {

    private String host;

    private HttpClient client;

    /**
    * method get instance of HttpNebulasAdminClient
    */
    public static NebulasClient create(String host) {
        return new HttpNebulasClient(host);
    }

    public static NebulasClient create(String host, OkHttpClient okHttpClient) {
        return new HttpNebulasClient(host , okHttpClient);
    }

    /**
    * HttpNebulasClient constructor with parameter host
    *
    * @param host
    */
    public HttpNebulasClient(String host) {
        this.host = host;
        this.client = new OKHttpClient();
    }

    /**
    * HttpNebulasClient constructor with parameters host and client
    *
    * @param host
    * @param client - Instance of OkHttpClient
    */
    public HttpNebulasClient(String host, OkHttpClient client) {
        this.host = host;
        this.client = new OKHttpClient(client);
    }

    /**
    * method get the neb state
    */
    @Override
    public Response<NebState> getNebState() {
        return client.get(host + "/v1/user/nebstate", new TypeToken<Response<NebState>>() {});
    }

    /**
    * method get the state of acount
    */
    @Override
    public Response<AccountState> getAccountState(GetAccountStateRequest request) {
        return client.post(host + "/v1/user/accountstate", request, new TypeToken<Response<AccountState>>() {});
    }

    @Override
    public Response<Block> latestIrreversibleBlock() {
        return client.get(host + "/v1/user/lib", new TypeToken<Response<Block>>(){});
    }

    /**
    * method 
    */
    @Override
    public Response<CallResult> call(CallRequest request) {
        return client.post(host + "/v1/user/call", request , new TypeToken<Response<CallResult>>(){});
    }

    
    @Override
    public Response<RawTransaction> sendRawTransaction(SendRawTransactionRequest request) {
        return client.post(host + "/v1/user/rawtransaction",request ,  new TypeToken<Response<RawTransaction>>(){});
    }

    /**
    * method get the block by hash
    */
    @Override
    public Response<Block> getBlockByHash(GetBlockByHashRequest request) {
        return client.post(host + "/v1/user/getBlockByHash", request , new TypeToken<Response<Block>>(){});
    }

    /**
    * method get the bolck by heigaht
    */
    @Override
    public Response<Block> getBlockByHeight(GetBlockByHeightRequest request) {
        return client.post(host + "/v1/user/getBlockByHeight", request , new TypeToken<Response<Block>>(){});
    }

    /**
    * method get the information of transaction
    */
    @Override
    public Response<TransactionReceipt> getTransactionReceipt(GetTransactionReceiptRequest request) {
        return client.post(host + "/v1/user/getTransactionReceipt", request , new TypeToken<Response<TransactionReceipt>>(){});
    }

    /**
    * method get the gas price
    */
    @Override
    public Response<GasPrice> getGasPrice() {
        return client.get(host + "/v1/user/getGasPrice", new TypeToken<Response<GasPrice>>(){});
    }

    /**
    * method get the stimateeGas
    */
    @Override
    public Response<EstimateGas> estimateGas(EstimateGasRequest request) {
        return client.post(host + "/v1/user/stimateeGas", request , new TypeToken<Response<EstimateGas>>(){});
    }

    /**
    * method get the events by hash
    */
    @Override
    public Response<GetEventsByHashResult> getEventsByHash(GetEventByHashRequest request) {
        return client.post(host + "/v1/user/getEventsByHash" , request , new TypeToken<Response<GetEventsByHashResult>>(){});
    }

    @Override
    public Response<GetMinerResult> getDynasty(GetMinerRequest request) {
        return client.post(host + "/v1/user/dynasty" , request , new TypeToken<Response<GetMinerResult>>(){});
    }

    @Override
    public void subscribe(SubscribeRequest request, HttpClientListener listener) {
        client.URLConnectionPost(host + "/v1/user/subscribe", request, listener, new TypeToken<Response<Event>>(){});
    }
}

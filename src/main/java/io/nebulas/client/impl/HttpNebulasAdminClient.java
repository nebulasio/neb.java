package io.nebulas.client.impl;

import com.google.gson.reflect.TypeToken;
import io.nebulas.client.NebulasAdminClient;
import io.nebulas.client.admin.request.*;
import io.nebulas.client.admin.response.*;
import io.nebulas.client.api.response.Response;
import io.nebulas.client.http.HttpClient;
import io.nebulas.client.http.OKHttpClient;
import okhttp3.OkHttpClient;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class HttpNebulasAdminClient implements NebulasAdminClient {

    private String host;

    private HttpClient client;

    /**
    * get instance of HttpNebulasAdminClient
    */
    public static NebulasAdminClient create(String host) {
        return new HttpNebulasAdminClient(host);
    }

    public static NebulasAdminClient create(String host, OkHttpClient okHttpClient) {
        return new HttpNebulasAdminClient(host, okHttpClient);
    }

 
    /**
    * HttpNebulasAdminClient constructor with parameter host
    *
    * @param {String} host
    */
    public HttpNebulasAdminClient(String host) {
        this.host = host;
        this.client = new OKHttpClient();
    }

    /**
    * HttpNebulasAdminClient constructor with parameters host and client
    *
    * @param {String} host
    * @param {OkHttpClient} client - Instance of OkHttpClient
    */
    public HttpNebulasAdminClient(String host, OkHttpClient client) {
        this.host = host;
        this.client = new OKHttpClient(client);
    }

    /**
    * method get the information of node
    */
    @Override
    public Response<NodeInfo> nodeInfo() {
        return client.get(host + "/v1/user/nodeinfo" , new TypeToken<Response<NodeInfo>>(){});
    }

    /**
    * method get the accounts
    */
    @Override
    public Response<Accounts> accounts() {
        return client.get(host + "/v1/admin/accounts" , new TypeToken<Response<Accounts>>(){});
    }

    /**
    * method create a new account
    */
    @Override
    public Response<Account> createAccount(CreateAccountRequest request) {
        return client.post(host + "/v1/admin/account/new" ,request ,  new TypeToken<Response<Account>>(){});
    }

    /**
    * method unlock a account  
    */
    @Override
    public Response<UnLockAccountResult> unLockAccount(UnLockAccountRequest request) {
        return client.post(host + "/v1/admin/account/unlock" ,request , new TypeToken<Response<UnLockAccountResult>>(){});
    }
 
    /**
    * method lock a account 
    */
    @Override
    public Response<LockAccountResult> lockAccount(LockAccountRequest request) {
        return client.post(host + "/v1/admin/account/lock" ,request ,  new TypeToken<Response<LockAccountResult>>(){});
    }

    /**
    * method take a sign
    */
    @Override
    public Response<SignTransactionWithPassphraseResult> signTransactionWithPassphrase(SignTransactionWithPassphraseRequest request) {
        return client.post(host + "/v1/admin/sign" , request , new TypeToken<Response<SignTransactionWithPassphraseResult>>(){});
    }

    /**
    * method send a transaction with passphrase
    */
    @Override
    public Response<SendTransactionWithPassphraseResult> sendTransactionWithPassphrase(SendTransactionWithPassphraseRequest request) {
        return client.post(host + "/v1/admin/transactionWithPassphrase" , request , new TypeToken<Response<SendTransactionWithPassphraseResult>>(){});
    }

    /**
    * method send a transaction
    */
    @Override
    public Response<SendTransactionResult> sendTransaction(SendTransactionRequest request) {
        return client.post(host + "/v1/user/transaction" , request , new TypeToken<Response<SendTransactionResult>>(){});
    }

    
    @Override
    public Response<SignHashResult> signHash(SignHashRequest request) {
        return client.post(host + "/v1/admin/sign/hash" ,request , new TypeToken<Response<SignHashResult>>(){});
    }

    @Override
    public Response<StartPprofResult> startPprof(StartPprofRequest request) {
        return client.post(host + "/v1/admin/pprof" , request , new TypeToken<Response<StartPprofResult>>(){});
    }

    /**
    * method get config file
    */
    @Override
    public Response<NebConfig> getConfig() {
        return client.get(host + "/v1/admin/getConfig" , new TypeToken<Response<NebConfig>>(){});
    }

}

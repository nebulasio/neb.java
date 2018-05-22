package io.nebulas.client;

import io.nebulas.client.admin.request.*;
import io.nebulas.client.admin.response.*;
import io.nebulas.client.api.response.Response;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public interface NebulasAdminClient {

    Response<NodeInfo> nodeInfo();

    Response<Accounts> accounts();

    Response<Account> createAccount(CreateAccountRequest request);

    Response<UnLockAccountResult> unLockAccount(UnLockAccountRequest request);

    Response<LockAccountResult> lockAccount(LockAccountRequest request);

    Response<SignTransactionWithPassphraseResult> signTransactionWithPassphrase(SignTransactionWithPassphraseRequest request);

    Response<SendTransactionWithPassphraseResult> sendTransactionWithPassphrase(SendTransactionWithPassphraseRequest request);

    Response<SendTransactionResult> sendTransaction(SendTransactionRequest request);

    Response<SignHashResult> signHash(SignHashRequest request);

    Response<StartPprofResult> startPprof(StartPprofRequest request);

    Response<NebConfig> getConfig();

}

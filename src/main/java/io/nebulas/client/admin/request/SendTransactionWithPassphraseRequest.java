package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/18
 **/
public class SendTransactionWithPassphraseRequest implements Serializable {

    private SendTransactionRequest transaction;

    private String passphrase;

    /**
     * <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#sendtransactionwithpassphrase">send transaction with passphrase</a>
     * @param transaction the transaction to be send, this is the same as the SendTransaction parameters
     * @param passphrase the passphrase of sender account
     */
    public SendTransactionWithPassphraseRequest(SendTransactionRequest transaction, String passphrase) {
        this.transaction = transaction;
        this.passphrase = passphrase;
    }

    public SendTransactionRequest getTransaction() {
        return transaction;
    }

    public SendTransactionWithPassphraseRequest setTransaction(SendTransactionRequest transaction) {
        this.transaction = transaction;
        return this;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public SendTransactionWithPassphraseRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendTransactionWithPassphraseRequest{");
        sb.append("transaction=").append(transaction);
        sb.append(", passphrase='").append(passphrase).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

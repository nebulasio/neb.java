package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SignTransactionWithPassphraseRequest implements Serializable {

    private SendTransactionRequest transaction;

    private String passphrase;

    public SignTransactionWithPassphraseRequest(SendTransactionRequest transaction, String passphrase) {
        this.transaction = transaction;
        this.passphrase = passphrase;
    }

    public SendTransactionRequest getTransaction() {
        return transaction;
    }

    public SignTransactionWithPassphraseRequest setTransaction(SendTransactionRequest transaction) {
        this.transaction = transaction;
        return this;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public SignTransactionWithPassphraseRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignTransactionWithPassphraseRequest{");
        sb.append("transaction=").append(transaction);
        sb.append(", passphrase='").append(passphrase).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

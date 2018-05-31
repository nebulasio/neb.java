package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/18
 **/
public class SendTransactionWithPassphraseRequest implements Serializable {

    private SendTransactionRequest transaction;

    private String passphrase;

    /**
    * SendTransactionWithPassphraseRequest constructor
    *
    * @param {SendTransactionRequest} transaction
    *
    * @param {String} passphrase
    *
    * @example
    * SendTransactionRequest transaction = new SendTransactionRequest();
    * String passphrase = "passphrase";
    * SendTransactionWithPassphraseRequest sendTransactionWithPassphraseRequest = new SendTransactionWithPassphraseRequest(transaction,transaction);
    */
    public SendTransactionWithPassphraseRequest(SendTransactionRequest transaction, String transaction) {
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

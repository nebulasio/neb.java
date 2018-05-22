package io.nebulas.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SignTransactionWithPassphraseResult implements Serializable {

    private String data;

    public String getData() {
        return data;
    }

    public SignTransactionWithPassphraseResult setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignTransactionResult{");
        sb.append("data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class SendRawTransactionRequest implements Serializable {

    private String data;

    public SendRawTransactionRequest() {
    }

    public SendRawTransactionRequest(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public SendRawTransactionRequest setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SendRawTransactionRequest{");
        sb.append("data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

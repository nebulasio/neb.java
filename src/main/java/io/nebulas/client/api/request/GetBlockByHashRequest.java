package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetBlockByHashRequest implements Serializable {

    private String hash;

    private boolean fullFillTransaction;

    public GetBlockByHashRequest() {
    }

    public GetBlockByHashRequest(String hash, boolean fullFillTransaction) {
        this.hash = hash;
        this.fullFillTransaction = fullFillTransaction;
    }

    public String getHash() {
        return hash;
    }

    public GetBlockByHashRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public boolean isFullFillTransaction() {
        return fullFillTransaction;
    }

    public GetBlockByHashRequest setFullFillTransaction(boolean fullFillTransaction) {
        this.fullFillTransaction = fullFillTransaction;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBlockByHashRequest{");
        sb.append("hash='").append(hash).append('\'');
        sb.append(", fullFillTransaction=").append(fullFillTransaction);
        sb.append('}');
        return sb.toString();
    }
}

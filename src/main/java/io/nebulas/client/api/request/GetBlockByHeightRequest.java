package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetBlockByHeightRequest implements Serializable {

    private Long height;

    private boolean fullFillTransaction;

    public GetBlockByHeightRequest() {
    }

    public GetBlockByHeightRequest(Long height, boolean fullFillTransaction) {
        this.height = height;
        this.fullFillTransaction = fullFillTransaction;
    }

    public Long getHeight() {
        return height;
    }

    public GetBlockByHeightRequest setHeight(Long height) {
        this.height = height;
        return this;
    }

    public boolean isFullFillTransaction() {
        return fullFillTransaction;
    }

    public GetBlockByHeightRequest setFullFillTransaction(boolean fullFillTransaction) {
        this.fullFillTransaction = fullFillTransaction;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBlockByHeightRequest{");
        sb.append("height='").append(height).append('\'');
        sb.append(", fullFillTransaction=").append(fullFillTransaction);
        sb.append('}');
        return sb.toString();
    }
}

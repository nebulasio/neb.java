package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetMinerRequest implements Serializable {

    private Long height;

    public GetMinerRequest() {
    }

    public GetMinerRequest(Long height) {
        this.height = height;
    }

    public Long getHeight() {
        return height;
    }

    public GetMinerRequest setHeight(Long height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMinerRequest{");
        sb.append("height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

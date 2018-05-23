package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/07
 **/
public class GetEventByHashRequest implements Serializable {

    private String hash;

    public GetEventByHashRequest() {
    }

    public GetEventByHashRequest(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public GetEventByHashRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetEventByHashRequest{");
        sb.append("hash='").append(hash).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

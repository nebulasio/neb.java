package io.nebulas.client.api.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/05
 **/
public class GetAccountStateRequest implements Serializable {

    private String address;

    private Long height;

    public GetAccountStateRequest() {
    }

    public GetAccountStateRequest(String address) {
        this.address = address;
    }

    public GetAccountStateRequest(String address, Long height) {
        this.address = address;
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public GetAccountStateRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public Long getHeight() {
        return height;
    }

    public GetAccountStateRequest setHeight(Long height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAccountStateRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

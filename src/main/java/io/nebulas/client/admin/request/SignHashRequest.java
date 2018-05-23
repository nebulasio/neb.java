package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SignHashRequest implements Serializable {

    private String address;

    private String hash;

    private Integer alg;

    public SignHashRequest() {
    }

    public SignHashRequest(String address, String hash, Integer alg) {
        this.address = address;
        this.hash = hash;
        this.alg = alg;
    }

    public String getAddress() {
        return address;
    }

    public SignHashRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public SignHashRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Integer getAlg() {
        return alg;
    }

    public SignHashRequest setAlg(Integer alg) {
        this.alg = alg;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignHashRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append(", hash='").append(hash).append('\'');
        sb.append(", alg='").append(alg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

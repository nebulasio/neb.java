package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class SignHashRequest implements Serializable {
    /**
    * @property {String} address
    * @property {String} hash
    * @property {Integer} alg
    */
    private String address;

    private String hash;

    private Integer alg;

    /**
    * SignHashRequest constructor
    */
    public SignHashRequest() {
    }

    public SignHashRequest(String address, String hash, Integer alg) {
        this.address = address;
        this.hash = hash;
        this.alg = alg;
    }

    /**
    * method get the address
    */
    public String getAddress() {
        return address;
    }

    /**
    * method set the address and get the object
    */
    public SignHashRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
    * method get the hash 
    */
    public String getHash() {
        return hash;
    }

    /**
    * method set the hash and get the object
    */
    public SignHashRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
    * method get the alg
    */
    public Integer getAlg() {
        return alg;
    }

    /**
    * method set the alg and get the object
    */
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

package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class LockAccountRequest implements Serializable {

    /**
    * @property {String} address
    */
    private String address;

    /**
    * LockAccountRequest constructor
    */
    public LockAccountRequest() {
    }

    /**
    * LockAccountRequest constructor with parameter address
    *
    * @parameter {String} address
    */
    public LockAccountRequest(String address) {
        this.address = address;
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
    public LockAccountRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LockAccountRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

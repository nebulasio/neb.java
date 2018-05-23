package io.nebulas.client.admin.response;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class Account implements Serializable {

    private String address;

    public String getAddress() {
        return address;
    }

    public Account setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

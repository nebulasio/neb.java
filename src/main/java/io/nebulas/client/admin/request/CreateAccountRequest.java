package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class CreateAccountRequest implements Serializable {

    private String passphrase;

    public CreateAccountRequest() {
    }

    public CreateAccountRequest(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public CreateAccountRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    @Override
    public String
    toString() {
        final StringBuilder sb = new StringBuilder("CreateAccountRequest{");
        sb.append("passphrase='").append(passphrase).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

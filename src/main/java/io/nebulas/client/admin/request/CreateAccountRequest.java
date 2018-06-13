package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class CreateAccountRequest implements Serializable {

    private String passphrase;

    /**
     * CreateAccountRequest constructor
     * <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#newaccount">new account</a>
     */
    public CreateAccountRequest() {
    }

    public CreateAccountRequest(String passphrase) {
        this.passphrase = passphrase;
    }

    public CreateAccountRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    public String getPassphrase() {
        return passphrase;
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

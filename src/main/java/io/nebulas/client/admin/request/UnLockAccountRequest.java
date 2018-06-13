package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class UnLockAccountRequest implements Serializable {

    private String address;

    private String passphrase;

    private String duration;

    /**
    * UnLockAccountRequest constructor
    */
    public UnLockAccountRequest() {
    }

    /**
     * <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#unlockaccount">unlock account</a>
     * @param address account address to be unlocked
     * @param passphrase account passphrase.
     * @param duration unlock duration. The unit is ns (10e-9 s).
     */
    public UnLockAccountRequest(String address, String passphrase, String duration) {
        this.address = address;
        this.passphrase = passphrase;
        this.duration = duration;
    }

    public String getAddress() {
        return address;
    }

    public UnLockAccountRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
    * method get the passphrase
    */
    public String getPassphrase() {
        return passphrase;
    }

    /**
    * method set the passphraser and get the object
    */
    public UnLockAccountRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }

    /**
    * method get the duration
    */
    public String getDuration() {
        return duration;
    }

    /**
    * method set the duration and get the object
    */
    public UnLockAccountRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnLockAccountRequest{");
        sb.append("address='").append(address).append('\'');
        sb.append(", passphrase='").append(passphrase).append('\'');
        sb.append(", duration='").append(duration).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

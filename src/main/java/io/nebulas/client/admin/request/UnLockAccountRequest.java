package io.nebulas.client.admin.request;

import java.io.Serializable;

/**
 * Create by liuyang89 on 2018/05/10
 **/
public class UnLockAccountRequest implements Serializable {
    /**
    * @property {String} address
    * @property {String} passphrase
    * @property {String} duration
    */
    private String address;

    private String passphrase;

    private String duration;

    /**
    * UnLockAccountRequest constructor
    */
    public UnLockAccountRequest() {
    }

    public UnLockAccountRequest(String address, String passphrase, String duration) {
        this.address = address;
        this.passphrase = passphrase;
        this.duration = duration;
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

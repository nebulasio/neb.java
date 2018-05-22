package io.nebulas.account;

import io.nebulas.core.Address;

/**
 * The Account class.
 * <p>Account only contains account address and keyPath info.
 * <ul>
 *     <li>Address is the object that contains address info for this account</li>
 *     <li>KeyPath is the local file path where the account wallet json file is stored.
 *     Note that saving account wallet file(KeyJson) to KeyPath is not implemented now.
 *     </li>
 * </ul>
 *
 * @see Address
 */
public class Account {

    private Address address;

    private String keyPath;

    /**
     * Constructs a new Account with a given address object.
     *  @see Address
     * @param address the account address.
     */
    public Account(Address address) {
        this.address = address;
    }

    /**
     * Get account address.
     *
     * @return the account address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets account address.
     *
     * @param address the account address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Get account key path.
     * Key path is the local file path where the account wallet json file is stored.
     *
     * @return the accpunt key path
     */
    public String getKeyPath() {
        return keyPath;
    }

    /**
     * Set account key path.
     *
     * @param keyPath the account key path
     */
    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }
}

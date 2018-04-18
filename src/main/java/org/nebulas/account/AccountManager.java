package org.nebulas.account;

import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.Keystore;

import java.util.Map;

public class AccountManager {

    private static final String DEFAULTKEYDIR = "keydir";

    Keystore keystore;

    String keydir;

    Algorithm encryptAlg;
    Algorithm signatureAlg;

    Map<String, Account> accountMap;

    public AccountManager() throws Exception {
        this.encryptAlg = Algorithm.SCRYPT;
        this.signatureAlg = Algorithm.SECP256K1;
        this.keydir = DEFAULTKEYDIR;

        this.keystore = new Keystore(this.encryptAlg);
    }

}

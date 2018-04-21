package io.nebulas.crypto.keystore;

import io.nebulas.crypto.keystore.secp256k1.MemoryProvider;

import java.util.List;

public class Keystore {

    Provider provider;

    public Keystore(Algorithm algorithm) throws Exception {
        this.provider = new MemoryProvider(algorithm);
    }

    public List<String> keys() {
        return this.provider.keys();
    }

    public boolean contains(String alias) {
        return this.provider.contains(alias);
    }

    public void setKey(String alias, Key key, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        this.provider.setKey(alias, key, passphrase);
    }

    public Key getKey(String alias, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        return this.provider.getKey(alias, passphrase);
    }

    public void delete(String alias, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        Key key = this.provider.getKey(alias, passphrase);
        key.clear();

        this.provider.delete(alias);
    }
}

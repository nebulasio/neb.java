package org.nebulas.crypto.keystore;

import org.nebulas.crypto.keystore.secp256k1.ProviderImpl;

import java.util.List;

public class Keystore {

    Provider provider;

    public Keystore(Algorithm algorithm) throws Exception {
        this.provider = new ProviderImpl(algorithm);
    }

    public List<String> keys() {
        return this.provider.keys();
    }

    public boolean Contains(String alias) {
        return this.provider.ContainsKey(alias);
    }

    public void SetKey(String alias, Key key, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        this.provider.SetKey(alias, key, passphrase);
    }

    public Key GetKey(String alias, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        return this.provider.GetKey(alias, passphrase);
    }

    public void Delete(String alias, byte[] passphrase) throws Exception {
        if (this.provider == null) {
            throw new Exception("invalid provider");
        }

        Key key = this.provider.GetKey(alias, passphrase);
        key.Clear();

        this.provider.Delete(alias);
    }
}

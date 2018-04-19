package org.nebulas.crypto.keystore.secp256k1;

import com.google.common.collect.Maps;
import org.nebulas.crypto.cipher.Cipher;
import org.nebulas.crypto.cipher.CryptoJSON;
import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.Key;
import org.nebulas.crypto.keystore.Provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProviderImpl implements Provider {

    Map<String, Entry> entries;

    Cipher cipher;

    private class Entry {

        Key key;
        CryptoJSON data;

        public Entry(Key key, CryptoJSON data) {
            this.key = key;
            this.data = data;
        }

        public Key getKey() {
            return key;
        }

        public CryptoJSON getData() {
            return data;
        }
    }

    public ProviderImpl(Algorithm algorithm) throws Exception {
        this.cipher = new Cipher(algorithm);
        this.entries = Maps.newConcurrentMap();
    }

    @Override
    public List<String> keys() {
        return new ArrayList<>(this.entries.keySet());
    }

    @Override
    public void SetKey(String alias, Key v, byte[] passphrase) throws Exception {
        if (alias.length() == 0) {
            throw new Exception("invalid key alias");
        }
        if (passphrase.length == 0) {
            throw new Exception("invalid passphrase");
        }
        CryptoJSON data = this.cipher.Encrypt(v.Encoded(), passphrase);

        Entry entry = new Entry(v, data);

        this.entries.put(alias, entry);
    }

    @Override
    public Key GetKey(String alias, byte[] passphrase) throws Exception {
        if (alias.length() == 0) {
            throw new Exception("invalid key alias");
        }
        if (passphrase.length == 0) {
            throw new Exception("invalid passphrase");
        }

        Entry entry = this.entries.get(alias);
        if (entry == null) {
            throw new Exception("key not found");
        }
        byte[] data = this.cipher.Decrypt(entry.getData(), passphrase);
        entry.getKey().Decode(data);
        return entry.getKey();
    }

    @Override
    public void Delete(String alias) {
        this.entries.remove(alias);
    }

    @Override
    public boolean ContainsKey(String alias) {
        return this.entries.containsKey(alias);
    }

    @Override
    public void Clear() {
        this.entries.clear();
    }
}

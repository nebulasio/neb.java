package io.nebulas.crypto.keystore;

import java.util.List;

public interface Provider {

    List<String> keys();

    void setKey(String alias, Key v, byte[] passphrase) throws Exception;

    Key getKey(String alias, byte[] passphrase) throws Exception;

    void delete(String alias);

    boolean contains(String alias);

    void clear();
}

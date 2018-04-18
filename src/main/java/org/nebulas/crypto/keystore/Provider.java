package org.nebulas.crypto.keystore;

import java.util.List;

public interface Provider {

    List<String> keys();

    void SetKey(String alias, Key v, byte[] passphrase) throws Exception;

    Key GetKey(String alias, byte[] passphrase) throws Exception;

    void Delete(String alias);

    boolean ContainsKey(String alias);

    void Clear();
}

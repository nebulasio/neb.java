package org.nebulas.crypto.keystore;

public enum Algorithm {

    // SECP256K1 a type of signer
    SECP256K1(1),

    // SCRYPT a type of encrypt
    SCRYPT(1<<4);

    int type;

    private Algorithm(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static Algorithm FromType(int type) throws Exception {
        if (SECP256K1.getType() == type) {
            return SECP256K1;
        } else if (SCRYPT.getType() == type) {
            return SCRYPT;
        } else {
            throw new Exception("invalid algorithm");
        }
    }
}

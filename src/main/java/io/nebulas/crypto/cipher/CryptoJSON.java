package io.nebulas.crypto.cipher;

public class CryptoJSON {

    // version
    public static final int VERSION = 4;

    public static final String ScryptKDF = "scrypt";

    public static final int StandardScryptN = 1 << 12; //4096

    public static final int StandardScryptR = 8;

    public static final int StandardScryptP = 1;

    // ScryptDKLen get derived key length
    public static final int ScryptDKLen = 32;

    // cipher the name of cipher
    public static final String CIPHERNAME = "aes-128-ctr";

    // mac calculate hash type
    public static final String MACHASH = "sha3256";

    String cipher;
    String ciphertext;
    CipherParams cipherparams;
    String kdf;
    ScryptParams kdfparams;
    String mac;
    String machash;

    public static class CipherParams {
        String iv;

        public String getIv() {
            return iv;
        }

        public void setIv(String iv) {
            this.iv = iv;
        }
    }

    public static class ScryptParams {
        int n;
        int r;
        int p;
        int dklen;
        String salt;

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public int getR() {
            return r;
        }

        public void setR(int r) {
            this.r = r;
        }

        public int getP() {
            return p;
        }

        public void setP(int p) {
            this.p = p;
        }

        public int getDklen() {
            return dklen;
        }

        public void setDklen(int dklen) {
            this.dklen = dklen;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }
    }

    public String getCipher() {
        return cipher;
    }

    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    public CipherParams getCipherparams() {
        return cipherparams;
    }

    public void setCipherparams(CipherParams cipherparams) {
        this.cipherparams = cipherparams;
    }

    public String getKdf() {
        return kdf;
    }

    public void setKdf(String kdf) {
        this.kdf = kdf;
    }

    public ScryptParams getKdfparams() {
        return kdfparams;
    }

    public void setKdfparams(ScryptParams kdfparams) {
        this.kdfparams = kdfparams;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMachash() {
        return machash;
    }

    public void setMachash(String machash) {
        this.machash = machash;
    }
}

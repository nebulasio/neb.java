package org.nebulas.crypto.cipher;

import com.lambdaworks.crypto.SCrypt;
import org.nebulas.crypto.hash.Hash;
import org.nebulas.crypto.util.Utils;
import org.nebulas.util.ByteUtils;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Scrypt implements Encrypt {

    @Override
    public CryptoJSON encrypt(byte[] data, byte[] passphrase) throws Exception {
        byte[] salt = Utils.RandomBytes(CryptoJSON.ScryptDKLen);
        byte[] derivedKey = SCrypt.scrypt(passphrase, salt, CryptoJSON.StandardScryptN, CryptoJSON.StandardScryptR, CryptoJSON.StandardScryptP, CryptoJSON.ScryptDKLen);

        byte[] encryptKey = ByteUtils.SubBytes(derivedKey, 0, 16);
        byte[] iv = Utils.RandomBytes(16);
        SecretKeySpec key = new SecretKeySpec(encryptKey, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // https://stackoverflow.com/questions/31049685/aes-ctr-double-encryption-reverses-the-ciphertext-to-plaintext

        javax.crypto.Cipher AesCipher = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");
        AesCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] cipherText = AesCipher.doFinal(data);

        byte[] macDerivedKey = ByteUtils.SubBytes(derivedKey, 16, 16);
        byte[] mac = Hash.Sha3256(macDerivedKey, cipherText, iv, CryptoJSON.CIPHERNAME.getBytes());

        CryptoJSON.CipherParams cipherParams = new CryptoJSON.CipherParams();
        cipherParams.setIv(ByteUtils.HexToString(iv));

        CryptoJSON.ScryptParams scryptParams =  new CryptoJSON.ScryptParams();
        scryptParams.setN(CryptoJSON.StandardScryptN);
        scryptParams.setR(CryptoJSON.StandardScryptR);
        scryptParams.setP(CryptoJSON.StandardScryptP);
        scryptParams.setDklen(CryptoJSON.ScryptDKLen);
        scryptParams.setSalt(ByteUtils.HexToString(salt));

        CryptoJSON cryptoJSON = new CryptoJSON();
        cryptoJSON.setCipher(CryptoJSON.CIPHERNAME);
        cryptoJSON.setCiphertext(ByteUtils.HexToString(cipherText));
        cryptoJSON.setCipherparams(cipherParams);
        cryptoJSON.setKdf(CryptoJSON.ScryptKDF);
        cryptoJSON.setKdfparams(scryptParams);
        cryptoJSON.setMac(ByteUtils.HexToString(mac));
        cryptoJSON.setMachash(CryptoJSON.MACHASH);

        return cryptoJSON;
    }

    @Override
    public byte[] decrypt(CryptoJSON cryptoJSON, byte[] passphrase) throws Exception {
        if (!CryptoJSON.CIPHERNAME.equalsIgnoreCase(cryptoJSON.getCipher())) {
            throw new Exception("invalid cipher");
        }

        if (!CryptoJSON.ScryptKDF.equalsIgnoreCase(cryptoJSON.getKdf())) {
            throw new Exception("kdf not support");
        }

        byte[] mac = ByteUtils.HexToBytes(cryptoJSON.getMac());
        byte[] iv = ByteUtils.HexToBytes(cryptoJSON.getCipherparams().getIv());
        byte[] cipherText = ByteUtils.HexToBytes(cryptoJSON.getCiphertext());
        byte[] salt = ByteUtils.HexToBytes(cryptoJSON.getKdfparams().getSalt());

        int dklen = cryptoJSON.getKdfparams().getDklen();
        int n = cryptoJSON.getKdfparams().getN();
        int r = cryptoJSON.getKdfparams().getR();
        int p = cryptoJSON.getKdfparams().getP();

        byte[] derivedKey = SCrypt.scrypt(passphrase, salt, n, r, p, dklen);
        byte[] macDerivedKey = ByteUtils.SubBytes(derivedKey, 16, 16);
        byte[] calMac = Hash.Sha3256(macDerivedKey, cipherText, iv, cryptoJSON.getCipher().getBytes());

        if (!ByteUtils.Equal(mac, calMac)) {
            throw new Exception("could not decrypt key with given passphrase");
        }

        byte[] encryptKey = ByteUtils.SubBytes(derivedKey, 0, 16);
        SecretKeySpec key = new SecretKeySpec(encryptKey, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        javax.crypto.Cipher AesCipher = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");
        AesCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] result = AesCipher.doFinal(cipherText);
        return result;
    }
}

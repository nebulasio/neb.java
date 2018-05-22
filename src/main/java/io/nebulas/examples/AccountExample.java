package io.nebulas.examples;

import io.nebulas.account.*;
import io.nebulas.core.*;
import io.nebulas.crypto.Crypto;
import io.nebulas.crypto.hash.Hash;
import io.nebulas.crypto.keystore.PublicKey;
import io.nebulas.crypto.keystore.Signature;
import javax.xml.bind.DatatypeConverter;


public class AccountExample {
    public static void main(String args[]) throws Exception {

        byte[] passphrase = "passphrase".getBytes();    //prepare your passphrase

        AccountManager manager = new AccountManager();
        System.out.println("encrypt algorithm is: " + manager.getEncryptAlg());
        System.out.println("signature algorithm is: " + manager.getSignatureAlg());

        Address address = manager.newAccount(passphrase);   //generate a new account
        printAccounts(manager);

        byte[] walletFile = manager.export(address,passphrase); //Dont't forget to export the generated new account
        System.out.println("exported KeyJson data is: " + DatatypeConverter.printHexBinary(walletFile));

        //change password
        byte[] newPassphrase = "newPassphrase".getBytes();
        manager.update(address,passphrase,newPassphrase);
        byte[] newWalletFile = manager.export(address,newPassphrase);
        System.out.println("exported New KeyJson data is: " + DatatypeConverter.printHexBinary(newWalletFile));
        System.out.println("is the wallet file equals: " + DatatypeConverter.printHexBinary(walletFile).equals(DatatypeConverter.printHexBinary(newWalletFile)));

        //delete and load again
        manager.delete(address, newPassphrase);
        System.out.println("Accounts in the AccountManager after delete: ");
        printAccounts(manager);

        manager.load(newWalletFile, newPassphrase);    //manager.load(newWalletFile,newPassphrase);
        System.out.println("Accounts in the AccountManager after load: " );
        printAccounts(manager);

        //sign and verify
        String data = "Data to be signed";
        byte[] hash = Hash.Sha3256(data.getBytes());
        byte[] signedData = manager.signHash(address, hash, newPassphrase);
        System.out.println("Data to be signed is: " + data);
        System.out.println("Account used to signed the data is: " + address.string());
        System.out.println("signed Data is: " + DatatypeConverter.printHexBinary(signedData));
        //
        Signature signature = Crypto.NewSignature(manager.getSignatureAlg());
        PublicKey pub = signature.recoverPublic(hash, signedData);
        Address verifiedAddress = Address.NewAddressFromPubKey(pub.encode());
        //verify
        signature.initVerify(pub);
        boolean result = signature.verify(hash,signedData);
        System.out.println("Publick key is: " + DatatypeConverter.printHexBinary(pub.encode()));
        System.out.println("verified address is: " + verifiedAddress.string());
        System.out.println("verification result is: " + result);


    }

    static void  printAccounts (AccountManager am){
        System.out.println("All accounts in the AccountManager: ");
        for (Address i : am.accounts()){
            System.out.println("\t" + i.string());
        }
    }

}

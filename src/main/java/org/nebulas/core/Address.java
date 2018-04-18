package org.nebulas.core;


import org.nebulas.crypto.hash.Hash;
import org.nebulas.util.Base58;
import org.nebulas.util.ByteUtils;

public class Address {

    private static final byte PaddingByte = 0x19;
    private static final char NebulasFaith = 'n';

    // AddressPaddingLength the length of headpadding in byte
    private static final int AddressPaddingLength = 1;

    // AddressTypeLength the length of address type in byte
    private static final int AddressTypeLength = 1;

    // AddressTypeIndex the index of address type bytes
    private static final int AddressTypeIndex = 1;

    // AddressDataLength the length of data of address in byte.
    private static final int AddressDataLength = 20;

    // AddressChecksumLength the checksum of address in byte.
    private static final int AddressChecksumLength = 4;

    // AddressLength the length of address in byte.
    private static final int AddressLength = AddressPaddingLength + AddressTypeLength + AddressDataLength + AddressChecksumLength;

    // PublicKeyDataLength length of public key
    public static final int PublicKeyDataLength = 65;

    // AddressBase58Length length of base58(Address.address)
    public static final int AddressBase58Length = 35;

    // address type
    public enum AddressType {
        // normal address format, used for transaction address
        ACCOUNT((byte) 0x57),

        // contract address type, used for contract address
        CONTRACT((byte) 0x58);

        private byte type;

        private AddressType(byte type) {
            this.type = type;
        }

        public byte Type() {
            return this.type;
        }
    }

    private byte[] address;

    private Address(byte[] address) {
        this.address = address;
    }

    public byte[] Bytes() {
        return address;
    }

    public String String() {
        return Base58.encode(this.address);
    }

    public AddressType Type() throws Exception {
        byte type = address[AddressTypeIndex];
        if (AddressType.ACCOUNT.Type() == type) {
            return AddressType.ACCOUNT;
        } else if (AddressType.CONTRACT.Type() == type) {
            return AddressType.CONTRACT;
        } else {
            throw new Exception("unsupport address type");
        }
    }

    private static Address newAddress(AddressType type, byte[]... args) throws Exception {
        if (args.length == 0) {
            throw new Exception("invalid argument(s)");
        }
        if (AddressType.ACCOUNT != type && AddressType.CONTRACT != type) {
            throw new Exception("invalid address type");
        }

        byte[] addrBytes = new byte[AddressLength];
        addrBytes[0] = PaddingByte;
        addrBytes[AddressTypeIndex] = type.Type();
        byte[] sha = Hash.Sha3256(args);
        byte[] content = Hash.Ripemd160(sha);
        System.arraycopy(content, 0, addrBytes, AddressTypeIndex + 1, AddressDataLength);

        byte[] checkData = ByteUtils.SubBytes(addrBytes, 0, AddressLength - AddressChecksumLength);
        byte[] checkSum = checkSum(checkData);
        System.arraycopy(checkSum, 0, addrBytes, AddressLength - AddressChecksumLength, AddressChecksumLength);

        Address address = new Address(addrBytes);
        return address;
    }

    private static byte[] checkSum(byte[] data) {
        byte[] checkData = Hash.Sha3256(data);
        return ByteUtils.SubBytes(checkData, checkData.length - AddressChecksumLength, AddressChecksumLength);
    }

    public static Address NewAddressFromPubKey(byte[] pub) throws Exception {
        if (pub.length != PublicKeyDataLength) {
            throw new Exception("invalid pubKey for address");
        }
        return newAddress(AddressType.ACCOUNT, pub);
    }

    public static Address NewContractAddress(byte[] from, byte[] nonce) throws Exception {
        if (from.length == 0 || nonce.length == 0) {
            throw new Exception("invalid from or nonce");
        }
        return newAddress(AddressType.CONTRACT, from, nonce);
    }

    public static Address ParseFromString(String addr) throws Exception {
        if (addr.length() != AddressBase58Length || addr.charAt(0) != NebulasFaith) {
            throw new Exception("invalid address string format");
        }
        byte[] addrBytes = Base58.decode(addr);
        return ParseFromBytes(addrBytes);
    }

    public static Address ParseFromBytes(byte[] bytes) throws Exception {
        if (bytes.length != AddressLength || bytes[0] != PaddingByte) {
            throw new Exception("invalid address bytes");
        }

        byte[] checkSum = ByteUtils.SubBytes(bytes, AddressLength - AddressChecksumLength, AddressChecksumLength);
        byte[] checkData = ByteUtils.SubBytes(bytes, 0, AddressLength - AddressChecksumLength);
        if (!ByteUtils.Equal(checkSum(checkData), checkSum)) {
            throw new Exception("invalid address check sum");
        }

        return new Address(bytes);
    }

}

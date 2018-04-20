package org.nebulas.core;

import com.google.protobuf.ByteString;
import org.nebulas.crypto.hash.Hash;
import org.nebulas.crypto.keystore.Algorithm;
import org.nebulas.crypto.keystore.Signature;
import org.nebulas.proto.TransactionOuterClass;
import org.nebulas.util.ByteUtils;

import java.math.BigInteger;

public class Transaction {

    // TransactionMaxGasPrice max gasPrice:1 * 10 ** 12
    public static final BigInteger TransactionMaxGasPrice = new BigInteger("1000000000000");

    // TransactionMaxGas max gas:50 * 10 ** 9
    public static final BigInteger TransactionMaxGas = new BigInteger("50000000000");

    // TransactionGasPrice default gasPrice : 10**6
    public static final BigInteger TransactionGasPrice = new BigInteger("1000000");

    // MinGasCountPerTransaction default gas for normal transaction
    public static final BigInteger MinGasCountPerTransaction = new BigInteger("20000");

    // GasCountPerByte per byte of data attached to a transaction gas cost
    public static final BigInteger GasCountPerByte = new BigInteger("1");

    // MaxDataPayLoadLength Max data length in transaction
    public static final int MaxDataPayLoadLength = 1024 * 1024;

    // MaxDataBinPayloadLength Max data length in binary transaction
    public static final int MaxDataBinPayloadLength = 64;

    private int chainID;
    private byte[] hash;

    private Address from;
    private Address to;
    private BigInteger value;

    private long nonce;
    private long timestamp;

    private TransactionOuterClass.Data data;

    private BigInteger gasPrice;
    private BigInteger gasLimit;

    private Algorithm alg;
    private byte[] sign;

    public enum PayloadType {
        BINARY("binary"),
        DEPLOY("deploy"),
        CALL("call");

        private String type;

        PayloadType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static Transaction  NewTransaction(int chainID, Address from, Address to, BigInteger value, long nonce, PayloadType payloadType, byte[] payload, BigInteger gasPrice, BigInteger gasLimit) throws Exception {
        if (gasPrice.compareTo(TransactionMaxGasPrice) > 0) {
            throw new Exception("invalid gasPrice");
        }
        if (gasPrice.compareTo(TransactionMaxGas) > 0) {
            throw new Exception("invalid gasLimit");
        }

        if ( payload != null && payload.length > MaxDataPayLoadLength) {
            throw new Exception("payload data length is out of max length");
        }

        Transaction tx = new Transaction();

        tx.chainID = chainID;
        tx.from = from;
        tx.to = to;
        tx.value = value;
        tx.nonce = nonce;
        tx.gasPrice = gasPrice;
        tx.gasLimit = gasLimit;
        tx.timestamp = System.currentTimeMillis()/1000;

        TransactionOuterClass.Data.Builder builder = TransactionOuterClass.Data.newBuilder();
        builder.setPayloadType(payloadType.getType());
        builder.setPayload(ByteString.copyFrom(payload));
        tx.data = builder.build();

        return tx;
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public long getNonce() {
        return nonce;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public int getChainID() {
        return chainID;
    }

    public void setChainID(int chainID) {
        this.chainID = chainID;
    }

    public BigInteger getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(BigInteger gasPrice) {
        this.gasPrice = gasPrice;
    }

    public BigInteger getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(BigInteger gasLimit) {
        this.gasLimit = gasLimit;
    }

    public Algorithm getAlg() {
        return alg;
    }

    public void setAlg(Algorithm alg) {
        this.alg = alg;
    }

    public byte[] getSign() {
        return sign;
    }

    public void setSign(byte[] sign) {
        this.sign = sign;
    }

    public TransactionOuterClass.Data getData() {
        return data;
    }

    public void setData(TransactionOuterClass.Data data) {
        this.data = data;
    }

    public void fromProto(byte[] msg) throws Exception {
        TransactionOuterClass.Transaction t = TransactionOuterClass.Transaction.parseFrom(msg);
        this.setHash(t.getHash().toByteArray());
        this.setFrom(Address.ParseFromBytes(t.getFrom().toByteArray()));
        this.setChainID(t.getChainId());

        BigInteger gasPrice = new BigInteger(1, t.getGasPrice().toByteArray());
        if (gasPrice.compareTo(TransactionMaxGasPrice) > 0) {
            throw new Exception("invalid gasPrice");
        }
        this.setGasPrice(gasPrice);

        BigInteger gasLimit = new BigInteger(1, t.getGasLimit().toByteArray());
        if (gasPrice.compareTo(TransactionMaxGas) > 0) {
            throw new Exception("invalid gasLimit");
        }
        this.setGasLimit(gasLimit);
        this.setNonce(t.getNonce());
        this.setAlg(Algorithm.FromType(t.getAlg()));
        this.setSign(t.getSign().toByteArray());
        this.setTimestamp(t.getTimestamp());
        this.setTo(Address.ParseFromBytes(t.getTo().toByteArray()));
        this.setValue(new BigInteger(1, t.getValue().toByteArray()));

        if (t.getData() == null) {
            throw new Exception("invalid transaction data");
        }
        if (t.getData().getPayload().toByteArray().length > MaxDataPayLoadLength) {
            throw new Exception("payload data length is out of max length");
        }

        this.setData(t.getData());
    }

    public byte[] toProto() throws Exception {
        TransactionOuterClass.Transaction.Builder builder = TransactionOuterClass.Transaction.newBuilder();
        builder.setAlg(this.getAlg().getType());
        builder.setChainId(this.getChainID());
        builder.setFrom(ByteString.copyFrom(this.getFrom().bytes()));
        builder.setTo(ByteString.copyFrom(this.getTo().bytes()));
        builder.setValue(ByteString.copyFrom(ByteUtils.ToFixedSizeBytes(this.getValue().toByteArray(), 16)));
        builder.setGasLimit(ByteString.copyFrom(ByteUtils.ToFixedSizeBytes(this.getGasLimit().toByteArray(), 16)));
        builder.setGasPrice(ByteString.copyFrom(ByteUtils.ToFixedSizeBytes(this.getGasPrice().toByteArray(), 16)));
        builder.setNonce(this.getNonce());
        builder.setHash(ByteString.copyFrom(this.getHash()));
        builder.setSign(ByteString.copyFrom(this.getSign()));
        builder.setTimestamp(this.getTimestamp());
        builder.setData(this.getData());

        TransactionOuterClass.Transaction t = builder.build();
        return t.toByteArray();
    }

    public byte[] calculateHash() {
        byte[] hash = Hash.Sha3256(
                this.from.bytes(),
                this.to.bytes(),
                ByteUtils.BigIntegerToBytes(this.value, 16),
                ByteUtils.LongToBytes(this.nonce),
                ByteUtils.LongToBytes(this.timestamp),
                this.data.toByteArray(),
                ByteUtils.IntToBytes(this.chainID),
                ByteUtils.BigIntegerToBytes(this.gasPrice, 16),
                ByteUtils.BigIntegerToBytes(this.gasLimit, 16)
        );
        this.hash = hash;
        return this.hash;
    }

    public void sign(Signature signature) throws Exception {
        if (ByteUtils.IsNullOrEmpty(this.hash)) {
            throw new Exception("transaction must calculate hash first");
        }

        byte[] sign = signature.sign(this.hash);
        this.alg = signature.algorithm();
        this.sign = sign;
    }
}

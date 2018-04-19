package org.nebulas.core;

import com.google.protobuf.ByteString;
import org.nebulas.proto.TransactionOuterClass;

import java.math.BigInteger;

public class Transaction {

    private byte[] hash;

    private Address from;
    private Address to;
    private BigInteger value;

    private long nonce;
    private long timestamp;

    private TransactionOuterClass.Data data;

    private int chainID;
    private BigInteger gasPrice;
    private BigInteger gasLimit;

    private int alg;
    private byte[] sign;

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

    public int getAlg() {
        return alg;
    }

    public void setAlg(int alg) {
        this.alg = alg;
    }

    public byte[] getSign() {
        return sign;
    }

    public void setSign(byte[] sign) {
        this.sign = sign;
    }


    public static Transaction fromProto(byte[] msg) throws Exception {
        TransactionOuterClass.Transaction t = TransactionOuterClass.Transaction.parseFrom(msg);


        Transaction transaction = new Transaction();
        transaction.setHash(t.getHash().toByteArray());
        transaction.setFrom(Address.ParseFromBytes(t.getFrom().toByteArray()));
        transaction.setAlg(t.getAlg());
        transaction.setChainID(t.getChainId());
        transaction.setGasLimit(new BigInteger(1, t.getGasLimit().toByteArray()));
        transaction.setGasPrice(new BigInteger(1, t.getGasPrice().toByteArray()));
        transaction.setNonce(t.getNonce());
        transaction.setSign(t.getSign().toByteArray());
        transaction.setTimestamp(t.getTimestamp());
        transaction.setTo(Address.ParseFromBytes(t.getTo().toByteArray()));
        transaction.setValue(new BigInteger(1, t.getValue().toByteArray()));

        if (t.getData() != null) {
            transaction.setData(t.getData());
        }


        return transaction;
    }

    public static byte[] toProto(Transaction transaction) throws Exception {
        TransactionOuterClass.Transaction.Builder builder = TransactionOuterClass.Transaction.newBuilder();
        builder.setAlg(transaction.getAlg());
        builder.setChainId(transaction.getChainID());
        builder.setFrom(ByteString.copyFrom(transaction.getFrom().Bytes()));
        builder.setTo(ByteString.copyFrom(transaction.getTo().Bytes()));
        builder.setGasLimit(ByteString.copyFrom(ToFixedSizeBytes(transaction.getGasLimit().toByteArray())));
        builder.setGasPrice(ByteString.copyFrom(ToFixedSizeBytes(transaction.getGasPrice().toByteArray())));
        builder.setNonce(transaction.getNonce());
        builder.setHash(ByteString.copyFrom(transaction.getHash()));
        builder.setSign(ByteString.copyFrom(transaction.getSign()));
        builder.setTimestamp(transaction.getTimestamp());
        builder.setValue(ByteString.copyFrom(ToFixedSizeBytes(transaction.getValue().toByteArray())));
        builder.setData(transaction.getData());

        TransactionOuterClass.Transaction t = builder.build();

        return t.toByteArray();

    }

    public static byte[] ToFixedSizeBytes(byte[] src) throws Exception {
        if (src.length > 16) {
            throw new Exception("invalid src byte");
        }
        byte[] res = new byte[16];
        System.arraycopy(src,0,res,res.length-src.length,src.length);
        return res;
    }

    public TransactionOuterClass.Data getData() {
        return data;
    }

    public void setData(TransactionOuterClass.Data data) {
        this.data = data;
    }
}

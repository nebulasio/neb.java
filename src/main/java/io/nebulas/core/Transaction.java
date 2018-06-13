package io.nebulas.core;

import com.google.protobuf.ByteString;
import corepb.TransactionOuterClass;
import io.nebulas.crypto.hash.Hash;
import io.nebulas.crypto.keystore.Algorithm;
import io.nebulas.crypto.keystore.Signature;
import io.nebulas.util.ByteUtils;

import java.math.BigInteger;

/**
 * The Transaction Class.
 */
public class Transaction {

    /**
     * The maximum allowed GasPrice for a transaction, which is <b>1*10^12 wei</b>.
     */
    // TransactionMaxGasPrice max gasPrice:1 * 10 ** 12
    public static final BigInteger TransactionMaxGasPrice = new BigInteger("1000000000000");

    /**
     * The maximum allowed GasLimit for a transaction, which is <b>50*10^9</b>.
     */
    // TransactionMaxGas max gas:50 * 10 ** 9
    public static final BigInteger TransactionMaxGas = new BigInteger("50000000000");

    /**
     * Default GasPrice, which is <b>1000000</b> .
     */
    // TransactionGasPrice default gasPrice : 10**6
    public static final BigInteger TransactionGasPrice = new BigInteger("1000000");

    /**
     * The minimum GasLimit for a transaction, which is <b>20000</b>.
     */
    // MinGasCountPerTransaction default gas for normal transaction
    public static final BigInteger MinGasCountPerTransaction = new BigInteger("20000");

    /**
     * .
     */
    // GasCountPerByte per byte of data attached to a transaction gas cost
    public static final BigInteger GasCountPerByte = new BigInteger("1");

    /**
     * Max data length in transaction, which is 128 KBytes.
     */
    // MaxDataPayLoadLength Max data length in transaction
    public static final int MaxDataPayLoadLength = 1024 * 1024;

    /**
     * Max data length in binary transaction, which is 64 Byte.
     */
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

    /**
     * The enum of Payload type: binary, deploy, call.
     * Please refer to <a href="https://github.com/nebulasio/wiki/blob/master/rpc_admin.md#SendTransaction"><tt>SendTransaction</tt></a>
     */
    public enum PayloadType {
        /**
         * Binary payload type.
         */
        BINARY("binary"),
        /**
         * Deploy payload type.
         */
        DEPLOY("deploy"),
        /**
         * Call payload type.
         */
        CALL("call");

        private String type;

        PayloadType(String type) {
            this.type = type;
        }

        /**
         * Get the payload type .
         *
         * @return the payload type
         */
        public String getType() {
            return type;
        }
    }

    /**
     * Constructs a new Transaction.
     *
     * @param chainID     the chain id
     * @param from        the account address of sender
     * @param to          the account address of receiver
     * @param value       the value to be transferred with this transaction, in unit of wei
     * @param nonce       the nonce
     * @param payloadType the payload type
     * @param payload     the payload content
     * @param gasPrice    the gas price
     * @param gasLimit    the gas limit
     * @throws Exception  if the parameters is not appropriate
     */
    public Transaction(int chainID, Address from, Address to, BigInteger value, long nonce, PayloadType payloadType, byte[] payload, BigInteger gasPrice, BigInteger gasLimit) throws Exception {
        if (gasPrice.compareTo(TransactionMaxGasPrice) > 0) {
            throw new Exception("invalid gasPrice");
        }
        if (gasPrice.compareTo(TransactionMaxGas) > 0) {
            throw new Exception("invalid gasLimit");
        }

        if ( payload != null && payload.length > MaxDataPayLoadLength) {
            throw new Exception("payload data length is out of max length");
        }

        this.chainID = chainID;
        this.from = from;
        this.to = to;
        this.value = value;
        this.nonce = nonce;
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
        this.timestamp = System.currentTimeMillis()/1000;

        TransactionOuterClass.Data.Builder builder = TransactionOuterClass.Data.newBuilder();
        builder.setPayloadType(payloadType.getType());
        if (payload != null && payload.length > 0) {
            builder.setPayload(ByteString.copyFrom(payload));
        }
        this.data = builder.build();
    }

    private Transaction() {
        // local constructor
    }

    /**
     * Get the hash data of this transaction, which is a byte array.
     * The hash data is calculated using method <tt>calculateHash</tt>.
     *
     * @return the hash byte array.
     */
    public byte[] getHash() {
        return hash;
    }

    /**
     * Sets hash data for this transaction.
     *
     * @param hash the hash data
     */
    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    /**
     * Get the account address of sender.
     *
     * @return the account address of sender
     */
    public Address getFrom() {
        return from;
    }

    /**
     * Sets the account address of sender.
     *
     * @param from the account address of sender
     */
    public void setFrom(Address from) {
        this.from = from;
    }

    /**
     * Get the account address of receiver.
     *
     * @return the account address of receiver
     */
    public Address getTo() {
        return to;
    }

    /**
     * Set the account address of receiver.
     *
     * @param to the account address of receiver
     */
    public void setTo(Address to) {
        this.to = to;
    }

    /**
     * Get the value to be transferred.
     *
     * @return the value to be transferred
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value to be transferred.
     *
     * @param value  the value to be transferred
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the nonce of this transaction.
     *
     * @return the nonce value
     */
    public long getNonce() {
        return nonce;
    }

    /**
     * Sets the nonce of this transaction..
     *
     * @param nonce the nonce
     */
    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets chain id.
     *
     * @return the chain id
     */
    public int getChainID() {
        return chainID;
    }

    /**
     * Sets chain id.
     *
     * @param chainID the chain id
     */
    public void setChainID(int chainID) {
        this.chainID = chainID;
    }

    /**
     * Gets gas price.
     *
     * @return the gas price
     */
    public BigInteger getGasPrice() {
        return gasPrice;
    }

    /**
     * Sets gas price.
     *
     * @param gasPrice the gas price
     */
    public void setGasPrice(BigInteger gasPrice) {
        this.gasPrice = gasPrice;
    }

    /**
     * Gets gas limit.
     *
     * @return the gas limit
     */
    public BigInteger getGasLimit() {
        return gasLimit;
    }

    /**
     * Sets gas limit.
     *
     * @param gasLimit the gas limit
     */
    public void setGasLimit(BigInteger gasLimit) {
        this.gasLimit = gasLimit;
    }

    /**
     * Gets the algorithm.
     *
     * @return the algorithm
     */
    public Algorithm getAlg() {
        return alg;
    }

    /**
     * Sets the algorithm.
     *
     * @param alg the algorithm
     */
    public void setAlg(Algorithm alg) {
        this.alg = alg;
    }

    /**
     * Get the signed data of this transaction.
     *
     * @return the the signed data
     */
    public byte[] getSign() {
        return sign;
    }

    /**
     * Set the signed data of this transaction.
     *
     * @param sign the signed data
     */
    public void setSign(byte[] sign) {
        this.sign = sign;
    }

    /**
     * Gets the serialized protobuf data prepared by {@link #toProto()} .
     *
     * @return the protobuf data
     */
    public TransactionOuterClass.Data getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(TransactionOuterClass.Data data) {
        this.data = data;
    }

    /**
     * FromProto constructs a transaction object with the data from protobuf message data.
     *
     * @param msg the msg
     * @return the transaction
     * @throws Exception the exception
     */
    public static Transaction FromProto(byte[] msg) throws Exception {
        Transaction tx = new Transaction();
        tx.fromProto(msg);
        return tx;
    }

    /**
     * From proto.
     *
     * @param msg the message data received from Protobuf
     * @throws Exception the exception
     */
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

    /**
     * serialize the transaction data to protobuf data.
     *
     * @return the protobuf data
     * @throws Exception the exception
     */
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

    /**
     * Calculate hash data of this transaction using SHA3256.
     *
     * @return the hash data
     */
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

    /**
     * Sign the transaction hash data using Secp256k1 algorithm.
     *
     * @param signature the signature
     * @throws Exception the exception
     */
    public void sign(Signature signature) throws Exception {
        // calculate hash
        this.calculateHash();

        byte[] sign = signature.sign(this.hash);
        this.alg = signature.algorithm();
        this.sign = sign;
    }
}

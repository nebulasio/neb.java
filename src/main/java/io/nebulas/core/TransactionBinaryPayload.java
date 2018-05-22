package io.nebulas.core;

import java.math.BigInteger;

/**
 * The TransactionBinaryPayload is a class describing the payload data of a Binary transaction.
 */
public class TransactionBinaryPayload implements TransactionPayload {

    private byte[] data;

    /**
     * Build a new TransactionBinaryPayload from given payload data.
     *
     * @param data the payload data
     * @return the TransactionBinaryPayload object
     */
    public static TransactionBinaryPayload LoadPayload(byte[] data) {
        return new TransactionBinaryPayload(data);
    }

    /**
     * Constructs a new TransactionBinaryPayload.
     *
     * @param data the payload data
     */
    public TransactionBinaryPayload(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] toBytes() throws Exception {
        return this.data;
    }

    @Override
    public BigInteger gasCount() {
        return BigInteger.ZERO;
    }
}

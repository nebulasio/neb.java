package io.nebulas.core;

import java.math.BigInteger;

public class TransactionBinaryPayload implements TransactionPayload {

    private byte[] data;

    public static TransactionBinaryPayload LoadPayload(byte[] data) {
        return new TransactionBinaryPayload(data);
    }

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

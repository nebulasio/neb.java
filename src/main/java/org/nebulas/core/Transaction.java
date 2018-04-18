package org.nebulas.core;

import java.math.BigInteger;
import java.util.Date;

public class Transaction {

    private byte[] hash;

    private Address from;
    private Address to;
    private BigInteger value;
    private long nonce;
    private Date timestamp;

    private Data data;

    private int chainID;
    private BigInteger gasPrice;
    private BigInteger gasLimit;

    private int alg;
    private byte[] sign;

    public class Data {
        private String type;
        private byte[] payload;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public byte[] getPayload() {
            return payload;
        }

        public void setPayload(byte[] payload) {
            this.payload = payload;
        }
    }

    public Address getFrom() {
        return from;
    }

    public Address getTo() {
        return to;
    }

    public BigInteger getValue() {
        return value;
    }

    public long getNonce() {
        return nonce;
    }

    public int getChainID() {
        return chainID;
    }

    public BigInteger getGasPrice() {
        return gasPrice;
    }

    public BigInteger getGasLimit() {
        return gasLimit;
    }

    public int getAlg() {
        return alg;
    }

    public String getType() {
        return this.data.type;
    }
}

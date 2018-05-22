package io.nebulas.core;

import java.math.BigInteger;

/**
 * The interface TransactionPayload describes the payload data of a transaction.
 */
public interface TransactionPayload {

    /**
     * Turn the payload data to byte array.
     *
     * @return the byte [ ]
     * @throws Exception the exception
     */
    byte[] toBytes() throws Exception;

    /**
     * Calculate the gas needed for this payload data.
     *
     * @return the amount of gas needed
     */
    BigInteger gasCount();
}

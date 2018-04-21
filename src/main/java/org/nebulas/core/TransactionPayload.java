package org.nebulas.core;

import java.math.BigInteger;

public interface TransactionPayload {

    byte[] toBytes() throws Exception;

    BigInteger gasCount();
}

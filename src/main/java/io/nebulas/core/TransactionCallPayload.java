package io.nebulas.core;

import com.google.gson.Gson;
import io.nebulas.util.JSONUtils;

import java.math.BigInteger;
import java.util.regex.Pattern;

/**
 * The TransactionCallPayload is a class describing the payload data of a CALL type transaction.
 */
public class TransactionCallPayload implements TransactionPayload {

    private String Function;
    private String Args;

    /**
     * Build a new TransactionCallPayload from given payload data.
     * This payload data should be a byte array that could be parsed in to a TransactionCallPayload Type Object.
     *
     * @param data the payload data
     * @return the transaction call payload
     * @throws Exception if the function name parsed from the payload data is not a valid JS function name
     */
    public static TransactionCallPayload LoadPayload(byte[] data) throws Exception {
        TransactionCallPayload payload = JSONUtils.Parse(data, TransactionCallPayload.class);
        return new TransactionCallPayload(payload.getFunction(), payload.getArgs());
    }

    /**
     * Constructs a new TransactionCallPayload.
     *
     * @param function the function
     * @param args     the args
     * @throws Exception if the function name parsed from the payload data is not a valid JS function name
     */
    public TransactionCallPayload(String function, String args) throws Exception {
        checkArgs(function, args);
        Function = function;
        Args = args;
    }

    private void checkArgs(String fucntion, String args) throws Exception {
        Pattern pattern = Pattern.compile("^[a-zA-Z$][A-Za-z0-9_$]*$");
        if (!pattern.matcher(fucntion).matches()) {
            throw new Exception("invalid function of call payload");
        }
        if (args != null && args.length() > 0 ) {
            Gson gson = new Gson();
            gson.fromJson(args, String[].class);
        }
    }

    /**
     * Gets the function name of this CALL type payload.
     *
     * @return the function name
     */
    public String getFunction() {
        return Function;
    }

    /**
     * Sets the function name.
     *
     * @param function the function
     */
    public void setFunction(String function) {
        Function = function;
    }

    /**
     * Gets the args string of this CALL type payload.
     *
     * @return the args string
     */
    public String getArgs() {
        return Args;
    }

    /**
     * Sets the args string.
     *
     * @param args the args
     */
    public void setArgs(String args) {
        Args = args;
    }

    @Override
    public byte[] toBytes() throws Exception {
        return JSONUtils.Stringify(this).getBytes();
    }

    @Override
    public BigInteger gasCount() {
        return new BigInteger("60");
    }
}

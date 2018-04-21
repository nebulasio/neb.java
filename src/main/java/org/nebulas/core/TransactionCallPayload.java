package org.nebulas.core;

import com.google.gson.Gson;
import org.nebulas.util.JSONUtils;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class TransactionCallPayload implements TransactionPayload {

    private String Function;
    private String Args;

    public static TransactionCallPayload LoadPayload(byte[] data) throws Exception {
        TransactionCallPayload payload = JSONUtils.Parse(data, TransactionCallPayload.class);
        return new TransactionCallPayload(payload.getFunction(), payload.getArgs());
    }

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

    public String getFunction() {
        return Function;
    }

    public void setFunction(String function) {
        Function = function;
    }

    public String getArgs() {
        return Args;
    }

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

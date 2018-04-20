package org.nebulas.core;

import org.junit.Test;
import org.nebulas.util.ByteUtils;

import static org.junit.Assert.assertTrue;

public class TransactionTest {

    @Test
    public void fromProto() throws Exception {

        String encodedText = "CiCCVuSptT1oavBbf2UJfh+FHaOb15rhXgvMnyMPrpaLORIaGVfKCoAu9e0830glBZkJcmNoRXXOUbwvcz8aGhlXygqALvXtPN9IJQWZCXJjaEV1zlG8L3M/IhAAAAAAAAAAAAAAAAAAAAAKKAEwxbrg1gU6LAoGZGVwbG95EiJ7IlNvdXJjZVR5cGUiOiIxMSIsIlNvdXJjZSI6IjExMSJ9QGRKEAAAAAAAAAAAAAAAAAAATiBSEAAAAAAAAAAAAAAAAAAPQkBYAWJB5ZgDuJwK+EPpThEY0sAHc19immxH/LJCyXzj3OeaDUV7JGil7aIlcRTVsWAd32D5T12q9INlNVCT9m2lEV6/YgE=";

        byte[] result = ByteUtils.FromBase64(encodedText);

        Transaction transaction = new Transaction();
        transaction.fromProto(result);

        String tr = ByteUtils.ToBase64(transaction.toProto());

        assertTrue(encodedText.equals(tr));
    }
}
import org.junit.Test;
import org.nebulas.core.Transaction;

import java.util.Base64;

import static org.junit.Assert.*;

public class ProtoTest {
    final Base64.Decoder decoder = Base64.getDecoder();
    final Base64.Encoder encoder = Base64.getEncoder();

    @Test
    public void testSerialize() throws Exception {

        String encodedText = "CiCCVuSptT1oavBbf2UJfh+FHaOb15rhXgvMnyMPrpaLORIaGVfKCoAu9e0830glBZkJcmNoRXXOUbwvcz8aGhlXygqALvXtPN9IJQWZCXJjaEV1zlG8L3M/IhAAAAAAAAAAAAAAAAAAAAAKKAEwxbrg1gU6LAoGZGVwbG95EiJ7IlNvdXJjZVR5cGUiOiIxMSIsIlNvdXJjZSI6IjExMSJ9QGRKEAAAAAAAAAAAAAAAAAAATiBSEAAAAAAAAAAAAAAAAAAPQkBYAWJB5ZgDuJwK+EPpThEY0sAHc19immxH/LJCyXzj3OeaDUV7JGil7aIlcRTVsWAd32D5T12q9INlNVCT9m2lEV6/YgE=";

        byte[] result = decoder.decode(encodedText);

        Transaction transaction = Transaction.fromProto(result);

        String tr = encoder.encodeToString(Transaction.toProto(transaction));

        assertTrue(encodedText.equals(tr));

    }
}

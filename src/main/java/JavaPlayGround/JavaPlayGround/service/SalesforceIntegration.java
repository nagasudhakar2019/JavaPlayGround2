//package JavaPlayGround.JavaPlayGround.service;
//
//
//import java.security.KeyFactory;
//import java.security.NoSuchAlgorithmException;
//import java.security.PrivateKey;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.PKCS8EncodedKeySpec;
//import java.time.Instant;
//import java.time.temporal.ChronoUnit;
//import java.util.Base64;
//import java.util.Date;
//import java.util.UUID;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//public class SalesforceIntegration {
//    public String createJwtSignedHMAC(String userId) throws InvalidKeySpecException, NoSuchAlgorithmException {
//        PrivateKey privateKey = getPrivateKey();
//        Instant now = Instant.now();
//
//        return Jwts.builder().claim("iss", "3MVG99OxTyEMCQ3j_jSfRtQoOi6WS2HqtSVJ05t4QAxDa_QCNvzXhQMXGftFVPL6moksVCjkQeFxhfunXOBpu").claim("aud",
//                "https://login.salesforce.com").setSubject("npatamsetty@linkedin.com").setId(
//                UUID.randomUUID().toString()).setIssuedAt(Date.from(now)) //
//                .setExpiration(Date.from(now.plus(5L, ChronoUnit.MINUTES))).signWith(
//                        privateKey, SignatureAlgorithm.RS256).compact();
//    }
//
//    private PrivateKey getPrivateKey() throws NoSuchAlgorithmException, InvalidKeySpecException {
//        String rsaPrivateKey = "-----BEGIN PRIVATE KEY-----\n" +
//                "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDfn1ykS5Zl5DHK\n" +
//                "TcddW1+/LMF+cVkj9HX5Sozqa4Oc2lprAQEPTJbdlW//DM2Oj7bHakRcjevPnvb5\n" +
//                "E+MO3KQQ7lVuvHQdQeaoAujzcFjUH03G22RRtlKYe8VHB5NcbZki/QrRubEcDOfK\n" +
//                "jhpYoRXRJ8chJqlqzHZPtsAaMEXokhk6xPLnv3+QWGGRISC1+axIQfES+dl1IuXu\n" +
//                "Pq3CCrH6vBsS1vZ8Ni/ko7r0dhKorvem4ltVyD/J+Cyt46HlR9MCbRrYRRZgVM3A\n" +
//                "D/oE/j+tzEK4bTlCNXY9/J1+nmqrCpBBLQUUHVNjqAqeCogPM16lPLEGNAmC4PCK\n" +
//                "P/zXhWuJAgMBAAECggEBAKjR4lqWReB+OaiEt3GfPdVRsHIImEcwkq+0vFVs/Vs4\n" +
//                "7PHDPE2UgICgBIED5Vsu28oIS7uj2NZRKBo6DTx3DdVKWGzVEMPVsJA+QicmNalO\n" +
//                "SKVLk5ysjAZZykEpUvKAOw/TAIv8J90JUSP1y6YFVjckVIyOZ3AdE2Ryjuw2bVB5\n" +
//                "Mfzg3BCHMe2j9xE9z4rbjIFooSuUNAVpFDxKcTw7vLhz29CLCqVU/6btmQC6LV5X\n" +
//                "QAllgx+eYAbXBQhDgpLmGfmvHGEcApB8bjJYzUjYsDUXMyE2nNrastgjxTqGMtOg\n" +
//                "t0BoYruxj3MYzfDwpftf70ZZBlCcPltWijZiT/3vDVECgYEA9Rk4aJTzhanY7CEp\n" +
//                "Ztrfg0hpjNeM4DJz2D6cWbV0O44WpuQ3KhYFoIxs5yXpcXdJr5aWdX0dOedP4W1m\n" +
//                "sv+j/ajALZ5ilMY4eJuaJbAlhAwfXoStQz3C+Fyj7qsvmDBSZ0kFUPdqFZKrBsCB\n" +
//                "VdwVnd8GCYOmPwSn9/kgYmvCibcCgYEA6ZGbpOlpd4a5OFrE/mvXIE0+7mydd/Vl\n" +
//                "V+CcHIFqrweJ94sVTIgiazqXJq+XTGUievQ5NLIaGug61CUabASep5cuWrt3UZUm\n" +
//                "C9cfAgA/h2y8WdINK6KtaDInf/9lZeonZBg3ar29worNx4ZeLD0k8RxFCQZ7v6Zp\n" +
//                "SktPYUvUtL8CgYEA58u+SUn1NQf4mviRyzBcCjDFgemo1a9hV7V+8GhnUJuEWLmk\n" +
//                "Yi0JjVjA9aopKKIEEgd8rAhzR3u3VB6+7bJPSWn6tioAWWtNpOKj2djI4iUE1cLs\n" +
//                "iZczeOdEMke7b1bj18J7QKN8tIJNNMmCh8zotLFjaEQVSawBnscBFZOMG+kCgYBr\n" +
//                "zhpB1r4oPhW1jifIqqvDrAO09osD+E8LbY+AlLdSDC/BAwAUr+z7AzMK1xcFWtS8\n" +
//                "XYcd7GqiKrgkfO+iFcvI3L23gTmEfUvvQR59xPGNp0GUT6BmmJJjOmsC6DW8AYSm\n" +
//                "7Yp+iQ9SANEUG8/RqXMomny+urBZeAy3DuWXqfGGbwKBgBqvORIxNvV3zP4/GFsO\n" +
//                "or64Ys47Nr2eQ89sJ5qTAp4Gq47E6R/1lTALDasRbFcoYGfMkST6K6Mgg+HP+mW2\n" +
//                "gL5Q4zr6S+0WbPSbG+PZ556FOTrFVg3k0ukcSxE0bxXQ9TfAe7yXcdrW3Jy+aH0u\n" +
//                "ZTvRZRAM3/Mo4MfMxXWXOlm2\n" +
//                "-----END PRIVATE KEY-----";
//        rsaPrivateKey = rsaPrivateKey.replace("-----BEGIN PRIVATE KEY-----", "");
//        rsaPrivateKey = rsaPrivateKey.replace("-----END PRIVATE KEY-----", "");
//        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(rsaPrivateKey));
//        KeyFactory kf = KeyFactory.getInstance("RSA");
//        return kf.generatePrivate(keySpec);
//    }
//}

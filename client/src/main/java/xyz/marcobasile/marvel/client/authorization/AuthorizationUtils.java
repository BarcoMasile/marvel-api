package xyz.marcobasile.marvel.client.authorization;

import lombok.Data;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@UtilityClass
public class AuthorizationUtils {

    @SneakyThrows
    public String apiKeyDigest(String apiKey, String apiSecret) {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(String.format("%d%s%s",System.nanoTime(), apiSecret, apiKey).getBytes());
        return DatatypeConverter.printHexBinary(md5.digest()).toLowerCase();
    }

    public Map<String, Collection<String>> requestAuthorizationQuerymap(AuthorizationParameters authParams) {
        return Map.of(
                "ts", Collections.singleton(authParams.getTs()),
                "apikey", Collections.singleton(authParams.getApikey()),
                "hash", Collections.singleton(AuthorizationUtils.apiKeyDigest(authParams))
        );
    }

    public String apiKeyDigest(AuthorizationParameters parameters) {
        MessageDigest md5 = parameters.getMd5();
        md5.update(parameters.getHashParams().getBytes());
        return DatatypeConverter.printHexBinary(md5.digest()).toLowerCase();
    }

    @Getter
    public static class AuthorizationParameters {
        private final String ts;
        private final String apikey;
        private final String apisecret;

        private final MessageDigest md5;

        public static AuthorizationParameters of(String apiKey, String apiSecret) {
            return new AuthorizationParameters(apiKey, apiSecret);
        }

        @SneakyThrows
        public AuthorizationParameters(String apiKey, String apiSecret) {
            ts = String.format("%d", System.nanoTime());
            apikey = apiKey;
            apisecret = apiSecret;
            md5 = MessageDigest.getInstance("MD5");
        }

        public String getHashParams() {
            return String.format("%d%s%s",System.nanoTime(), apisecret, apikey);
        }
    }
}

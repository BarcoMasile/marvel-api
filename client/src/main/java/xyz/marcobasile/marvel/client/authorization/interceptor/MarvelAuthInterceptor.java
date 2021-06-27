package xyz.marcobasile.marvel.client.authorization.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import xyz.marcobasile.marvel.client.authorization.AuthorizationUtils;
import xyz.marcobasile.marvel.client.authorization.AuthorizationUtils.AuthorizationParameters;
import xyz.marcobasile.marvel.client.config.MarvelProperties;

import java.util.Collection;
import java.util.Map;

public class MarvelAuthInterceptor implements RequestInterceptor {

    private final String apiKey;
    private final String apiSecret;

    public MarvelAuthInterceptor(MarvelProperties props) {
        apiKey = props.getApiKey();
        apiSecret = props.getApiSecret();
    }

    @Override
    public void apply(RequestTemplate template) {
        Map<String, Collection<String>> queries = AuthorizationUtils.requestAuthorizationQuerymap(authParams());//template.queries();
        queries.putAll(template.queries());
        template.queries(queries);
    }

    private AuthorizationParameters authParams() {
        return AuthorizationParameters.of(apiKey, apiSecret);
    }
}

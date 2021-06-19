package xyz.marcobasile.marvel.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "marvel")
public class MarvelProperties {

    private String baseUrl;
    private String apiKey;
    private String apiSecret;
}

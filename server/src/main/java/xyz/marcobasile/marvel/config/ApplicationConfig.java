package xyz.marcobasile.marvel.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MarvelProperties.class)
public class ApplicationConfig {
}

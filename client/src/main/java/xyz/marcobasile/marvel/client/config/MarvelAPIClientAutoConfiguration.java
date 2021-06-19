package xyz.marcobasile.marvel.client.config;

import feign.Feign;
import feign.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import xyz.marcobasile.marvel.client.feign.*;

@Configuration
@EnableConfigurationProperties(MarvelProperties.class)
@ConditionalOnClass(Feign.class)
@EnableFeignClients(basePackages = "xyz.marcobasile.marvel.client.feign")
public class MarvelAPIClientAutoConfiguration {

    @Bean
    public MarvelCharacters charactersClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelCharacters.class, props.getBaseUrl());
    }

    @Bean
    public MarvelComics comicsClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelComics.class, props.getBaseUrl());
    }

    @Bean
    public MarvelCreators creatorsClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelCreators.class, props.getBaseUrl());
    }

    @Bean
    public MarvelEvents eventsClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelEvents.class, props.getBaseUrl());
    }

    @Bean
    public MarvelSeries seriesClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelSeries.class, props.getBaseUrl());
    }

    @Bean
    public MarvelStories storiesClient(MarvelProperties props) {
        return Feign.builder()
                .target(MarvelStories.class, props.getBaseUrl());
    }



}

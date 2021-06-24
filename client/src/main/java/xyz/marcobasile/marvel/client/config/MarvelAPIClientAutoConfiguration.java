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
import xyz.marcobasile.marvel.client.authorization.interceptor.MarvelAuthInterceptor;
import xyz.marcobasile.marvel.client.feign.*;

@Configuration
@EnableConfigurationProperties(MarvelProperties.class)
@ConditionalOnClass(Feign.class)
@EnableFeignClients(basePackages = "xyz.marcobasile.marvel.client.feign")
public class MarvelAPIClientAutoConfiguration {

    @Bean
    public MarvelAuthInterceptor interceptor(MarvelProperties properties) {
        return new MarvelAuthInterceptor(properties);
    }
}

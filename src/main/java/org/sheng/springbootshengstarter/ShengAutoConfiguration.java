package org.sheng.springbootshengstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shengxingyue on 2018/7/1 11:10
 */
@Configuration
@EnableConfigurationProperties(ShengProperties.class)
@ConditionalOnProperty(prefix = "sheng", value = "enabled")
public class ShengAutoConfiguration {

    @Autowired
    ShengProperties shengProperties;

    @Bean
    public ShengService getShengService() {
        return new ShengService(shengProperties);
    }
}
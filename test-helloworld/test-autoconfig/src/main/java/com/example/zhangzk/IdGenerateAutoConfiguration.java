/**
 * 
 */
package com.example.zhangzk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @EnableConfigurationProperties 注解的作用正是将指定的类以组件的形式注入到 IOC 容器中，并开启其 @ConfigurationProperties 功能。
 */
@ConditionalOnClass(IdProperties.class)
@EnableConfigurationProperties(IdProperties.class)
@Configuration
public class IdGenerateAutoConfiguration {
    @Autowired
    private IdProperties properties;
    @Bean
    public IdGenerateService idGenerateService() {
        return new IdGenerateService(properties.getWorkId());
    }
}

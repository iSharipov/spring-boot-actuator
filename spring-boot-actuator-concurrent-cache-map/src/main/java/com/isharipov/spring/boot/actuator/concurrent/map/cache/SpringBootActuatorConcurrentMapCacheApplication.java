package com.isharipov.spring.boot.actuator.concurrent.map.cache;

import com.isharipov.spring.boot.actuator.concurrent.map.cache.config.SpringProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({SpringProperties.class})
@SpringBootApplication
public class SpringBootActuatorConcurrentMapCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootActuatorConcurrentMapCacheApplication.class, args);
    }
}

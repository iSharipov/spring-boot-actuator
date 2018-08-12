package com.isharipov.spring.boot.actuator.concurrent.map.cache.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "spring.cache")
public class SpringProperties {
    private List<String> cacheNames;

    public List<String> getCacheNames() {
        return cacheNames;
    }

    public void setCacheNames(List<String> cacheNames) {
        this.cacheNames = cacheNames;
    }
}

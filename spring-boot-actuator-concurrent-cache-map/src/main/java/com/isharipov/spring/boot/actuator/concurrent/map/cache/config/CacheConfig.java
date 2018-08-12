package com.isharipov.spring.boot.actuator.concurrent.map.cache.config;

import com.isharipov.spring.boot.actuator.concurrent.map.cache.cache.ConcurrentMapCacheMetricsWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Collectors;

@EnableCaching
@Configuration
public class CacheConfig extends CachingConfigurerSupport {
    private final SpringProperties springProperties;

    public CacheConfig(SpringProperties springProperties) {
        this.springProperties = springProperties;
    }

    @Bean
    @Override
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(springProperties.getCacheNames().stream().map(ConcurrentMapCacheMetricsWrapper::new).collect(Collectors.toList()));
        return cacheManager;
    }
}

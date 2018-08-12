package com.isharipov.spring.boot.actuator.concurrent.map.cache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CatService implements AnimalService {

    @Override
    @Cacheable("cats")
    public List<String> getNames() {
        return Arrays.asList("first cat", "second cat");
    }
}


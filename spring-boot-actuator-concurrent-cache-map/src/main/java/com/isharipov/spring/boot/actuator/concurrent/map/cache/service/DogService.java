package com.isharipov.spring.boot.actuator.concurrent.map.cache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DogService implements AnimalService {

    @Override
    @Cacheable("dogs")
    public List<String> getNames() {
        return Arrays.asList("first dog", "second dog");
    }
}

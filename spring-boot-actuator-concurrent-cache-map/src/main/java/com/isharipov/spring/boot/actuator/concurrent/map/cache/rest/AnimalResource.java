package com.isharipov.spring.boot.actuator.concurrent.map.cache.rest;

import com.isharipov.spring.boot.actuator.concurrent.map.cache.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AnimalResource {

    private final List<AnimalService> animalServices;


    public AnimalResource(List<AnimalService> animalServices) {
        this.animalServices = animalServices;
    }

    @GetMapping("/animal-names")
    public List<String> getAnimalNames() {
        return animalServices.stream().flatMap(names -> names.getNames().stream()).collect(Collectors.toList());
    }
}

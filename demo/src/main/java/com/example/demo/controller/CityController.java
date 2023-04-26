package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;

@RestController
public class CityController {

    private final ICityService cityService;

    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/cities/{id}/")
    public ResponseEntity<City> getCity(@PathVariable("id") int id) {
        return cityService.findById(id);
    }

    @GetMapping(value = "/cities")
    public ResponseEntity<List<City>> getCities() {
        return cityService.findAll();
    }
}

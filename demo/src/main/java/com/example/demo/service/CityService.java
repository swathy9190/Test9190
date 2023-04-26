package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;

@Service
public class CityService implements ICityService
{
    private final List<City> cities = new ArrayList<>();

    public CityService() {

        cities.add(new City(1L, "Bratislava", 432000));
        cities.add(new City(2L, "Budapest", 1759000));
        cities.add(new City(3L, "Prague", 1280000));
        cities.add(new City(4L, "Warsaw", 1748000));
        cities.add(new City(5L, "Los Angeles", 3971000));
        cities.add(new City(6L, "New York", 8550000));
        cities.add(new City(7L, "Edinburgh", 464000));
        cities.add(new City(8L, "Berlin", 3671000));
    }

    @Override
    public ResponseEntity<List<City>> findAll() {
        return ResponseEntity.ok(cities);
    }

    @Override
    public ResponseEntity<City> findById(int id) {
        if (id < 0 || id >= cities.size()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(cities.get(id));
    }

}
package com.example.demo.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.City;

public interface ICityService {
    ResponseEntity<List<City>> findAll();
    ResponseEntity<City> findById(int id);
}

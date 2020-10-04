package com.example.airbase.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirbaseService {
    private final AirbaseRepository repository;

    @Autowired
    AirbaseService(AirbaseRepository repository){
        this.repository = repository;
    }

    public List<Airbase> findAll(){
        return this.repository.findAll();
    }

    public Airbase findById(Long id){
        return this.repository.findAirbaseById(id);
    }
}

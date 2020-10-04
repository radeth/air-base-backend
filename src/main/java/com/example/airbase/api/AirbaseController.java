package com.example.airbase.api;

import com.example.airbase.domain.Airbase;
import com.example.airbase.domain.AirbaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airbase")
public class AirbaseController {

    private final AirbaseService service;

    @Autowired
    AirbaseController(AirbaseService service) {
        this.service = service;
    }

    @GetMapping("/find_all")
    private List<Airbase> getAllAirbase() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Airbase> read(@PathVariable("id") Long id) {
        Airbase foundAirbase = service.findById(id);
        if (foundAirbase == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundAirbase);
        }
    }

}

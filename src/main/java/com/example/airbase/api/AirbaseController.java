package com.example.airbase.api;

import com.example.airbase.domain.Airbase;
import com.example.airbase.domain.AirbaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test")
    private String t() {
        return "tttt";
    }

}

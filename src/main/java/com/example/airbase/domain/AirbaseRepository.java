package com.example.airbase.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirbaseRepository extends JpaRepository<Airbase, Long> {
    Airbase findAirbaseById(Long id);
}

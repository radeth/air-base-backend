package com.example.airbase.domain;

import javax.persistence.*;

@Entity
@Table(name="airbase", schema = "public")
public class Airbase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
}

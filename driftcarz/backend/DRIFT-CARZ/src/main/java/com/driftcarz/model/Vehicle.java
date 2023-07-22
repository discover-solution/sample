package com.driftcarz.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Vehicle")
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;
    @Column(length = 20)
    private String vehicleName;
    @Column(length = 15, unique = true)
    private String vehicleNumber;
    @Column(length = 2)
    private Integer seater;
    @Column(length = 10)
    private String fuelType;
}
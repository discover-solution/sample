package com.driftcarz.dto;

import lombok.Data;

@Data
public class VehicleDTO {
    private String vehicleName;
    private String vehicleNumber;
    private Integer seater;
    private String fuelType;
}
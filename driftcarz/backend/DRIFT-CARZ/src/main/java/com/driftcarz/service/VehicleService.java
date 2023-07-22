package com.driftcarz.service;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.VehicleDTO;

public interface VehicleService {

    ResponseWrapper getAllVehicles();

    ResponseWrapper addVehicle(VehicleDTO vehicleDTO);
}

package com.driftcarz.controllers;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.VehicleDTO;
import com.driftcarz.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(path = "/showAllVehicles")
    public ResponseEntity<ResponseWrapper> showAllVehicles(){
        ResponseWrapper wrapper = vehicleService.getAllVehicles();
        return new ResponseEntity<>(wrapper, wrapper.getStatus());
    }

    @PostMapping(path = "/addVehicle")
    public ResponseEntity<ResponseWrapper> addVehicle(@RequestBody VehicleDTO vehicleDTO){
        ResponseWrapper wrapper = vehicleService.addVehicle(vehicleDTO);
        return new ResponseEntity<>(wrapper, wrapper.getStatus());
    }
}
package com.driftcarz.service.impl;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.VehicleDTO;
import com.driftcarz.model.Vehicle;
import com.driftcarz.repo.VehicleRepository;
import com.driftcarz.service.VehicleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public ResponseWrapper getAllVehicles() {
        try{
            List<Vehicle> vehicleList = vehicleRepository.findAll(Sort.by(Sort.Direction.DESC, "seater"));
            return new ResponseWrapper(vehicleList, "Successfully Retrieved All Vehicles", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseWrapper("NA" , "No Vehicles found", HttpStatus.NO_CONTENT);
        }
    }

    @Override
    public ResponseWrapper addVehicle(VehicleDTO vehicleDTO) {
        Vehicle vehicleToBeAdded = new Vehicle();
        BeanUtils.copyProperties(vehicleDTO, vehicleToBeAdded);
        try{
            vehicleToBeAdded = vehicleRepository.save(vehicleToBeAdded);
            return new ResponseWrapper(vehicleToBeAdded, "Successfully added to DB", HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseWrapper("N/A", vehicleDTO+" failed to be saved", HttpStatus.EXPECTATION_FAILED);
        }
    }
}

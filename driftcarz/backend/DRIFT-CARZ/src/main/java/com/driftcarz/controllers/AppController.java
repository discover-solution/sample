package com.driftcarz.controllers;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drif-carz")
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping("/allCars")
    public ResponseEntity<ResponseWrapper> getAllCars(){
        ResponseWrapper responseWrapper = service.getAllCars();
        return new ResponseEntity<>(responseWrapper, responseWrapper.getStatus());
    }

}
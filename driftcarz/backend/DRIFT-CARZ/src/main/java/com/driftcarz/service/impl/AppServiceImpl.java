package com.driftcarz.service.impl;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.service.AppService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public ResponseWrapper getAllCars() {
        return new ResponseWrapper(null,"Successful", HttpStatus.OK);
    }
}
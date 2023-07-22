package com.driftcarz.service.impl;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.inputs.UserList;
import com.driftcarz.service.AppService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public ResponseWrapper getAllCars() {
        ResponseWrapper responseWrapper = new ResponseWrapper();
            responseWrapper.setMessage("Successful Message");
            responseWrapper.setPayload(UserList.getUserList());
            responseWrapper.setStatus(HttpStatus.OK);
        return responseWrapper;
    }
}
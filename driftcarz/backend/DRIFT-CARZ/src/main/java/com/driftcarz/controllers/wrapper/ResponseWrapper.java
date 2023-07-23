package com.driftcarz.controllers.wrapper;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseWrapper{
    private Object payload;
    private String message;
    private HttpStatus status;

    public ResponseWrapper(Object payload, String message, HttpStatus status){
        this.payload = payload;
        this.message = message;
        this.status = status;
    }
}
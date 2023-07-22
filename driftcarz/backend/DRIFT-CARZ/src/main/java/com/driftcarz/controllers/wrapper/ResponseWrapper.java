package com.driftcarz.controllers.wrapper;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseWrapper{
    private Object payload;
    private String message;
    private HttpStatus status;
}
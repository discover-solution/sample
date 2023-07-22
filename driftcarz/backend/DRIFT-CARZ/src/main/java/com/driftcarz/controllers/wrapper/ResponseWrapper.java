package com.driftcarz.controllers.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class ResponseWrapper{
    private Object payload;
    private String message;
    private HttpStatus status;
}
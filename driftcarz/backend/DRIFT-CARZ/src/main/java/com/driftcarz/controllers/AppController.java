package com.driftcarz.controllers;

import com.driftcarz.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drif-carz")
public class AppController {

    @Autowired
    private AppService service;

}
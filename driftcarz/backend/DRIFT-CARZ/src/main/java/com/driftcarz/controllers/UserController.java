package com.driftcarz.controllers;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.UserDTO;
import com.driftcarz.service.UserService;
import com.driftcarz.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/addUser")
    public ResponseEntity<ResponseWrapper> addUser(@RequestBody UserDTO userDTO){
        userDTO = AppUtils.modifyUserInfo(userDTO);
        ResponseWrapper responseWrapper = userService.addUser(userDTO);
        return new ResponseEntity<>(responseWrapper, responseWrapper.getStatus());
    }
}

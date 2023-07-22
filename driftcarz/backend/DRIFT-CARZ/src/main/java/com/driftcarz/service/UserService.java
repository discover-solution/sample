package com.driftcarz.service;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.UserDTO;

public interface UserService {
    ResponseWrapper addUser(UserDTO userDTO);
}
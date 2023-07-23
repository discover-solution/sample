package com.driftcarz.service.impl;

import com.driftcarz.controllers.wrapper.ResponseWrapper;
import com.driftcarz.dto.UserDTO;
import com.driftcarz.model.User;
import com.driftcarz.repo.UserRepository;
import com.driftcarz.service.UserService;
import com.driftcarz.utils.AppUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseWrapper addUser(UserDTO userDTO) {
        User userToBeSaved = new User();
        BeanUtils.copyProperties(userDTO, userToBeSaved);
        try{
            userToBeSaved = userRepository.save(userToBeSaved);
            return new ResponseWrapper(userToBeSaved, "Successfully Created", HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseWrapper("Service Exception", userDTO +" Failed to be save in DB.", HttpStatus.EXPECTATION_FAILED);
        }
    }

}
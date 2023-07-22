package com.driftcarz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String mobileNumber;
    private Character isAdmin;
    private Date lastLogin;
}

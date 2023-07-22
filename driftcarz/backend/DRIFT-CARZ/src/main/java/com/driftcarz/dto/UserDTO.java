package com.driftcarz.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String fullName;
    private String password;
    private Character isAdmin;
    private String mobileNumber;
    private String emailId;
}

package com.driftcarz.utils;

import com.driftcarz.dto.UserDTO;
import org.springframework.http.HttpHeaders;

public class AppUtils {

    public static UserDTO modifyUserInfo(UserDTO userDTO) {
        userDTO.setMobileNumber(modifyMobileNumber(userDTO.getMobileNumber()));
        userDTO.setIsAdmin('N');
        return userDTO;
    }

    public static String modifyMobileNumber(String mobileNumber){
        return AppConstants.COUNTRY_CODE.concat(mobileNumber);
    }

    public static HttpHeaders getHeaders(String headerName, String headerValue){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(headerName, headerValue);
        return httpHeaders;
    }

}

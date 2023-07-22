package com.driftcarz.utils;

import com.driftcarz.dto.UserDTO;

public class AppUtils {

    public static UserDTO modifyUserInfo(UserDTO userDTO) {
        userDTO.setMobileNumber(modifyMobileNumber(userDTO.getMobileNumber()));
        userDTO.setIsAdmin('N');
        return userDTO;
    }

    public static String modifyMobileNumber(String mobileNumber){
        return AppConstants.COUNTRY_CODE.concat(mobileNumber);
    }

}

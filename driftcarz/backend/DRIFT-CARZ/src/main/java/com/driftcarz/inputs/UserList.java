package com.driftcarz.inputs;

import com.driftcarz.dto.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserList {
    public static List<User> getUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1234,"admin","9066917689",'Y',new Date()));
        userList.add(new User(5678,"user1","9113214058",'N',new Date()));
        userList.add(new User(9012,"user2","6362778153",'N',new Date()));
        return userList;
    }
}

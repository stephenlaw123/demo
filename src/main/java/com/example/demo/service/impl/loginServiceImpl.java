package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.LoginService;

import static java.rmi.server.LogStream.log;

public class loginServiceImpl implements LoginService {
    @Override
    public User getLoginUser(String name) {
        User user = new User();
        log("inside loginServiceImpl ");
        if(name.equals("1")){
            user.setName("roy law");
            user.setPhone("9876543");
            user.setIdNumber("Z98765(4)");
        }
        if(name.equals("2")){
            user.setName("tally");
            user.setPhone("9876sfsdf543");
            user.setIdNumber("Z9876sdfsd5(4)");
        }
        return user;
    }
}

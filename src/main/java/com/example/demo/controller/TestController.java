package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {

    private LoginService loginService;

    public TestController(LoginService loginService){
        this.loginService = loginService;
    }


    @GetMapping(path = "/hi")
    public String sayHi(){
        return "hi";
    }
    @GetMapping(path = "/user")
    public User getUser(){
        User user = new User();
        user.setName("roy law");
        user.setPhone("9876543");
        user.setIdNumber("Z98765(4)");
        return user;
    }
    @GetMapping(path = "/user/1")
    public User getUserRoy(){
        User user = loginService.getLoginUser("1");
        return user;
    }
}

package com.programmingpointer.E_Commerce_Application.controller;

import com.programmingpointer.E_Commerce_Application.model.User;
import com.programmingpointer.E_Commerce_Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        userService.registerUser(user);
        return user;
    }
}

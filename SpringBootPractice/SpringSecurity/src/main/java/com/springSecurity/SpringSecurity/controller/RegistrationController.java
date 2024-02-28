package com.springSecurity.SpringSecurity.controller;

import com.springSecurity.SpringSecurity.entity.User;
import com.springSecurity.SpringSecurity.model.UserModel;
import com.springSecurity.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService service;
    public String register(@RequestBody UserModel userModel){
      User user = service.register(userModel);
      return "Success";
    }
}

package com.SecurityPractice.SecurityPractice.controller;

import com.SecurityPractice.SecurityPractice.entity.UserInfo;
import com.SecurityPractice.SecurityPractice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class DataController {

    @Autowired
    private UserInfoService service;

    @GetMapping("/message/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String sayHello(){
        return "Hello Admin";
    }
    @GetMapping("/message/user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String Greetings(){
        return "Hello User";
    }

    @PostMapping("/new/user")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return service.addUser(userInfo);
    }
}

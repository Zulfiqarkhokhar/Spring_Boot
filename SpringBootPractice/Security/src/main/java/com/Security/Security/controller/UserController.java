package com.Security.Security.controller;

import com.Security.Security.models.User;
import com.Security.Security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return service.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
}

package com.Security.Security.services;

import com.Security.Security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
       list.add(new User("Zulfiqar","kingkhan","zulfiqar@gmail.com"));
        list.add(new User("Yasir","pakistan123","yasir@gmail.com"));
    }

    // get all users

    public List<User> getAllUsers(){
        return this.list;
    }

    // get single user
    public User getUser(String username){
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    // add user

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}

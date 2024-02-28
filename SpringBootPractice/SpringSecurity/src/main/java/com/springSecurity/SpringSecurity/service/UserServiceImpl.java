package com.springSecurity.SpringSecurity.service;

import com.springSecurity.SpringSecurity.entity.User;
import com.springSecurity.SpringSecurity.model.UserModel;
import com.springSecurity.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User register(UserModel userModel) {
        User user = new User();
        user.setEmail(userModel.getEmail());
        user.setFirstName(userModel.getFirstName());
        user.setRole("USER");
        user.setLastName(passwordEncoder.encode(userModel.getLastName()));
        repository.save(user);

        return user;
    }
}

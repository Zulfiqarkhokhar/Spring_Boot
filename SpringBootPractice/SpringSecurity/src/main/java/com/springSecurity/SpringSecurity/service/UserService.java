package com.springSecurity.SpringSecurity.service;

import com.springSecurity.SpringSecurity.entity.User;
import com.springSecurity.SpringSecurity.model.UserModel;

public interface UserService {
    User register(UserModel userModel);
}

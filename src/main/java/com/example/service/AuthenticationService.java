package com.example.service;

import com.example.dto.User;

public class AuthenticationService
{
    public User chekUser(String email, String password)
    {
        UserService userService = new UserService();
        return userService.receiveUser(email, password);
    }
}

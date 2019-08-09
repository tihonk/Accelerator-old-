package com.example.service;

import com.example.dao.UserDAO;
import com.example.dto.Role;
import com.example.dto.User;

public class UserService
{
    public void saveUser(String firstname, String lastname, String email, String passwordOne, String passwortTwo)
    {
        Role role = new Role();
        role.setId(3L);
        role.setTitle("Administrator");

        User user = new User();
        user.setId(3L);
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);
        user.setPassword(passwordOne);
        user.setRole(role);

        UserDAO userdao = new UserDAO();
        userdao.save( user, role);
    }

    public User
    receiveUser()
    {
        int id = 8;
        UserDAO userDAO = new UserDAO();
        return userDAO.receiveUser(id);
    }
}

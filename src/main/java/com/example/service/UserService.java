package com.example.service;

import com.example.dao.UserDAO;
import com.example.dto.Role;
import com.example.dto.User;
import sun.security.util.Password;

import java.nio.charset.Charset;
import java.util.Random;

public class UserService
{
    public void saveUser(String firstname, String lastname, String email, String passwordOne, String passwortTwo)
    {
        Role role = new Role();
        role.setTitle("Administrator");

        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);
        user.setRole(role);

        PasswordService ps = new PasswordService();
        String salt =  generateRandoomString();
        user.setPassword(ps.generateSecurePassword(passwordOne, salt));
        user.setSalt(salt);

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

    private String generateRandoomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}

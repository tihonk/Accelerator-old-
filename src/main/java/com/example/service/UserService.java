package com.example.service;

import com.example.dao.UserDAO;
import com.example.dto.Role;
import com.example.dto.User;

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
        String salt =  generateRandomString();
        user.setPassword(ps.generateSecurePassword(passwordOne, salt));
        user.setSalt(salt);

        UserDAO userdao = new UserDAO();
        userdao.save( user, role);
    }

    public User receiveUser(long id)
    {
        UserDAO userDAO = new UserDAO();
        return userDAO.receiveUser(id);
    }

    public User receiveUser(String email, String password)
    {
        UserDAO userDAO = new UserDAO();
        return userDAO.receiveUser(email, password);
    }

    private String generateRandomString() {
        char[] text = new char[16];
        String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        for (int i = 0; i < 16; i++)
        {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }
}

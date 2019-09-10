package com.example.controller;

import com.example.dto.User;
import com.example.service.AuthenticationService;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String registration(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userSave(ModelMap model, @RequestParam String email, String password)
    {
//        AuthenticationService authService = new AuthenticationService();
//        authService.chekUser(email, password);
//
//        UserService userService = new UserService();
//        User user = userService.receiveUser(email, password);
//        model.addAttribute("name", user.getRole().getTitle());
        return "home";
    }
}

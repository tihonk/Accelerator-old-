package com.example.controller;

import com.example.dto.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController
{
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(ModelMap model) {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String userSave(ModelMap model, @RequestParam String first, String last, String email, String password, String password_check)
    {
        UserService userService = new UserService();
        userService.saveUser(first, last, email, password, password_check);
//        model.addAttribute("name", user.getRole().getTitle());
        return "redirect:/login";

    }
}

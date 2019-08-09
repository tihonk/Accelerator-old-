package com.example.controller;

import com.example.dto.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

//    private UserServiceImpl userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model)
    {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "home";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String hello(ModelMap model, @RequestParam String first, String last, String email, String password, String password_check)
    {
        UserService userService = new UserService();
        userService.saveUser(first, last, email, password, password_check);
        User user = userService.receiveUser();
		model.addAttribute("name", user.getRole().getTitle());
		return "home";

	}

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(ModelMap model) {
	    return "registration";
    }
}
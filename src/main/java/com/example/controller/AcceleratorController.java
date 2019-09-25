package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class AcceleratorController
{
    @RequestMapping(value = "/chemistry/accelerator", method = RequestMethod.GET)
    public String getCount(ModelMap model)
    {
        return "accelerator";
    }

    @RequestMapping(value = "/chemistry/accelerator", method = RequestMethod.POST)
    public String analis( @RequestParam String text, Map<String, Object> model) {


        model.put("text", "Nice try, man! =)");
        return "accelerator";
    }
}

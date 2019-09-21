package com.example.controller;

import com.example.Configuration.CountConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CountController
{
    @RequestMapping(value = "/chemistry/counter", method = RequestMethod.GET)
    public String getCount(ModelMap model)
    {
        return "counter";
    }

    @RequestMapping(value = "/chemistry/counter", method = RequestMethod.POST)
    public String getResult(@RequestParam String text, Map<String, Object> model)
    {
        CountConfig countconfig = new CountConfig();
        String count = countconfig.newConfig(text);
        model.put("count", count);
        return "counter";
    }
}

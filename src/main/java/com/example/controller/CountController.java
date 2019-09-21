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
        double[] count = countconfig.newConfig(text);
        double gly = count[0];
        double ala = count[1];
        double val = count[2];
        double leu = count[3];
        double ile = count[4];
        double ser = count[5];
        double thr = count[6];
        double asp = count[7];
        double glu = count[8];
        double asn = count[9];
        double gln = count[10];
        double lys = count[11];
        double arg = count[12];
        double cys = count[13];
        double met = count[14];
        double phe = count[15];
        double tyr = count[16];
        double trp = count[17];
        double his = count[18];
        double pro = count[19];
        model.put("gly", gly);
        model.put("ala", ala);
        model.put("val", val);
        model.put("leu", leu);
        model.put("ile", ile);
        model.put("ser", ser);
        model.put("thr", thr);
        model.put("asp", asp);
        model.put("glu", glu);
        model.put("asn", asn);
        model.put("gln", gln);
        model.put("lys", lys);
        model.put("arg", arg);
        model.put("cys", cys);
        model.put("met", met);
        model.put("phe", phe);
        model.put("tyr", tyr);
        model.put("trp", trp);
        model.put("his", his);
        model.put("pro", pro);

        model.put("text", text);

        return "counter";
    }
}

package com.alpha.covidapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Welcome to Covid-19 Tracker";
    }
    
}

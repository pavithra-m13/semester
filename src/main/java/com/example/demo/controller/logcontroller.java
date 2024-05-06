package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.service.logservice;


@Controller
public class logcontroller {

    
    private logservice service;
    @GetMapping("/")
    public String ape(){
        return "index";
    }

    @PostMapping("/log")
    public String postMethodName(@ModelAttribute("user") com.example.demo.domain.User user) {
        // com.example.demo.domain.User u= service.log(user.getName(),user.getAge(), user.getSalary());        if(Objects.isNull(u))
        //     return "redirect:/display";

        
        // service.saveuser(user.getName(),user.getAge(), user.getSalary());
        return "redirect:/display";
    }
    @GetMapping("/display")
    public String ape1(){
        return "display";
    }
    
}

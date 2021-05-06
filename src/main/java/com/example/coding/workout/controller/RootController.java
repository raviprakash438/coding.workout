package com.example.coding.workout.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    public String IndexPage(){
        return "Welcome to Rest API.";
    }
}

package com.example.gkeCICD.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GkeController {


    @GetMapping("/")
    public String welcome2User() {
        return "Hi welcome to CICD deployment . ";
    }


}


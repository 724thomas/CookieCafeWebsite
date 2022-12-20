package com.example.cookiecafewebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @PostMapping("/signup")
    public String signup() {
        return "user/signup";
    }
}

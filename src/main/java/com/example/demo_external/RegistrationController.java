package com.example.demo_external;

import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @GetMapping("/")
    public String home() {
        return "<h2>Event Registration</h2>"
             + "<form action='/register'>"
             + "Name: <input name='name'>"
             + "<button>Register</button>"
             + "</form>";
    }

    @GetMapping("/register")
    public String register(@RequestParam String name) {
    	return "Welcome " + name + "! Registration Successful";
    }
}
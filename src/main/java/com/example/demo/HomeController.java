package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to your Spring Boot App!<br>" +
                "Running successfully using Java 26 and Spring Boot 4.1.0.";
    }
}
package com.avizway.Springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/springdemo")
    public String welcome() {
        return welcomeMessage; // This will return "From Aviz" if it's set in application.properties
    }
}

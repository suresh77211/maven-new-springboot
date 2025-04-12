package com.avizway.Springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/springdemo")
    public String welcome() {
        return "Welcome to the Springdemo application!";
    }
}

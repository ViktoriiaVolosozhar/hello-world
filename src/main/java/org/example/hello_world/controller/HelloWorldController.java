package org.example.hello_world.controller;

import org.example.hello_world.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public String sayHello() {
        String fullName = "Волосожар Вікторія Андріївна";
        LocalDateTime currentTime = LocalDateTime.now();
        return helloWorldService.getGreeting(fullName, currentTime);
    }
}

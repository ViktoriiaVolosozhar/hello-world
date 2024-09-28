package org.example.hello_world.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HelloWorldService {

    public String getGreeting(String fullName, LocalDateTime currentTime) {
        return "Привіт, це " + fullName + ". Час відповіді: " + currentTime;
    }
}

package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubActionGuideApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionGuideApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/get")
    public String get(){
        return applicationName;
    }
}

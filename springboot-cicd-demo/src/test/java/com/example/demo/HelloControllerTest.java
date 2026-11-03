
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {

    @GetMapping("/")
    public String home() {
        return "Hello! Spring Boot CI/CD pipeline is working.";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP";
    }
}

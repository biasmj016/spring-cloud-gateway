package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback/example")
    public String fallbackExample() {
        return "Example service is currently unavailable. Please try again later.";
    }

    @GetMapping("/fallback/example-b")
    public String fallbackExampleB() {
        return "Example B service is currently unavailable. Please try again later.";
    }
}
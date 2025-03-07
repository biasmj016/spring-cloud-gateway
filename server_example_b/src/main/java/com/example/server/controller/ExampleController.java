package com.example.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ExampleController {
    @GetMapping("/api/test-b")
    public String test() {
        log.info("Server B received request");
        return "Example server B received request";
    }
}

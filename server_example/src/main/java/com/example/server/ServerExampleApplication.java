package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerExampleApplication.class, args);
    }

}

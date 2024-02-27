package com.example.bloodBank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bloodbankapp{

    public static void main(String[] args) {
        SpringApplication.run(Bloodbankapp.class, args);
        System.out.println("Server Started");
    }

}

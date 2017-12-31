package com.lwb.controller;

import com.lwb.config.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.lwb"})
public class SpringBootApp {

    @Value("${messages.url}")
    private String url;

    @Autowired
    private Author author;

    @RequestMapping("/")
    String index() {
        System.out.println(url);
        System.out.println(author);
        System.out.println(211112);
        return "Hello Spring Boot2";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}

package com.example.springboot04022022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String GetHelloWorld() {
        return "<h1>Hello World</h1>";
    }

}

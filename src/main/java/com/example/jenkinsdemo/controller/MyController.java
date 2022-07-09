package com.example.jenkinsdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {

    @GetMapping("/get")
    public String message(){
        log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
        return "welcome to Shivam jenkins demo";
    }
}

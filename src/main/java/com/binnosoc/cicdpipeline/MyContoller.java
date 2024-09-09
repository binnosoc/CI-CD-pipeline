package com.binnosoc.cicdpipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyContoller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world, thank you";
    }
}

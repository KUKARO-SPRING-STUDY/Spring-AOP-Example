package com.example.demo.controller;

import com.example.demo.aspect.TestAspectInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping(value="/test")
    @TestAspectInterface
    public String testMapping(){
        System.out.println("METHOD");
        return "test";
    }
}

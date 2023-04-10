package com.sap.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simple {

    @GetMapping
    public String doSomething(){
        return "Hello";
    }
}

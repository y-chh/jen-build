package com.learngspring.myspringapp.test_package.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String sayHello() {
    return "Hello World !!" ;
    }

    @GetMapping("/auto")
    public String autoStart(){
        return "Auto Started !!!!";
    }

    @GetMapping("/devtools")
    public String devtoolCheck() {
        return " Test Okay !";
    }

    @GetMapping("/control")
    public void control() {
    }
}

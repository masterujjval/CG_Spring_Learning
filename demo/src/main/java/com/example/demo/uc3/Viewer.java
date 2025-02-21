package com.example.demo.uc3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Viewer {

    @GetMapping("/")
    public String hello(){
        return "Hello from bridgelab again";
    }

}

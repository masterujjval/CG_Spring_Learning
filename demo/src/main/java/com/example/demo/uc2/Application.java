package com.example.demo.uc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Controller
class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello"; // Will return hello.html from templates folder
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message", "The is done using html and modal");
        return "message"; // Will return message.html from templates folder
    }
}

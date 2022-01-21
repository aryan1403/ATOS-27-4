package com.example.springbootdemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class meowC {

    // GET
    // POST
    // PUT
    // UPDATE
    // DELETE
    @GetMapping("/hello")
    public String hello() {
        return "Hello Meow";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home";
    }
}

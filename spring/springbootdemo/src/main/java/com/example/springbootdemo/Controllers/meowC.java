package com.example.springbootdemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meow")
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

    @PostMapping("/add/{a}/{b}")
    public int addit(@PathVariable int a, @PathVariable int b) {
        return (a + b);
    }

    @PostMapping("/add")
    public int add(@RequestBody addModel model) {
        return (model.getA() + model.getB());
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home";
    }
}

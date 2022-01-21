package com.example.springbootdemo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class itemcontroller {
    @GetMapping("/itemC")
    public String itemC() {
        return "I am item controller";
    }
}

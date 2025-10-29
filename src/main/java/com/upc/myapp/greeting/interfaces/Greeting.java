package com.upc.myapp.greeting.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/greetings")
public class Greeting {

    @GetMapping
    public String greeting(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}

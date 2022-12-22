package com.tutorialworks.hellojavaspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJavaRestController {

    @GetMapping("/index")
    public String getFavouriteCheese() {
        return "Hello World";
    }
}

package com.zeTsu.springsecuritybasic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String SayWelcome(){
        return "Welcome from Spring Application with Security";
    }
}

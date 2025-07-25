package com.c2.security.OAUTH2SocialLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SocialLoginController {

    @GetMapping("/secure")
    public String secure(Principal principal){
        String name = principal.getName();
        return "Welcome "+name+" to secure Path";

    }

    @GetMapping("/notSecure")
    public String notSecure(){
        //String name = principal.getName();
        return "Welcome Chandan to not secure Path";

    }
}

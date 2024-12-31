package com.durgesh.SpringSecurityTelusco;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest res) {
        return "welcome guys " + res.getSession().getId();
    }

}

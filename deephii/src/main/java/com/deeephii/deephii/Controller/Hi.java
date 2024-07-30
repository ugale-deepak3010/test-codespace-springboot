package com.deeephii.deephii.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Hi {

    @GetMapping
    public String getHello() {
        return "Hello Deepak";
    }
    
    

}

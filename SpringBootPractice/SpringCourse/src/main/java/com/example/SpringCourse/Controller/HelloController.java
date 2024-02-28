package com.example.SpringCourse.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Controller
@RestController
public class HelloController {

    @Value("${Welcome.message}")
    private String message;

    @GetMapping("/")
    public String helloWorld(){
        return message;
    }
}

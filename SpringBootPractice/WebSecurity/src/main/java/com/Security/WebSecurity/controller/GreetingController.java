package com.Security.WebSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from My API");
    }

    @GetMapping("/goodBye")
    public ResponseEntity<String> sayGoodBye(){
        return ResponseEntity.ok("Good bye and see you later");
    }
}

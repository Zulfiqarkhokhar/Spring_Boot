package com.example.sendmail.emailController;

import com.example.sendmail.emailService.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }

    @PostMapping("/email")
    public String sendEmail(@RequestParam String to, String cc, String subject, String body) {
        return emailService.sendEmail(to, cc, subject, body);
    }
}

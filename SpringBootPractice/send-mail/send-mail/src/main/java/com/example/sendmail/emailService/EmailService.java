package com.example.sendmail.emailService;


import org.springframework.web.multipart.MultipartFile;


public interface EmailService {
    String sendEmail(String to, String cc, String subject, String body);
}

package com.example.sendmail.emailService.impl;

import com.example.sendmail.emailService.EmailService;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.username}")
    private String fromMail;

    @Autowired
    private JavaMailSender mailSender;


    @Override
    public String sendEmail( String to, String cc, String subject, String body) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);

            mimeMessageHelper.setFrom(fromMail);
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setCc(cc);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(body);

//            for(int i=0; i<file.length; i++) {
//                mimeMessageHelper.addAttachment(file[i].getOriginalFilename(), new ByteArrayResource(file[i].getBytes()));
//            }
            mailSender.send(message);
            System.out.println(message.getContent());
            System.out.println(message.getFrom());
            return "mail sent";
        }
        catch (Exception e  ){
            throw  new RuntimeException(e);        }
    }
}

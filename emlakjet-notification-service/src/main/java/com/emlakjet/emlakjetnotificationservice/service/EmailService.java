package com.emlakjet.emlakjetnotificationservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendMail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("emlakjet@gmail.com");
        message.setTo(email);
        message.setSubject("Emlakjet");
        message.setText("Emlakjet text.");
        mailSender.send(message);
    }

}

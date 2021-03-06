package com.emlakjet.emlakjetnotificationservice.service;


import com.emlakjet.emlakjetnotificationservice.dao.EmailRepository;
import com.emlakjet.emlakjetnotificationservice.model.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ActiveMqService {
    private final EmailService emailService;
    private final EmailRepository emailRepository;

    @JmsListener(destination = "emlakjet.queue")
    public void consume(String email) {
        emailService.sendMail(email);

        saveEmail(email);
        System.out.println("Received Message: " + email);
    }

    public void saveEmail(String email){
        Email email1 = new Email();
        email1.setReceiverEmail(email);
        email1.setSenderEmail("emlakk.hepsii@gmail.com");
        emailRepository.save(email1);
    }

}

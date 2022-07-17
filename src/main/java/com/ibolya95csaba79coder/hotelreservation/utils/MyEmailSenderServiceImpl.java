package com.ibolya95csaba79coder.hotelreservation.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service("email")
public class MyEmailSenderServiceImpl implements MyEmailSenderService {
    private final JavaMailSender mailSender;

    @Autowired
    public MyEmailSenderServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Secured("ROLE_ADMIN")
    public boolean sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("spring.mail.address.sender");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
        return true;
    }
}

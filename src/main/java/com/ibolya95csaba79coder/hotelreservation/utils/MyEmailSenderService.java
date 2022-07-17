package com.ibolya95csaba79coder.hotelreservation.utils;

import org.springframework.stereotype.Service;

@Service
public interface MyEmailSenderService {

    boolean sendEmail(String toEmail, String subject, String body);
}
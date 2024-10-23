package com.emailSMTP.sachin.Controller;







import com.emailSMTP.sachin.Service.EmailService;
import com.emailSMTP.sachin.model.EmailRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class EmailController {

    @Autowired
    private EmailService emailservice;

    // Sending a simple email
    @PostMapping("/sendMail")
    public String sendSimpleMail(@RequestBody EmailRequest details) {
        return emailservice.sendSimpleMail(details);
    }

    // Sending an email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailRequest details) {
        return emailservice.sendMailWithAttachment(details);
    }
}

package com.emailSMTP.sachin.Service;





import com.emailSMTP.sachin.model.EmailRequest;

public interface EmailService {
    // Send a simple email without attachments
    String sendSimpleMail(EmailRequest details);

    // Send an email with an attachment
    String sendMailWithAttachment(EmailRequest details);
}

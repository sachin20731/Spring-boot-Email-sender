package com.emailSMTP.sachin.model;







import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}

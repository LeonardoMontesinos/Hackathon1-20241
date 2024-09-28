package dbp.hackathon.Events;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.context.Context;


import java.util.Map;

@Service
public class EmailService {

    private final JavaMailSender EmailSender;
    private SpringTemplateEngine templateEngine;

    @Autowired
    public EmailService(JavaMailSender emailSender, SpringTemplateEngine templateEngine){
        this.EmailSender=emailSender;
        this.templateEngine=templateEngine;
    }
    public void sendHtml(String to, String subject, Map<String,Object> templateData) throws MessagingException{
        MimeMessage mimeMessage = EmailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        Context context = new Context();
        context.setVariables(templateData);
        String htmlContent = templateEngine.process("emailTemplate",context);

        helper.setText(htmlContent,true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setFrom("valentina.alvarez@utec.edu.pe");

        EmailSender.send(mimeMessage);


    }



}

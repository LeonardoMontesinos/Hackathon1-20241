package dbp.hackathon.Events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;

@Service
public class EmailService {

    private final JavaMailSender EmailSender;

    public EmailService(JavaMailSender mailSender) {
        this.EmailSender = mailSender;
    }


    public void sendMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        EmailSender.send(message);
    }

}

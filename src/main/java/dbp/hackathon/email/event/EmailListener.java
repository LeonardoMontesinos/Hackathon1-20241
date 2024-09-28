package dbp.hackathon.email.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

import dbp.hackathon.email.domain.EmailService;

public class EmailListener {
    @Autowired
    private EmailService emailService;

    @EventListener
    @Async
    public void handleEmailEvent(EmailEvent emailEvent) {
        emailService.sendEmail(emailEvent.getEmail(), emailEvent.getContent(), emailEvent.getSubject());
    }
}

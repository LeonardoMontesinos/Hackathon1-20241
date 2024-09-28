package dbp.hackathon.Events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EmailSending {
    @Autowired

    private ApplicationEventPublisher applicationEventPublisher;
    public void sendEmail(String email){
        applicationEventPublisher.publishEvent(new HelloEmailEvent(email));
    }
}

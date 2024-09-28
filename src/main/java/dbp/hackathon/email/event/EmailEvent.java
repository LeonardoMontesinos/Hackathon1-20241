package dbp.hackathon.email.event;
import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailEvent extends ApplicationEvent {
    private final String email;

    private final String content;

    private final String subject;

    public EmailEvent(Object source, String email, String content, String subject) {
        super(source);
        this.email = email;
        this.content = content;
        this.subject = subject;
    }
}
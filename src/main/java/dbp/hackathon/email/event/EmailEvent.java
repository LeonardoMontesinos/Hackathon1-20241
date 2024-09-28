package dbp.hackathon.email.event;
import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailEvent extends ApplicationEvent {
    private String email;

    public EmailEvent(Object source, String email) {
        super(source);
        this.email = email;
    }
}

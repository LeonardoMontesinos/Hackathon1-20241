package dbp.hackathon.Events;

import org.springframework.context.ApplicationEvent;

public class HelloEmailEvent  extends ApplicationEvent {

    private final String email;

    public HelloEmailEvent(String email) {
        super(email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

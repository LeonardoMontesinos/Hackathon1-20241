package dbp.hackathon.email.event;

public class EmailListener {
    public void onEmailReceived(EmailEvent emailEvent) {
        System.out.println("Email received: " + emailEvent.getEmail());
    }

    public void onEmailSent(EmailEvent emailEvent) {
        System.out.println("Email sent: " + emailEvent.getEmail());
    }

    public void onEmailDeleted(EmailEvent emailEvent) {
        System.out.println("Email deleted: " + emailEvent.getEmail());
    }

    public void onEmailRead(EmailEvent emailEvent) {
        System.out.println("Email read: " + emailEvent.getEmail());
    }

    public void onEmailUnread(EmailEvent emailEvent) {
        System.out.println("Email unread: " + emailEvent.getEmail());
    }
}

package dbp.hackathon.Events;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmailListener {
    @Autowired
    private EmailService emailService;

    @EventListener
    @Async
    public void handleHelloEmailEvent(HelloEmailEvent event){
        try{
            Map<String, Object> templateData = new HashMap<>();
            templateData.put("nombre", "Juan Perez");
            templateData.put("nombrePelicula", "El");
            templateData.put("fecha", "septiembre");
            templateData.put("Cantidad de entradas", 3);
            templateData.put("precio total", "30");
            templateData.put("qr", " " );

            emailService.sendHtml(event.getEmail(), "Gracias por tu compra!", templateData);

        }  catch (MessagingException e){
            e.printStackTrace();
        }
    }
}

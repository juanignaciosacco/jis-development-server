package com.jisdevelopment.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jisdevelopment.server.models.MailBody;
import com.jisdevelopment.server.services.EmailService;

@RestController
@CrossOrigin(origins = "*")
public class MailController {
    

    @Autowired
    private EmailService emailService;

    @PostMapping("/contacto")
    public String sendMail(@RequestBody MailBody mail) {

        String message = "<b>Datos de contacto: </b>" + "<br/><br/><br/>" + "<b>Nombre: </b>" + mail.getNombre() + "<br/>" + "<b>Apellido: </b>" + mail.getApellido() + "<br/>" + "<b>E-mail: </b>" + mail.getEmailUsuario() + "<hr/><br/>" + "<b>Mensaje: </b><br/>" + mail.getMensaje();

        emailService.sendListEmail(mail.getAsunto(), message, mail.getEmailUsuario());

        return "Correo enviado";
    }
    
}

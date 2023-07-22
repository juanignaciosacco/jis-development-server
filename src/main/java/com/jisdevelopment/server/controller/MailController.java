package com.jisdevelopment.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jisdevelopment.server.models.MailBody;
import com.jisdevelopment.server.services.EmailService;

@RestController
public class MailController {
    

    @Autowired
    private EmailService emailService;
    
    @PostMapping("/contacto")
    public String sendMail(@RequestBody MailBody mail) {

        String message = "<b>Datos de contacto: </b>" + "<br/><br/><br/>" + "<b>Nombre: </b>" + mail.getNombre() + "<br/><hr/>" + "<b>Apellido: </b>" + mail.getApellido() + "<br/><hr/>" + "<b>E-mail: </b>" + mail.getEmailUsuario() + "<br/><hr/>" + "<b>Mensaje: </b>" + mail.getMensaje();

        emailService.sendListEmail(mail.getAsunto(), message, mail.getEmailUsuario());

        return "Correo enviado";
    }
    
}

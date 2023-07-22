package com.jisdevelopment.server.models;

public class MailBody {
    
    private String nombre;
    private String apellido;
    private String emailUsuario;
    private String asunto;
    private String mensaje;

    public MailBody() {
    }

    public MailBody(String nombre, String apellido, String emailUsuario, String asunto, String mensaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.emailUsuario = emailUsuario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getEmailUsuario() {
        return emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    
    public String getAsunto() {
        return asunto;
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

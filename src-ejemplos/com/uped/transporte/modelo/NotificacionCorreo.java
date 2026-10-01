package com.uped.transporte.modelo;


public class NotificacionCorreo extends Notificacion {
    private String smtpServidor;

    public NotificacionCorreo(String destinatario, String mensaje, String smtpServidor) {
        super(destinatario, mensaje);
        this.smtpServidor = smtpServidor;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando CORREO a " + destinatario + " usando servidor " + smtpServidor);
        System.out.println("Contenido: " + mensaje);
    }
}

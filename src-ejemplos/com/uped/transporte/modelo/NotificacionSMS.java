package com.uped.transporte.modelo;

public class NotificacionSMS extends Notificacion {
    private int codigoOperador;

    public NotificacionSMS(String destinatario, String mensaje, int codigoOperador) {
        super(destinatario, mensaje);
        this.codigoOperador = codigoOperador;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS al número " + destinatario + " (Operador ID: " + codigoOperador + ")");
        System.out.println("Mensaje: " + mensaje);
    }
}
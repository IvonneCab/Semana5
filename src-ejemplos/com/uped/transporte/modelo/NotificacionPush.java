package com.uped.transporte.modelo;



public class NotificacionPush extends Notificacion {
    private String tokenDispositivo;

    public NotificacionPush(String destinatario, String mensaje, String tokenDispositivo) {
        super(destinatario, mensaje);
        this.tokenDispositivo = tokenDispositivo;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando PUSH a dispositivo con token " + tokenDispositivo + " de usuario " + destinatario);
        System.out.println("Alerta: " + mensaje);
    }
}

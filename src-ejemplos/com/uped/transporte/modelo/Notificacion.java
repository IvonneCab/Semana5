package com.uped.transporte.modelo;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    // Método abstracto: cada subclase define su propia lógica de envío
    public abstract void enviarMensaje();

    // Método concreto y final: el registro o historial se maneja igual para todas
    public final void registrarHistorial() {
        System.out.println("[HISTORIAL] Notificación enviada a: " + destinatario);
    }
}

package com.uped.transporte;

import com.uped.transporte.modelo.Notificacion;
import com.uped.transporte.modelo.NotificacionCorreo;
import com.uped.transporte.modelo.NotificacionSMS;
import com.uped.transporte.modelo.NotificacionPush;

public class MainNotificaciones {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionCorreo("ana@mail.com", "Bienvenida a la plataforma", "smtp.uped.edu");
        Notificacion n2 = new NotificacionSMS("+50370001122", "Tu código de verificación es 4589", 503);
        Notificacion n3 = new NotificacionPush("Carlos123", "Tienes un nuevo mensaje directo", "token_xyz_987");

        n1.enviarMensaje();
        n1.registrarHistorial();

        System.out.println("--------------------------------------------------");

        n2.enviarMensaje();
        n2.registrarHistorial();

        System.out.println("--------------------------------------------------");

        n3.enviarMensaje();
        n3.registrarHistorial();
    }
}

package Ejercicios.Ej4;

public interface Calificable {
    int puntos();

    default String nivel() {
        return puntos() >= 70 ? "APROBADO" : "REFUERZO";
    }



}



package Ejercicios.Ej4;

public class Tarea implements Calificable {
    private int nota;

    public Tarea(int nota) {
        this.nota = nota;
    }

    @Override
    public int puntos() {
        return nota; // Devuelve directamente la nota recibida
    }
}
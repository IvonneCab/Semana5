package Ejercicio.Ej4;

public class Proyecto implements Calificable {
    private int nota;

    public Proyecto(int nota) {
        this.nota = nota;
    }

    @Override
    public int puntos() {
        return nota + 10; // Suma 10 puntos a la nota recibida
    }
}
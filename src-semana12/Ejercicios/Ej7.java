package Ejercicios;

import biblioteca.Material;
import biblioteca.Prestable;

public class Ej7 extends Material implements Prestable {

    public Ej7(String titulo) {
        super(titulo);
    }

    @Override
    public int diasPrestamo() {
        return 10;
    }

    @Override
    public String prestar(String socio) {
        return titulo + " -> " + socio + " (audio)";
    }
}
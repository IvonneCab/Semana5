package Ejercicios;

import biblioteca.Material;
import biblioteca.Prestable;


public class Ej5 extends Material implements Prestable {

    public Ej5(String titulo) {
        super(titulo);
    }

    @Override
    public int diasPrestamo() {
        return 3;
    }

    @Override
    public String describir() { // Error 2 corregido: debe ser public (no reducir visibilidad)
        return "Tablet: " + titulo;
    }

    @Override
    public String prestar(String socio) { // Errores 1 y 3 corregidos: faltaba implementar y corregir tipeo de "presta" a "prestar"
        return titulo + " -> " + socio;
    }
}

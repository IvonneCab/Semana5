
package com.uped.proyecto.modelo;

public class Visitante extends Persona{

    public Visitante(String nombre, String dui) {
        super(nombre,dui);
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
    @Override
    public String toString() {
        return "Visitante{" + presentarse() + "}";
    }
}

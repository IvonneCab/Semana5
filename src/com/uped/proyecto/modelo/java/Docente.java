package com.uped.proyecto.modelo;

public class Docente extends Persona{
    private String especialidad;
    private int añosExperiencia;

    public Docente(String nombre, String dui, String especialidad, int añosExperiencia) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public double calcularBeneficioAnual() {
        return añosExperiencia * 45.0; // Bono por antigüedad
    }

}

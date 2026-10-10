package com.uped.proyecto.modelo;

public class Main {
    static void main(String[] args) {

        Empleado emp = new Empleado("Carlos Pérez", "12345678-9", 600.0);

        System.out.println("Beneficio normal (10%): $" + emp.calcularBeneficioAnual());

        System.out.println("Beneficio con extra del 5%: $" + emp.calcularBeneficioAnual(0.05));

    }

}

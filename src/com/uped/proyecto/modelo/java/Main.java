package com.uped.proyecto.modelo;




public class Main {
    static void main(String[] args) {

        System.out.println("=== PRUEBA DE UPCASTING Y BUCLE POLIMÓRFICO ===");

        Persona[] personas = {
                new Cliente("Ana", "04512378-9", "7777-1111", 4000.0),
                new Empleado("Luis", "06223344-5", 850.0),
                new Estudiante("Kevin", "03998877-1", "UPED-045", "Ing. Sistemas", 9.1),
                new Docente("Marta", "01122334-4", "Bases de Datos", 5)
        };

        for (Persona p : personas) {
            System.out.println(p.presentarse() + " -> $" + p.calcularBeneficioAnual());
        }

        System.out.println("\n=== PRUEBA EJEMPLO INTEGRADOR (VOLUNTARIO) ===");
        Voluntario v = new Voluntario("Sara Gómez", "07456123-2", 120.0);
        System.out.println(v);
        System.out.println("Beneficio: " + v.calcularBeneficioAnual());

        System.out.println("\n=== PRUEBA EJERCICIO PRÁCTICO 1 (PROVEEDOR) ===");
        Proveedor prov = new Proveedor("Comercial Ríos", "06554321-8", 8000.0);
        System.out.println(prov);
        System.out.println("Beneficio: " + prov.calcularBeneficioAnual());

    }

}

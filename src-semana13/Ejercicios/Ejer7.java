package Ejercicios;

public class Ejer7 {
    public static void main(String[] args) {
        String[] edades = { "20", "veinte", "35", "", "18" };
        int suma = 0;
        int validas = 0;

        for (String e : edades) {
            try {
                suma += Integer.parseInt(e);
                validas++;
            } catch (NumberFormatException ex) {
                System.out.println("Edad ignorada: \"" + e + "\"");
            }
        }

        try {
            System.out.println("Edad promedio: " + (suma / validas));
        } catch (ArithmeticException ex) {
            System.out.println("Sin edades validas");
        }
    }
}

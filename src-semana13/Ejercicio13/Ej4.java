package Ejercicio13;

public class Ej4 {
    static int promedio(int[] notas) {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        int[][] grupos = { {8, 6, 10}, {}, {7} };
        for (int[] g : grupos) {
            try {
                System.out.println("Promedio: " + promedio(g));
            } catch (ArithmeticException e) {
                System.out.println("Grupo sin notas");
            }
        }
    }
}

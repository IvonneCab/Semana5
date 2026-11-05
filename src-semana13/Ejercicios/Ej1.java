package Ejercicios;

public class Ej1 {
    public static void main(String[] args) {
        int[] divisores = {2, 0, 5};
        int total = 0;
        for (int d : divisores) {
            try {
                total += 20 / d;
                System.out.println("ok con " + d);
            } catch (ArithmeticException e) {
                System.out.println("fallo con " + d);
            }
            System.out.println("total = " + total);
        }
    }
}

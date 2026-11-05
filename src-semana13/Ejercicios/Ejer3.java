package Ejercicios;

public class Ejer3 {
    static int nivel3(int d) {
        System.out.println("  entra nivel3");
        return 10 / d;
    }

    static int nivel2(int d) {
        System.out.println(" entra nivel2");
        try {
            return nivel3(d);
        } catch (ArithmeticException e) {
            System.out.println(" nivel2 atrapa");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("resultado: " + nivel2(0));
        System.out.println("resultado: " + nivel2(5));
    }
}

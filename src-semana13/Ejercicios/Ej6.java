package Ejercicios;

public class Ej6 {
    static int convertir(String txt) {
        System.out.println("convirtiendo " + txt);
        return Integer.parseInt(txt);
    }

    static int dividir(String a, String b) {
        int x = convertir(a);
        int y = convertir(b);
        return x / y;
    }

    public static void main(String[] args) {
        String[][] pares = { {"8", "2"}, {"9", "0"}, {"7", "uno"} };
        for (String[] p : pares) {
            try {
                System.out.println("= " + dividir(p[0], p[1]));
            } catch (ArithmeticException e) {
                System.out.println("division entre cero");
            } catch (NumberFormatException e) {
                System.out.println("texto no numerico");
            }
        }
    }
}

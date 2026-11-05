package ejemplos;

public class Propaga {
    static int nivel3(int d) {
        System.out.println("  entra nivel3");
        int r = 10 / d;
        System.out.println("  sale nivel3");
        return r;
    }

    static int nivel2(int d) {
        System.out.println(" entra nivel2");
        int r = nivel3(d);
        System.out.println(" sale nivel2");
        return r;
    }

    public static void main(String[] args) {
        try {
            System.out.println("main llama");
            nivel2(0);
            System.out.println("main recibe resultado");
        } catch (ArithmeticException e) {
            System.out.println("main atrapa: " + e.getMessage());
        }
        System.out.println("main continua");
    }
}

package ejemplos;

public class Flujo {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            System.out.println("B");
            int x = 10 / 0;
            System.out.println("C");
        } catch (ArithmeticException e) {
            System.out.println("D");
        }
        System.out.println("E");
    }
}

package ejemplos;

public class Main {
    static int precioUnitario(int total, int cantidad) {
        return total / cantidad;
    }
    public static void main(String[] args) {
        int[][] pedidos = { {100, 4}, {90, 0}, {60, 3} };
        for (int[] p : pedidos) {
            try {
                int u = precioUnitario(p[0], p[1]);
                System.out.println("Precio unitario: $" + u);
            } catch (ArithmeticException e) {
                System.out.println("Pedido invalido: " + e.getMessage());
            }
        }
        System.out.println("Pedidos procesados");
    }
}

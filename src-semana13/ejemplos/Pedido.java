package ejemplos;

public class Pedido {
    static int precioUnitario(int total, int cantidad) {
        return total / cantidad; // Línea 3: Ocurre el error con 0
    }
    static void procesar(int total, int cantidad) {
        int p = precioUnitario(total, cantidad); // Línea 7
        System.out.println("Precio unitario: $" + p);
    }
    public static void main(String[] args) {
        procesar(100, 4);
        procesar(90, 0); // Falla aquí
        System.out.println("Pedidos procesados");
    }
}


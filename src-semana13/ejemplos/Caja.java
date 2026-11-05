package ejemplos;

public class Caja {
    static String[] productos = { "Teclado", "Mouse", "Monitor" };
    static int[] precios = { 25, 10, 150 };

    static int subtotal(int indice, String cantidadTxt) {
        int cantidad = Integer.parseInt(cantidadTxt);
        return precios[indice] * cantidad;
    }

    static int precioPromedio(int total, int articulos) {
        return total / articulos;
    }

    public static void main(String[] args) {
        int[] indices = { 0, 1, 3, 2 };
        String[] cantidades = { "2", "x", "1", "1" };
        int total = 0;
        int articulos = 0;
        for (int i = 0; i < indices.length; i++) {
            try {
                int s = subtotal(indices[i], cantidades[i]);
                total += s;
                articulos++;
                System.out.println("Linea " + (i + 1) + ": $" + s);
            } catch (NumberFormatException e) {
                System.out.println("Linea " + (i + 1)
                        + ": cantidad invalida");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Linea " + (i + 1)
                        + ": producto inexistente");
            }
        }
        System.out.println("Total: $" + total);
        try {
            System.out.println("Promedio por linea: $"
                    + precioPromedio(total, articulos));
        } catch (ArithmeticException e) {
            System.out.println("No hay lineas validas");
        }
    }
}

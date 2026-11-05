package ejemplos;

public class Carrito {

    public static void main(String[] args) {
        String[] precios = { "15", "8", "abc" };
        int[] indices = { 0, 2, 5 };
        for (int i : indices) {
            try {
                int precio = Integer.parseInt(precios[i]);
                System.out.println("Producto " + i + ": $" + precio);
            } catch (NumberFormatException e) {
                System.out.println("Precio no numerico: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No existe: " + e.getMessage());
            }
        }
    }
}

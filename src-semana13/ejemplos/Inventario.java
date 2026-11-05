package ejemplos;

public class Inventario {
    public static void main(String[] args) {
        int unidades = 12;
        int cajas = 0;
        System.out.println("Calculando...");
        int porCaja = unidades / cajas; // Aquí ocurre la excepción
        System.out.println("Por caja: " + porCaja);
        System.out.println("Fin del programa");
    }
}

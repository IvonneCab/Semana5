package Ejercicio13;

public class Ejercicio7 {
    public class Ej7 {
        public static void main(String[] args) {
            try {
                Class.forName("Habitacion");
                int n = Integer.parseInt("x");
            } catch (NumberFormatException e) {
                System.out.println("Formato");
            } catch (RuntimeException e) {
                System.out.println("En ejecucion");
            } catch (ClassNotFoundException e) {
                System.out.println("Clase no encontrada: " + e.getMessage());
            }
        }
    }

}

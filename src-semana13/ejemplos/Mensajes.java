package ejemplos;

public class Mensajes {
    public static void main(String[] args) {
        String cliente = null;
        int[] stock = new int[3];
        Object o = "texto";
        try {
            System.out.println(cliente.length());
        } catch (NullPointerException e) {
            System.out.println("1) " + e.getClass().getSimpleName());
        }
        try {
            stock[3] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2) " + e.getMessage());
        }
        try {
            Integer n = (Integer) o;
        } catch (ClassCastException e) {
            System.out.println("3) " + e.getClass().getSimpleName());
        }
        try {
            Integer.parseInt("12a");
        } catch (NumberFormatException e) {
            System.out.println("4) " + e);
        }
    }
}

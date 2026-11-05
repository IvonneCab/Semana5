package ejemplos;

public class Validar {
    public static void main(String[] args) {
        String[] entradas = { "3", "dos", "7", "" };
        int suma = 0;
        int validas = 0;
        for (String txt : entradas) {
            try {
                suma += Integer.parseInt(txt);
                validas++;
            } catch (NumberFormatException e) {
                System.out.println("Ignorada: \"" + txt + "\"");
            }
        }
        System.out.println("Validas: " + validas + ", suma: " + suma);
        System.out.println("Promedio: " + (suma / validas));
    }
}

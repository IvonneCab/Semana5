package Ejercicio.Ej4;

public class E4 {
    public static void main(String[] args) {
        // Arreglo polimórfico de la interfaz Calificable
        Calificable[] c = {
                new Tarea(65),
                new Proyecto(65),
                new Quiz()
        };

        // Bucle donde se manda a llamar puntos() y nivel() para que salga en consola
        for (Calificable x : c) {
            System.out.println(x.puntos() + " " + x.nivel());
        }
    }
}

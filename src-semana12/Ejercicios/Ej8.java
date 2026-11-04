package Ejercicios;

import biblioteca.*;

public class Ej8 {
    public static void main(String[] args) {
        Material[] m = { new EBook("K"), new Revista("R") };
        for (Material x : m) {
            System.out.println(Biblioteca.registrar(x)
                    + " | " + x.describir());
            if (x instanceof Digital) {
                System.out.println(((Digital) x).formato());
            }
        }
        Prestable p = (Prestable) m[1];
        System.out.println(p.multa(2) + Prestable.MULTA_DIARIA);
    }
}

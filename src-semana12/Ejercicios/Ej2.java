package Ejercicios;

public class Ej2 {
    static String ver(int x) {
        return "int";
    }
    static String ver(double x) {
        return "double";
    }
    static String ver(Object x) {
        return "Object";
    }

    public static void main(String[] args) {
        System.out.println(ver(5));         // 1. int
        System.out.println(ver(5L));        // 2. double (ampliación de primitivo long -> double)
        System.out.println(ver('a'));       // 3. int (char se amplía a int)
        System.out.println(ver("hola"));    // 4. Object (String es un Object)
        System.out.println(ver(2.5f));      // 5. double (float se amplía a double)
    }
}

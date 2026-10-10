public class MainCaja {
    public static void main(String[] args) {
        Cobrable[] cola = { new Suscripcion(3), new Entrada(4) };
        int total = 0;

        for (Cobrable c : cola) {
            System.out.println(c.recibo());
            total += c.monto();
        }

        System.out.println("Total: $" + total);
    }
}
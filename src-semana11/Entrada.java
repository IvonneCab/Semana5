public class Entrada implements Cobrable {
    private int cantidad;

    public Entrada(int cantidad) {
        this.cantidad = cantidad; // Ojo aquí: quitamos la 'e' extra de cantidade
    }

    @Override
    public int monto() {
        return cantidad * 5;
    }
}
public class Suscripcion implements Cobrable {
    private int meses;

    public Suscripcion(int meses) {
        this.meses = meses;
    }

    @Override
    public int monto() {
        return meses * 10;
    }
}

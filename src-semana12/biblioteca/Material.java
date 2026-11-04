package biblioteca;



public abstract class Material {
    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract int diasPrestamo();

    public String describir() {
        return "Material: " + titulo;
    }

    public static String tipo() {
        return "MATERIAL";
    }
}
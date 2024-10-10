public class Serie {
    String nombre;
    String genero;
    int anio;
    int duracion;

    public Serie(String genero, String nombre, int anio, int ducacion) {
        this.genero = genero;
        this.nombre = nombre;
        this.anio = anio;
        this.duracion = ducacion;
    }

    public Serie() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

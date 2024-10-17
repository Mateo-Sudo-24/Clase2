public class Pelicula {
    String titulo;
    String genero;
    String director;
    int anio;
    double duracion;

    public Pelicula(String titulo, String genero, String director, int anio, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

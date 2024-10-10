public class Cancion {
    String nombre_cancion;
    String genero;
    int anio;
    int numero_de_canciones;
    int calificacion;

    public Cancion(String nombre_cancion, String genero, int anio, int numero_de_canciones, int ventas) {
        this.nombre_cancion = nombre_cancion;
        this.genero = genero;
        this.anio = anio;
        this.numero_de_canciones = numero_de_canciones;
        this.calificacion = ventas;
    }

    public void imprimir_artista() {
        System.out.println("Nombre de la cancion: " + nombre_cancion);
        System.out.println("Genero: " + genero);
        System.out.println("Anio: " + anio);
        System.out.println("Numero de Canciones: " + numero_de_canciones);
        System.out.println("Ventas: " + calificacion);
    }

    public int canciones_escondidas() {
        return numero_de_canciones+2 ;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumero_de_canciones() {
        return numero_de_canciones;
    }

    public int getAnio() {
        return anio;
    }

    public int getCalificacion() {
        return calificacion;
    }
}

public class Cancion {
    String artista;
    String genero;
    int anio;
    int numero_de_canciones;
    int calificacion;

    public Cancion(String artista, String genero, int anio, int numero_de_canciones, int ventas) {
        this.artista = artista;
        this.genero = genero;
        this.anio = anio;
        this.numero_de_canciones = numero_de_canciones;
        this.calificacion = ventas;
    }

    public void imprimir_artista() {
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Anio: " + anio);
        System.out.println("Numero de Canciones: " + numero_de_canciones);
        System.out.println("Ventas: " + calificacion);
    }

    public int canciones_escondidas() {
        return numero_de_canciones+2 ;
    }
}

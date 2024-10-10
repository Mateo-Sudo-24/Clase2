public class Videojuegos {
    String nombre_videojuego;
    String empresa_creadora_videojuego;
    String genero_videojuego;
    int anio_creacion;
    int ventas_videojuego;

    public Videojuegos(String nombre_videojuego, String empresa_creadora_videojuego, String genero_videojuego, int anio_creacion, int ventas_videojuego) {
        this.nombre_videojuego = nombre_videojuego;
        this.empresa_creadora_videojuego = empresa_creadora_videojuego;
        this.genero_videojuego = genero_videojuego;
        this.anio_creacion = anio_creacion;
        this.ventas_videojuego = ventas_videojuego;
    }

    public void imprimir_videojuego() {
        System.out.println(nombre_videojuego);
        System.out.println(empresa_creadora_videojuego);
        System.out.println(genero_videojuego);
        System.out.println(anio_creacion);
        System.out.println(ventas_videojuego);
    }

    public String subgenero_videojuego() {
        return "Género: Acción, " + genero_videojuego;
    }

}

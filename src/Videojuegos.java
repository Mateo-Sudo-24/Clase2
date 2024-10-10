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
        System.out.println("el nombre del videojuegos es: "+nombre_videojuego);
        System.out.println("La empresa es: "+empresa_creadora_videojuego);
        System.out.println("El genero es: "+genero_videojuego);
        System.out.println("El año es :"+anio_creacion);
        System.out.println("Su numero de ventas:"+ventas_videojuego);
    }

    public String subgenero_videojuego() {
        return "Género: Acción, " + genero_videojuego;
    }

    public String getEmpresa_creadora_videojuego() {
        return empresa_creadora_videojuego;
    }

    public String getNombre_videojuego() {
        return nombre_videojuego;
    }

    public String getGenero_videojuego() {
        return genero_videojuego;
    }

    public int getAnio_creacion() {
        return anio_creacion;
    }

    public int getVentas_videojuego() {
        return ventas_videojuego;
    }
}

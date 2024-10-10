public class Auto {
    String modelo;
    String marca;
    int anio_creacion;
    boolean estado;

    public Auto(String modelo, String marca, int anio_creacion, boolean estado) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio_creacion = anio_creacion;
        this.estado = estado;
    }

    public Auto() {
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEstado() {
        return estado;
    }
}

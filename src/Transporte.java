public class Transporte {
    String tipo_de_trasnporte;
    String nombre_coperativa;
    double pasaje;
    int numero_de_ejers;
    boolean articulado;

    public Transporte(String tipo_de_trasnporte, String nombre_coperativa, double pasaje, int numero_de_ejers, boolean articulado) {
        this.tipo_de_trasnporte = tipo_de_trasnporte;
        this.nombre_coperativa = nombre_coperativa;
        this.pasaje = pasaje;
        this.numero_de_ejers = numero_de_ejers;
        this.articulado = articulado;
    }

    public Transporte() {
    }

    public String getTipo_de_trasnporte() {
        return tipo_de_trasnporte;
    }

    public void setTipo_de_trasnporte(String tipo_de_trasnporte) {
        this.tipo_de_trasnporte = tipo_de_trasnporte;
    }

    public boolean isArticulado() {
        return articulado;
    }

    public void setArticulado(boolean articulado) {
        this.articulado = articulado;
    }
}

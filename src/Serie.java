public class Serie {
    String nombreSerie;
    String generoSerie;
    int anio;
    int duracion;

    public Serie(String nombreSerie, String generoSerie, int anio, int duracion) {
        this.nombreSerie = nombreSerie;
        this.generoSerie = generoSerie;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Serie() {
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public int getAnio() {
        return anio;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

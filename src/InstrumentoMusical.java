public class InstrumentoMusical {
    String nombre;
    boolean estado;
    boolean electrico;
    boolean cuerdas;
    boolean acustico;

    public InstrumentoMusical(String nombre, boolean estado, boolean electrico, boolean cuerdas, boolean acustico) {
        this.nombre = nombre;
        this.estado = estado;
        this.electrico = electrico;
        this.cuerdas = cuerdas;
        this.acustico = acustico;
    }

    public InstrumentoMusical() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAcustico() {
        return acustico;
    }

    public void setAcustico(boolean acustico) {
        this.acustico = acustico;
    }
}

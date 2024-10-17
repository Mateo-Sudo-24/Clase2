public class Materia {
    String nombreMateria;
    String descripcionMateria;
    int idMateria;
    String aula;
    boolean laboratorio;

    public Materia(String nombreMateria, String descripcionMateria, int idMateria, String aula, boolean laboratorio) {
        this.nombreMateria = nombreMateria;
        this.descripcionMateria = descripcionMateria;
        this.idMateria = idMateria;
        this.aula = aula;
        this.laboratorio = laboratorio;
    }

    public Materia() {

    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public boolean isLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }
}

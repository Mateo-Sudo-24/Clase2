public class Persona {
    String nombre;
    String apellido;
    int edad;
    boolean estudia;

    public Persona(String nombre, String apellido, int edad, boolean estudia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estudia = estudia;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isEstudia() {
        return estudia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudia(boolean estudia) {
        this.estudia = estudia;
    }
}
public class Persona {
    String nombre;
    String apellido;
    int edad;
    boolean sexo;

    public Persona(String nombre, String apellido, int edad, boolean sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}

public class Libro {
    // Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //Metodos
    //Siempre debe tener el metodo constructor
     //Constructor

    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public void imprimir() {
        System.out.println("El titulo es: "+this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("La editorial es: "+this.editorial);
        System.out.println("Tiene un numero de paginas: "+this.paginas);
        System.out.println("-------------");
    }

    public int imprimircubierta() {
        return this.paginas+5;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

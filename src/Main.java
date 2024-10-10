//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // display output
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1 = new Libro("El Resplandor", "Stephen King", "De Bolsillo", 600);
        Libro libro2 = new Libro("El mago de oz", "L.Frank Baum", "Alianza Editorial", 256);
        Libro libro3 = new Libro("El Señor de los anillos", "J.J.K Tolkien", "HarperCollins", 1392);
        Libro libro4 = new Libro("El Hobbit", "J.J.K Tolkein", "Minotauro", 288);
        Libro libro5 = new Libro("Las aventuras de Tom Bombaldi", "J.J.K Tolkien", "Minotaruro", 160);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());

        Cancion cancion1 = new Cancion("Master of puppets", "Trash metal", 1987, 7, 1000000);
        Cancion cancion2 = new Cancion("The emptness machine", "Nu Metal", 2024, 8, 10000000);


        cancion1.imprimir_artista();
        System.out.println(cancion1.canciones_escondidas());
        cancion2.imprimir_artista();
        System.out.println(cancion2.canciones_escondidas());



        Videojuegos vid1 = new Videojuegos("GTA 5", "Rockstar", "Aventura", 2015, 100000000);
        Videojuegos vid2 = new Videojuegos("Valorant", "Riot Games", "Aventura", 2021, 80000000);


        vid1.imprimir_videojuego();
        System.out.println(vid1.subgenero_videojuego());
        vid2.imprimir_videojuego();
        System.out.println(vid2.subgenero_videojuego());


        System.out.println(cancion1.getNombre_cancion());
        System.out.println(cancion1.getGenero());
        cancion1.setNombre_cancion("Battery");
        System.out.println(cancion1.getNombre_cancion());
        System.out.println(cancion2.getNombre_cancion());
        System.out.println(cancion2.getGenero());

        Cancion cancion6=new Cancion();
        cancion6.setNombre_cancion("Vanishing");
        System.out.println(cancion6.getNombre_cancion());



    }

}
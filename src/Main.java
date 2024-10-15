public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // display output
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1 = new Libro("El Resplandor", "Stephen King", "De Bolsillo", 600);
        Libro libro2 = new Libro("El mago de Oz", "L.Frank Baum", "Alianza Editorial", 256);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getAutor());

        Cancion cancion1 = new Cancion("Master of puppets", "Trash metal", 1987, 7, 1000000);
        Cancion cancion2 = new Cancion("The emptiness machine", "Nu Metal", 2024, 8, 10000000);

        cancion1.imprimir_artista();
        System.out.println(cancion1.canciones_escondidas());
        cancion2.imprimir_artista();
        System.out.println(cancion2.canciones_escondidas());
        System.out.println(cancion1.getNombre_cancion());
        System.out.println(cancion1.getGenero());
        System.out.println(cancion2.getNombre_cancion());
        System.out.println(cancion2.getGenero());

        Videojuegos vid1 = new Videojuegos("GTA 5", "Rockstar", "Aventura", 2015, 100000000);
        Videojuegos vid2 = new Videojuegos("Valorant", "Riot Games", "Aventura", 2021, 80000000);


        vid1.imprimir_videojuego();
        System.out.println(vid1.subgenero_videojuego());
        vid2.imprimir_videojuego();
        System.out.println(vid2.subgenero_videojuego());
        System.out.println(vid1.getNombre_videojuego());
        System.out.println(vid1.getEmpresa_creadora_videojuego());
        System.out.println(vid2.getNombre_videojuego());
        System.out.println(vid2.getEmpresa_creadora_videojuego());

        Persona persona1=new Persona("Mateo","Paredes",23,true);
        Persona persona2=new Persona("Juan","Perez",25,false);

        System.out.println("El nombre es:"+persona1.getNombre());
        System.out.println("El apellido es: "+persona1.getApellido());
        System.out.println("Usted paso la materia: "+persona1.isEstudia());

        System.out.println("El nombre es: "+persona2.getNombre());
        System.out.println("El apellido es: "+persona2.getApellido());
        System.out.println("Usted paso la materia: "+persona2.isEstudia());

        Serie ser1=new Serie("Friends","Comedia",1994,2004);
        Serie ser2=new Serie("The Big Bang Theroy","Comedia",2006,2018);

        System.out.println("El nombre de la serie es: "+ser1.getNombreSerie());
        System.out.println("El año de la serie es: "+ser1.getAnio());

        System.out.println("El nombre de la serie es: "+ser2.getNombreSerie());
        System.out.println("El año de la serie es: "+ser2.getAnio());

        Auto au1 = new Auto("E-320", "Mercedes", 2002, true);
        Auto au2=new Auto("M4","BMW",2020,false);

        System.out.println("El modelo del auto es: "+au1.getModelo());
        System.out.println("El auto esta en buenas condiciones"+au1.isEstado());
        System.out.println("El modelo del auto es: "+au2.getModelo());
        System.out.println("El auto esta en buenas condiciones"+au2.isEstado());






        System.out.println("---Agreagados---");
        Libro libro3= new Libro();
        libro3.setTitulo("El Señor de los anillos");
        System.out.println(libro3.getTitulo());
        libro3.setAutor("De Bolsillo");
        System.out.println(libro3.getAutor());

        Cancion cancion3=new Cancion();
        cancion3.setNombre_cancion("Vanishing");
        System.out.println(cancion3.getNombre_cancion());
        cancion3.setGenero("Death Metal");
        System.out.println(cancion3.getGenero());

        Videojuegos vid3=new Videojuegos();
        vid3.setNombre_videojuego("League Of Legends");
        System.out.println(vid3.getNombre_videojuego());
        vid3.setEmpresa_creadora_videojuego("Riot Games");
        System.out.println(vid3.getEmpresa_creadora_videojuego());

        Persona persona3=new Persona();
        persona3.setNombre("Arnold");
        System.out.println(persona3.getNombre());
        persona3.setEstudia(true);
        System.out.println("Usted paso la materia? " + persona3.isEstudia());

        Serie ser3=new Serie();
        ser3.setNombreSerie("Game of Thrones");
        System.out.println(ser3.getNombreSerie());
        ser3.setAnio(2011);
        System.out.println("El año de creacion de la serie es: "+ser3.getAnio());

        Auto au3=new Auto();
        au3.setModelo("Supra");
        System.out.println(au3.getModelo());
        au3.setEstado(true);
        System.out.println("El auto esta en buen estado"+au3.isEstado());




    }

}
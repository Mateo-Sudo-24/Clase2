

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

        Transporte t1 = new Transporte("Bus", "Condorvall", 0.52, 2, false);
        Transporte t2 = new Transporte("Metro de quito", "Metro", 0.45, 0, true);

        System.out.println("El trasnporte es de tipo" + t1.getTipo_de_trasnporte());
        System.out.println("El trasnporte es articulado" + t1.isArticulado());
        System.out.println("El trasnporte es de tipo" + t2.getTipo_de_trasnporte());
        System.out.println("El trasnporte es de tipo" + t2.isArticulado());

        Materia m1 = new Materia("Programacion", "Programacion orientada a objetos", 522, "laboratorio", true);
        Materia m2 = new Materia("Fisica", "Electromagnetismo", 155, "Magistral", false);

        System.out.println("La materia es; " + m1.getNombreMateria());
        System.out.println("La materia es en un laboratorio " + m2.isLaboratorio());
        System.out.println("La materia es " + m2.getNombreMateria());
        System.out.println("La materia es wn un laboratorio" + m2.isLaboratorio());

        Zapato z1 = new Zapato("Zapatilla", "Adidas", "Botin", "rojas", 41);
        Zapato z2 = new Zapato("Moacasin", "Venus", "Formal", "Negro", 39);

        System.out.println("El modelo del zapato es; " + z1.getModelo());
        System.out.println("La marca del zapato es; " + z2.getMarca());
        System.out.println("El modelo del zapato es; " + z2.getMarca());
        System.out.println("La marca del zapato es; " + z2.getMarca());

        InstrumentoMusical im1 = new InstrumentoMusical("Piano", true, false, true, false);
        InstrumentoMusical im2 = new InstrumentoMusical("Guitarra", true, false, true, true);

        System.out.println("El instrumento es; " + im1.getNombre());
        System.out.println("El insttrumento es acustico; " + im1.isAcustico());
        System.out.println("El instrumento es; " + im2.getNombre());
        System.out.println("El instrumento es acustico; " + im2.isAcustico());

        Pelicula pl1 = new Pelicula("Avengers", "Accion", "Rusos,Bros", 2019, 2.30);
        Pelicula pl2 = new Pelicula("Forest Gump", "Drama", "Robert Zemeskis", 1994, 2.22);

        System.out.println("El nombre de la pelicula es; " + pl1.getTitulo());
        System.out.println("El genero de la pelicula es;" + pl1.getGenero());
        System.out.println("El nombre de la pelicula es;" + pl2.getTitulo());
        System.out.println("El genero de la pelicula es;" + pl2.getGenero());


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

        Transporte t3 = new Transporte();
        t3.setTipo_de_trasnporte("Articulado");
        System.out.println(t3.getTipo_de_trasnporte());
        t3.setArticulado(true);
        System.out.println("El transporte es articulado " + t3.isArticulado());

        Materia m3 = new Materia();
        m3.setNombreMateria("Quimica");
        System.out.println("La materia es; " + m3.getNombreMateria());
        m3.setLaboratorio(true);
        System.out.println("La materia es en laboratorio: " + m3.isLaboratorio());

        Zapato z3 = new Zapato();
        z3.setModelo("Tacon");
        System.out.println(z3.getModelo());
        z3.setTalla(38);
        System.out.println("La talla del tacon es: " + z3.getTalla());

        InstrumentoMusical im3 = new InstrumentoMusical();
        im3.setNombre("Saxofon");
        System.out.println(im3.getNombre());
        im3.setAcustico(false);
        System.out.println("El instrumento es acustico " + im3.isAcustico());

        Pelicula pl3 = new Pelicula();
        pl3.setTitulo("Supercool");
        System.out.println("El nombre de la pelicula es; " + pl3.getTitulo());
        pl3.setGenero("Comedia");
        System.out.println("El genero de la pelicula es;" + pl3.getGenero());










    }

}
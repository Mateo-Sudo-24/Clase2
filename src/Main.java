//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // display output
        //para declarar el objeto
        //para instanciar una clase
        Libro libro1=new Libro("El Resplandor","Stephen King","De Bolsillo",600);
        Libro libro2=new Libro("El mago de oz","L.Frank Baum","Alianza Editorial",256);
        Libro libro3=new Libro("El Señor de los anillos","J.J.K Tolkien","HarperCollins",1392);
        Libro libro4=new Libro("El Hobbit","J.J.K Tolkein","Minotauro",288);
        Libro libro5=new Libro("Las aventuras de Tom Bombaldi","J.J.K Tolkien","Minotaruro",160);

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

    }
}
package boletin7;

/**
 *
 * @author fdacostamillos
 */
public class Boletin7 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Algo","Prueba",3,0);
        libro1.prestamo();
        System.out.println("Libros disponibles: "+libro1.getNlibros());
        System.out.println("Libros prestados: "+libro1.getNprestados());
        libro1.devolucion();
        System.out.println("Libros disponibles: "+libro1.getNlibros());
        System.out.println("Libros prestados: "+libro1.getNprestados());
    }
    
}

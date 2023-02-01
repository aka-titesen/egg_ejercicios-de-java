package Servicio;

import java.util.Scanner;
import Clase.Libro;

public class ServicioDeLibro {

    public Libro crearLibro() {
        Libro l1 = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el título del libro:");
        l1.setTitulo(leer.next());
        System.out.print("Ingrese el autor del libro:");
        l1.setAutor(leer.next());
        System.out.print("Ingrese el número total de páginas del libro:");
        l1.setPaginasTotales(leer.nextInt());
        System.out.print("Ingrese el código ISBN del libro:");
        l1.setIsbn(leer.nextInt());
        return l1;
    }

    public static void mostarElLibro(Libro l1) {
        System.out.println("========= Información del libro =========");
        System.out.println("El título es: " + l1.getTitulo());
        System.out.println("El autor es: " + l1.getAutor());
        System.out.println("El número de páginas total es: " + l1.getPaginasTotales());
        System.out.println("El código ISB es: " + l1.getIsbn());
    }

}

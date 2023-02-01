package ejercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // Declaro e inicializo una collection de tipo ArrayList  
        List<String> razas = new ArrayList<>();
        //Variables que usaré en el bucle
        boolean bandera = true;
        String pregunta = "";
        //Bucle while en el cual se iterará
        while (bandera) {
            System.out.println("¿Desea agregar una raza de perro?:");
            System.out.print("Ingrese s/n:");
            pregunta = leer.next().toLowerCase();
            switch (pregunta) {
                case "s":
                    System.out.println("Ingrese una raza de perro");
                    razas.add(leer.next());
                    break;
                case "n":
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        System.out.println("");
        if (razas.size() == 0) {
            System.out.println("Ninguna raza ha sido guardada");
        } else {
            System.out.println("=== La lista actual es la siguiente ===");
            for (String raza : razas) {
                System.out.println("> " + raza);
            }
        }

        //Sección de código donde le pregunto al usuario si quiere eliminar una mascota
        System.out.println("");
        //Declaro e inicializado el objeto iterator que devolverá la lista con el método iterator que nos permitirá iterar en la lista
        Iterator it = razas.iterator();
        String auxiliar = "";
        boolean bandera2 = true;
        while (bandera2) {
            System.out.println("¿Quieres eliminar una raza?");
            System.out.print("Ingrese s/n:");
            switch (leer.next().toUpperCase()) {
                case "S":
                    System.out.print("Ingrese la raza que quiere eliminar:");
                    auxiliar = leer.next();
                    while (it.hasNext()) {
                        if (it.next().equals(auxiliar)) {
                            it.remove();
                        }
                    }
                    break;
                case "N":
                    bandera2 = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        //Ordeno la la lista
        Collections.sort(razas);
        System.out.println("=== La lista actual ordenada es la siguiente ===");
        for (String raza : razas) {
            System.out.println("> " + raza);
        }

    }

}

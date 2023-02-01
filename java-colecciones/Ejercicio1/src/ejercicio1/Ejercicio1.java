package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

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
            for (String raza : razas) {
                System.out.println("> " + raza);
            }
        }
    }

}

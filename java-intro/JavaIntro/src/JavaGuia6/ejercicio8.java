package JavaGuia6;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese una palabra que tenga como máximo 8 carácteres: ");
        String frase = leer.next();
        int longitud = frase.length();
        if (longitud == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}

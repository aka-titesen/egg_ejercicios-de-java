package JavaGuia6;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        String primerLetra;
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        primerLetra = frase.substring(0, 1);

        if (primerLetra.equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}

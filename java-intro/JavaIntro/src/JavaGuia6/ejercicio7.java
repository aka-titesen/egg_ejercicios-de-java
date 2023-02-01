package JavaGuia6;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese una frase:");
        String frase = leer.nextLine();
        if (frase.equals("Eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}

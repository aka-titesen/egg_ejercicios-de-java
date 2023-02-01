package JavaGuia6;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String mayuscula;
        String minuscula;
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        mayuscula = frase.toUpperCase();
        minuscula = frase.toLowerCase();
        System.out.println("La frase es: " + frase);
        System.out.println("La frase en mayuscula es: " + mayuscula);
        System.out.println("La frase en minuscula es: " + minuscula);

    }

}

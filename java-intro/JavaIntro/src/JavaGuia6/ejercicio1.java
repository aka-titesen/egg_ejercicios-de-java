package JavaGuia6;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        int b;
        int suma;
        System.out.print("Ingrese el primer valor:");
        a = leer.nextInt();
        System.out.print("Ingrese el segundo valor:");
        b = leer.nextInt();
        suma = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
    }

}

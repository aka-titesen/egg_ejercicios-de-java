package JavaGuia6;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int doble;
        int triple;
        double raiz;
        System.out.print("Ingrese un número entero:");
        numero = leer.nextInt();
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);
        System.out.println("El número doble de " + numero + " es " + doble);
        System.out.println("El número triple de " + numero + " es " + triple);
        System.out.println("La raíz cuadrado de " + numero + " es " + raiz);
    }
}

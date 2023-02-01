/*
CONSIGNA:
18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio18Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
        }
        int suma = sumarElementos(vector);
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    public static int sumarElementos(int[] vector) {
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        return suma;
    }
}

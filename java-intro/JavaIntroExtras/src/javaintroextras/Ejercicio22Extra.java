/*
CONSIGNA:
22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos. 
 */
package javaintroextras;

import java.util.Random;

public class Ejercicio22Extra {

    public static void main(String[] args) {
        // Generamos una matriz de tamaño NxM
        int n = 5;
        int m = 4;
        int[][] matriz = new int[n][m];

        //Rellenamos la matriz con valores aleatorios
        Random aleatorio = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = aleatorio.nextInt();
            }
        }

        //Calculamos la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        //Mostramos la suma total
        System.out.println("La suma total es: " + suma);
    }

}

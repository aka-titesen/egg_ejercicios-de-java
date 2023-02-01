/*
CONSGINA:
20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector. 
 */
package javaintroextras;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio20Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        vector = rellenarVector(vector);
        escribirVector(vector);
    }

    public static void escribirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i != 0 && i != (vector.length - 1)) {
                System.out.print(+vector[i] + ", ");
            } else {
                if (i == 0) {
                    System.out.print("[" + vector[i] + ", ");
                } else {
                    System.out.print(vector[i] + "]");
                    System.out.println("");
                }
            }
        }
    }

    public static int[] rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = getRandomNumber(10, 99);
        }
        return vector;
    }

    //Función que generará un número aleatorio a partir de un rango especificado (min y max) los extremos están incluidos
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        //Si quieres excluir el límite superior, solo tienes que cambiar la línea return r.nextInt((max - min) + 1) + min; por return r.nextInt(max - min) + min;.
        return r.nextInt((max - min) + 1) + min;
    }

}

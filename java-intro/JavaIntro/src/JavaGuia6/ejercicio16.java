package JavaGuia6;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = leer.nextInt();
        //Inicializa un vector con un tamaño a traves de una función
        int[] vector = crearVector(tamanio);
        //Rellena un vector con un tamaño a traves de una función
        rellenarVector(vector);
        //Escribe el vector 
        System.out.println("========= Vector ========= ");
        escribirVector(vector);
        System.out.println("");
        System.out.println("========= Vector =========");
        //Busca un entero en el vector
        buscadorVector(vector);
    }

    public static int[] crearVector(int tamanio) {
        int[] vector = new int[tamanio];
        return vector;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9 + 1);
        }
    }

    public static void escribirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.print(vector[i]);
            } else {
                System.out.print(vector[i] + " | ");
            }

        }
    }

    public static void buscadorVector(int[] vector) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un número que desea buscar en el vector: ");
        int valorBuscar = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (valorBuscar == vector[i]) {
                System.out.println("> El número " + valorBuscar + " se encuentra en la posición " + (i + 1) + " del vector");
                contador++;
            }
        }
        System.out.println("<--- En total el número " + valorBuscar + " se encontró " + contador + " veces --->");
    }
}

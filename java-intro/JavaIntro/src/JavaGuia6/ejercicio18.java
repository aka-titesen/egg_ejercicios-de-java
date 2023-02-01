package JavaGuia6;

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño de la matriz original y la transpuesta:");
        int tamanio = leer.nextInt();
        //Defino ambas matrices
        int[][] matrizOriginal = crearMatriz(tamanio);
        int[][] matrizTranspuesta = crearMatriz(tamanio);
        //Relleno la matriz original
        rellenarMatriz(matrizOriginal);
        //Realiza la matriz transpuesta
        matrizTranspuesta(matrizOriginal, matrizTranspuesta);
        //Escribe ambas matrices
        System.out.println("========= Matriz original =========");
        escribirMatriz(matrizOriginal);
        System.out.println("========= Matriz transpuesta =========");
        escribirMatriz(matrizTranspuesta);
    }

    public static int[][] crearMatriz(int tamanio) {
        int[][] matriz = new int[tamanio][tamanio];
        return matriz;
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    public static void matrizTranspuesta(int[][] matrizOriginal, int[][] matrizTranspuesta) {
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }
    }

    public static void escribirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == matriz.length || j == matriz[i].length - 1) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + " | ");
                }
            }
            System.out.println("");
        }
    }

}

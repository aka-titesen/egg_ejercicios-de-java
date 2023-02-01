package JavaGuia6;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        //Define la matriz mágica con una función
        int[][] matrizMagica = crearMatriz();
        //Rellena/Inicializa la matriz de forma manual con números del 1 al 9
        rellenarMatriz(matrizMagica);
        //Escribe la matriz
        System.out.println("========= Matriz mágica =========");
        escribirMatriz(matrizMagica);
        System.out.println("=========  Matriz mágica =========");
        System.out.println("");
        //Comprueba si es una matriz mágica
        comprobarMatriz(matrizMagica);

    }

    public static int[][] crearMatriz() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño para la matriz:");
        int tamanio = leer.nextInt();
        int[][] matriz = new int[tamanio][tamanio];
        return matriz;
    }

    public static void rellenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese un valor para fila " + i + " y la columna " + j + " = ");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println("");
        }
    }

    public static int calDiaClasica(int[][] matriz) {
        int sumaDiaClasica = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sumaDiaClasica += matriz[i][j];
                }
            }
        }
        return sumaDiaClasica;
    }

    public static int calDiaInversa(int[][] matriz) {
        int sumaDiaInversa = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    sumaDiaInversa += matriz[i][j];
                }
            }
        }
        return sumaDiaInversa;
    }

    public static int calFila(int[][] matriz) {
        int sumaTotalFila = 0;
        int sumaFila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            sumaTotalFila += sumaFila;
            sumaFila = 0;
        }
        return sumaTotalFila;
    }

    public static int calColumna(int[][] matriz) {
        int sumaTotalColumna = 0;
        int sumaColumna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumna += matriz[j][i];
            }
            sumaTotalColumna += sumaColumna;
            sumaColumna = 0;
        }
        return sumaTotalColumna;
    }

    public static void comprobarMatriz(int[][] matriz) {
        int diagonal = calDiaClasica(matriz);
        int diagonalInversa = calDiaInversa(matriz);
        int fila = calFila(matriz);
        int columna = calColumna(matriz);
        if ((fila / matriz.length * matriz[0].length) == (columna / matriz.length * matriz[0].length) && (diagonal == diagonalInversa)) {
            System.out.println("<--- Es una matriz mágica --->");
        } else {
            System.out.println("<--- NO es una matriz mágica --->");
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

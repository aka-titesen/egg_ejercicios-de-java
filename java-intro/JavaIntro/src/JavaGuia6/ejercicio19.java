package JavaGuia6;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        System.out.println("========= Matrices 3x3 =========");
        System.out.println("");
        int[][] matrizUno = new int[3][3];
        int[][] matrizDos = new int[3][3];
        //Ingrese los valores
        System.out.println("========= Rellenando Matriz A =========");
        rellenarMatriz(matrizUno);
        System.out.println("========= Rellenando Matriz B =========");
        rellenarMatriz(matrizDos);
        //Comprueba si ambas matrices son inversas
        System.out.println("");
        System.out.println("========= Resultado =========");
        comprobarMatrizInversa(matrizUno, matrizDos);
        System.out.println("========= Resultado =========");
        System.out.println("");
    }

    public static void rellenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese un valor en la fila " + i + " columna " + j + " = ");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void comprobarMatrizInversa(int[][] matrizUno, int[][] matrizDos) {
        int contador = 0;
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                if ((matrizUno[i][j] + matrizDos[i][j]) == 0) {
                    contador++;
                }
            }
        }
        if (contador == ((matrizUno.length) * (matrizDos[0].length))) {
            System.out.println("Las matrices son inversas");
        } else {
            System.out.println("Las matrices NO son inversas");
        }
    }

}

package JavaGuia6;

public class ejercicio21 {

    public static void main(String[] args) {
        int[][] matrizMayor = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18}, {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] matrizMenor = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        comprobacionMatriz(matrizMayor, matrizMenor);

    }

    //Función para encontrar el primer valor de la matriz pequeña en la matriz grande
    public static void comprobacionMatriz(int[][] matrizMayor, int[][] matrizMenor) {
        boolean respuesta = false;
        for (int i = 0; i < matrizMayor.length; i++) {
            for (int j = 0; j < matrizMayor[i].length; j++) {
                if (matrizMenor[0][0] == matrizMayor[i][j]) {
                    if (verificarMatriz(matrizMayor, matrizMenor, i, j)) {
                        escribirMatriz(matrizMayor, matrizMenor, i, j);
                        respuesta = true;
                        break;
                    } else {
                        respuesta = false;
                        break;
                    }
                }
            }
        }
        if (respuesta) {
            System.out.println("La matriz (3x3) se encuentra en la matriz 10x10");
        } else {
            System.out.println("La matriz (3x3) NO se encuentra en la matriz 10x10");
        }
    }

    /*
    Función que recibe la posición del primer valor de la matriz menor en la matriz mayor, así sigue buscando en las demas posiciones de la
    matriz grande
     */
    public static boolean verificarMatriz(int[][] matrizMayor, int[][] matrizMenor, int a, int b) {
        boolean respuesta = false;
        int contador = 0;
        for (int i = 0; i < matrizMenor.length; i++) {
            for (int j = 0; j < matrizMenor[i].length; j++) {
                if (matrizMayor[a + i][b + j] == matrizMenor[i][j]) {
                    contador++;
                }
            }
        }
        if (contador == matrizMenor.length * matrizMenor[0].length) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }

    /*
    Función que recibe la posición del primer valor de la matriz menor en la matriz mayor, así que con eso va a imprimir las posiciones de la matriz menor a partir de la matriz mayor
     */
    public static void escribirMatriz(int[][] matrizMayor, int[][] matrizMenor, int a, int b) {
        for (int i = 0; i < matrizMenor.length; i++) {
            for (int j = 0; j < matrizMenor[i].length; j++) {
                if (i == 2 && j == 2) {
                    System.out.println((i + a) + "," + (j + b));
                } else {
                    System.out.print((i + a) + "," + (j + b) + " - ");
                }
            }
        }
    }
}

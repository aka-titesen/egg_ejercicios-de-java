package JavaGuia6;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        int vector[] = creacionVector();
        llenarVector(vector);
        escribirVector(vector);
    }

    public static int[] creacionVector() {
        int[] vector = new int[100];
        return vector;
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (i + 1);
        }
    }

    public static void escribirVector(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vector[i]);
            } else {
                System.out.print(vector[i] + " | ");
            }

        }
        System.out.println("");
    }
}

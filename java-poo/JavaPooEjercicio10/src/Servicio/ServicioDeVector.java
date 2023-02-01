package Servicio;

import Clase.Vector;

public class ServicioDeVector {

    public Vector crearVector() {
        Vector v1 = new Vector();
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        v1.setVectorA(vectorA);
        v1.setVectorB(vectorB);
        return v1;
    }

    public static double[] vectorA(Vector v1) {
        double[] vectorA = new double[50];
        System.arraycopy(v1.getVectorA(), 0, vectorA, 0, vectorA.length);
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Math.round(Math.random() * 50 + 0);
        }
        return vectorA;
    }

    public static void imprimirVector(double[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            if (i != vector1.length - 1) {
                System.out.print(vector1[i] + " | ");
            } else {
                System.out.print(vector1[i]);
            }
        }
    }

    public static double[] mayorAMenor(double[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            for (int j = i + 1; j < vector1.length; j++) {
                if (vector1[j] > vector1[i]) {
                    double anterior = vector1[i];
                    double nuevoMayor = vector1[j];
                    vector1[i] = nuevoMayor;
                    vector1[j] = anterior;
                }
            }
        }
        return vector1;
    }

    public static double[] vectorB(Vector v1) {
        double[] vectorA = new double[50];
        System.arraycopy(v1.getVectorA(), 0, vectorA, 0, vectorA.length);
        double[] vectorB = new double[20];
        for (int i = 0; i < vectorB.length; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            } else {
                vectorB[i] = 0.5;
            }
        }
        return vectorB;
    }
}

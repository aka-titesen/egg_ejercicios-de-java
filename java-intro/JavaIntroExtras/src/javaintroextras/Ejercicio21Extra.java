/*
CONSIGNA:
21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son: 
Primer trabajo práctico evaluativo 10% 
Segundo trabajo práctico evaluativo 15% 
Primer Integrador 25% 
Segundo integrador 50% 
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso. 
 */
package javaintroextras;

import java.text.DecimalFormat;
import java.util.Random;

public class Ejercicio21Extra {

    public static void main(String[] args) {
        double[] promedios = new double[10];
        double[][] notas = new double[10][4]; //Matriz para guardar las 4 notas de los 10 alumnos (10(filas) x 4(columnas))
        notas = rellenarMatriz(notas); //Relleno con las notas
        escribirMatriz(notas); //Imprimo la matriz
        promedios = calcularPromedios(notas); //Calculo el promedio de los 10 alumnos y los guardo en un vector de 10 elementos
        escribirVector(promedios); //Imprimo los promedios de los 10 alumnos
        mostrarAprobadosYDesprobados(promedios); //Analizo los promedios y cuento cuantos aprobaron y desaprobaron
    }

    public static double[] calcularPromedios(double[][] matriz) {
        double[] promedios = new double[10];
        double promedio = 0d;

        for (int i = 0; i < matriz.length; i++) {
            promedio = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                promedio += matriz[i][j];
            }
            promedio = promedio / 4;
            promedios[i] = promedio;
        }
        return promedios;
    }

    public static void mostrarAprobadosYDesprobados(double[] vector) {
        int aprobados = 0;
        int desaprobados = 0;
        for (double promedio : vector) {
            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("");
        System.out.println("--------- Cantidad de aprobados ---------");
        System.out.println("---> Aprobados: " + aprobados);
        System.out.println("--------- Cantidad de desaprobados ---------");
        System.out.println("---> Desaprobados: " + desaprobados);
    }

    public static double[][] rellenarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = getRandomNumber(0, 10);
            }
        }
        return matriz;
    }

    public static void escribirMatriz(double[][] matriz) {
        System.out.println("");
        System.out.println("--------- Comienzo de las Notas ---------");
        DecimalFormat df = new DecimalFormat("#.##");  //Lo usamos para redondear un número con el método .format()
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" |" + df.format(matriz[i][j]) + "| "
                );
            }
            System.out.println("");
        }
        System.out.println("--------- Final de las notas ---------");
    }

    public static void escribirVector(double[] vector) {
        System.out.println("");
        System.out.println("--------- Comienzo de los promedios ------");
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
        System.out.println("--------- Final de los promedios ---------");
    }

    //Función que generará un número aleatorio a partir de un rango especificado (min y max) los extremos están incluidos
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        //Si quieres excluir el límite superior, solo tienes que cambiar la línea return r.nextInt((max - min) + 1) + min; por return r.nextInt(max - min) + min;.
        return r.nextInt((max - min) + 1) + min;
    }
}

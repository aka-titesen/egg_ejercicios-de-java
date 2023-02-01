/*
CONSIGNA:
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. 
 */
package javaintroextras;

import java.text.DecimalFormat;

public class Ejercicio6Extra {

    public static void main(String[] args) {

        //Guardamos en éste vector la lista de alturas a evuluar y hacer las correspondientes operaciones
        double[] alturas = {1.70, 1.80, 1.55, 1.61, 1.58, 1.73, 1.78, 1.52, 1.77, 1.83};
        //Acumuladores para hacer los cálculos de promedio tanto para las alturas inferiores a 1.60 mts como las superiores
        int contadorPorDebajo = 0;
        int contadorPorArriba = 0;
        //Para acumular las alturas
        double sumaAltPorDebajo = 0;
        double sumaAltPorArriba = 0;

        DecimalFormat df = new DecimalFormat("#.##");  //Lo usamos para redondear un número con el método .format()

        for (int i = 0; i < alturas.length; i++) {
            double altura = alturas[i];
            if (altura < 1.60) {
                contadorPorDebajo++;
                sumaAltPorDebajo += altura;
            } else {
                contadorPorArriba++;
                sumaAltPorArriba += altura;
            }
        }
        if (alturas.length == 0) {
            System.out.println("No hay alturas para evaluar");
        } else {
            System.out.println("El promedio altura promedio por encima de 1.60 mts es " + df.format(sumaAltPorArriba / contadorPorArriba) + " mts");
            System.out.println("El promedio altura promedio por debajo de 1.60 mts es " + df.format(sumaAltPorDebajo / contadorPorDebajo) + " mts");
        }

    }

}

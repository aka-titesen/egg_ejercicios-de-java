/*
CONSIGNA:
19. Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos). 
 */
package javaintroextras;

public class Ejercicio19Extra {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean sonIguales = sonVectoresIguales(a, b);
        if (sonIguales) {
            System.out.println("Los arreglos son iguales");
        } else {
            System.out.println("Los arreglos son diferentes");
        }
    }

    public static boolean sonVectoresIguales(int[] a, int[] b) {
        //Verificamos si los vectores tienen diferente tamaño, en caso contrario devolvemos falso de antemano
        if (a.length != b.length) {
            return false;
        }
        //Iteramos a través de los elementos de ambos vectores en paralelo
        for (int i = 0; i < a.length; i++) {
            //Si encontramos algún elemento que no sea igual, devolvemos falso de antemano
            if (a[i] != b[i]) {
                return false;
            }
        }
        //Si llegamos acá, es porque todos los elementos de ambos vectores son iguales
        return true;
    }
}

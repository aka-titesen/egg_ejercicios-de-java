/*
CONSIGNA:
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio14Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese la cantidad de familias: ");
        int n = leer.nextInt(); //La cantidad de familias

        int totalHijos = 0; //La suma de los hijos de todas las familias
        int totalEdad = 0; //La suma de las edades de los hijos de todas las familias

        //Dos bucles for anidados
        //Bucle externo
        for (int i = 1; i <= n; i++) { //Iterará hasta el número total de familias establecidas en "n"
            //Establecé el número total de hijos de la familia actual
            System.out.printf("Ingrese la cantidad de hijos de la familia %d: ", i);
            int m = leer.nextInt();
            totalHijos += m; //Voy acumulando el total de hijos de todas las familias
            //Bucle interno
            for (int j = 1; j <= m; j++) {//Iterará hasta el número total de hijos de la familia actual
                //Establecé la edad de cada hijo de la familia actual
                System.out.printf("Ingrese la edad del hijo %d: ", j);
                int edad = leer.nextInt();
                totalEdad += edad; //Voy acumulando el total de edades de todas las familias
            }
        }
        double mediaEdad = (double) totalEdad / totalHijos;
        System.out.printf("La media de edad de los hijos de todas las familias es %.2f", mediaEdad);
    }

}

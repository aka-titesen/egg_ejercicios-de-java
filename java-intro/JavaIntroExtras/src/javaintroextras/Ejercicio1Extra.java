/*
CONSIGNA:
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio1Extra {

    public static void main(String[] args) {
        // Declaración de variables
        int tiempoEnMinutos;
        int dias;
        int horas;
        int minutos;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Lectura de datos
        System.out.print("Ingrese el tiempo en minutos: ");
        tiempoEnMinutos = leer.nextInt();

        // Cálculo de días, horas y minutos
        dias = tiempoEnMinutos / 1440;
        horas = (tiempoEnMinutos % 1440) / 60;
        minutos = (tiempoEnMinutos % 1440) % 60;

        // Salida de resultados
        System.out.println(tiempoEnMinutos + " minutos equivalen a " + dias + " días, " + horas + " horas y " + minutos + " minutos.");
    }
}

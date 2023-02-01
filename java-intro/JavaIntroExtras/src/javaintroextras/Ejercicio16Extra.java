/*
CONSIGNA:
16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio16Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        int edad;
        boolean continuar = true;
        String respuesta = "";
        do {
            System.out.print("Ingresa el nombre de la persona: ");
            nombre = leer.next();
            System.out.print("Ingresa la edad de la persona: ");
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }

            System.out.print("¿Quieres seguir mostrando personas? (Sí/No) ");
            respuesta = leer.next();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        } while (continuar);
    }

}

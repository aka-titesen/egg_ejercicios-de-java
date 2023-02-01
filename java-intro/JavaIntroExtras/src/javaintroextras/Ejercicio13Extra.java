/*
CONSIGNA:
13. Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
Solicitar la altura de la escalera al usuario al comenzar. 
Ejemplo: si se ingresa el número 3:  
1 
12 
123 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio13Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresar el tamaño de la escalera: ");
        int tamanhoEscalera = leer.nextInt();
        System.out.println("--- Escalera inversa ---");
        for (int i = 0; i < tamanhoEscalera; i++) {
            for (int j = 0; j < tamanhoEscalera - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--- Escalera normal ---");
        for (int i = 0; i < tamanhoEscalera; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}

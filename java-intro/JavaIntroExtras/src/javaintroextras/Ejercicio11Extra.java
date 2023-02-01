
/*
CONSIGNA:
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 
5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio11Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese un número para contar sus digitos: ");
        int numero = leer.nextInt();
        int numeroOriginal = numero;

        //Inicializamos la cantidad de dígitos en 1
        int cantidadDigitos = 1;

        //Mientras el número sea mayor o igual a 10, dividimos el número entero por 10
        //y aumentamos en 1 la cantidad de dígitos
        while (numero >= 10) {
            numero /= 10;
            cantidadDigitos++;
        }

        System.out.println("El número: " + numeroOriginal + " tiene " + cantidadDigitos + " digitos");
    }

}

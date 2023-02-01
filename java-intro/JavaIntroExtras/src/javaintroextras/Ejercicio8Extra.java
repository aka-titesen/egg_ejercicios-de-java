/*
CONSIGNA:
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio8Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero;
        int contadorNumeros = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        while (true) {
            System.out.print("Ingrese un número entero (Negativo para terminar la ejecución): ");
            numero = leer.nextInt();
            if (numero < 0) {//Si es negativo terminamos la ejecución
                break;
            }
            contadorNumeros++; //Contamos la cantidad de números ingresados
            if (numero % 5 == 0) { //Si es multiplo de 5 terminamos la ejecución
                break;
            }
            if (numero % 2 == 0) { //Contamos la pares e impares
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.println("Cantidad de números ingresados: " + contadorNumeros);
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }

}

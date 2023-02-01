/*
CONSIGNA:
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”. 
 */
package javaintroextras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("#.##");  //Lo usamos para redondear un número con el método .format()

        System.out.println("Ingrese la cantidad de números de ingreará");
        int cant = leer.nextInt();
        int i = 0; //Indice del bucle While
        double n = 0d; //Variable que se usará para guardar los números que vaya ingresando el usuario
        double sumaNumeros = 0d; //Variable que se usará para hacer el cálcular y obtener el promedio
        double max = 0d; //Variable que se usará para guardar el número máximo
        double min = 0d; //Variable que se usará para guardar el número mínimo

        //Con while
        System.out.println("--- Con while ---");
        while (cant > i) {
            System.out.print("Ingrese un número en la vuelta " + (i + 1) + ": ");
            n = leer.nextDouble();
            if (i == 0) {
                max = n;
                min = n;
            } else {
                if (n != max && n != min) {
                    if (n > max) {
                        max = n;
                    } else {
                        min = n;
                    }
                }
            }
            sumaNumeros += n;
            i++;
        }
        System.out.println("El máximo número ingresado fue: " + max);
        System.out.println("El mínimo número ingresado fue: " + min);
        System.out.println("El promedio fue: " + df.format(sumaNumeros / cant));

        //Do while
        System.out.println("--- Do while ---");
        i = 0;
        n = 0;
        sumaNumeros = 0;
        max = 0;
        min = 0;
        boolean continuar = true;
        char respuesta = 0;

        do {
            System.out.print("Desea agregar un número, s/n: ");
            respuesta = leer.next().charAt(0);
            if (respuesta == 's') {
                System.out.print("Ingrese un número en la vuelta " + (i + 1) + ": ");
                n = leer.nextDouble();
                if (i == 0) {
                    max = n;
                    min = n;
                } else {
                    if (n != max && n != min) {
                        if (n > max) {
                            max = n;
                        } else {
                            min = n;
                        }
                    }
                }
                sumaNumeros += n;
                i++;
            } else {
                continuar = false;
            }

        } while (continuar);

        System.out.println("El máximo número ingresado fue: " + max);
        System.out.println("El mínimo número ingresado fue: " + min);
        System.out.println("El promedio fue: " + df.format(sumaNumeros / cant));
    }
}

/*
CONSIGNA:
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio4Extra {

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer el número ingresado por el usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Pedimos al usuario que ingrese un número
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = leer.nextInt();

        //Convertimos el número a su equivalente en romano
        String romano = "";
        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                System.out.println("El número ingresado no está entre 1 y 10");
        }

        //Si el número ingresado estaba entre 1 y 10, mostramos el resultado
        if (!romano.isEmpty()) {
            System.out.println("El número " + numero + " en romano es: " + romano);
        }
    }
}

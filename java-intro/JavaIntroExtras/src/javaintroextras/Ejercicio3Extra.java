/*
CONSIGNA:
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio3Extra {

    public static void main(String[] args) {
        //Creamos un scanner para que el usuario ingrese los datos
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Almacenamos la letra en un char
        char letra = 0;
        //Luego convertimos ese char en String para evaluarlo usando el método .equals()
        String letraStr = "";

        System.out.println("Ingrese una letra");
        letra = leer.next().charAt(0); //Char
        letraStr = String.valueOf(letra).toUpperCase(); //Conversión a String

        if (letraStr.equals("A") || letraStr.equals("E") || letraStr.equals("I") || letraStr.equals("O") || letraStr.equals("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

    }

}

package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // InputMismatchException : Se produce cuando el usuario ingresa por téclado un tipo de dato que no esperaba el programa
        try {
            System.out.print("---> Ingrese el primer número: "); //Si ingreso un número que no sea un entero, dará la excepción
            int numA = leer.nextInt();
            System.out.print("---> Ingrese el segundo número"); //Si ingreso un número que no sea un entero, dará la excepción
            int numB = leer.nextInt();
            int suma = numA + numB;
            System.out.println("La suma es " + suma);
        } catch (InputMismatchException e) {
            System.out.println(">> Error: Ha ingresado un dato que el programa no esperaba");
            System.out.println(">>" + e);
            System.out.println(">> " + e.getMessage());
            System.out.println(">> " + e.fillInStackTrace());
        }
    }
}

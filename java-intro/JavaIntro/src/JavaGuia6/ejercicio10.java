package JavaGuia6;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el valor límite positivo: ");
        int limite = leer.nextInt();
        System.out.println("El valor límite es: " + limite);
        int suma = 0;
        do {
            System.out.print("Ingrese número: ");
            int num = leer.nextInt();
            suma = suma + num;
        } while (limite > suma);

        System.out.println("La suma de los números ingresados es " + suma);
    }

}

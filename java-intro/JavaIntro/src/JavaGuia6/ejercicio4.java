package JavaGuia6;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los grados:");
        double c = leer.nextDouble();
        double f = 32 + (9 * c / 5);
        System.out.println("Son " + c + " grados, y fahrenheit es " + f);
    }
}

package JavaGuia6;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        double numeroA, numeroB;
        int opcion;
        String respuesta;
        Boolean salir = true;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número: ");
            numeroA = leer.nextDouble();
            System.out.print("Ingrese otro número: ");
            numeroB = leer.nextDouble();

            System.out.println("========= MENU =========");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.println("> Elija opción <");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (numeroA + numeroB));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numeroA - numeroB));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (numeroA * numeroB));
                    break;
                case 4:
                    System.out.println("La división es: " + (numeroA / numeroB));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa?");
                    respuesta = leer.next();
                    if (respuesta.toUpperCase().equals("S")) {
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("La opción que eligió NO está en el menú");
            }
        } while (salir);
        System.out.println("Gracias por usar la app");
    }

}

package JavaGuia6;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de Euros que desea convertir:");
        double euro = leer.nextInt();
        String moneda;
        do {
            System.out.print("Ingrese a que moneda desea cambiar: libras, dólares o yenes: ");
            moneda = leer.next();
        } while (!moneda.toUpperCase().equals("LIBRAS") && !moneda.toUpperCase().equals("DOLARES") && !moneda.toUpperCase().equals("YENES"));
        System.out.println("");
        System.out.println("Usted envió " + euro + " euros y lo desea convertir en " + moneda);
        System.out.println("");
        conversion(euro, moneda);
        System.out.println("");
    }

    public static void conversion(double euro, String moneda) {
        double libras = 0.86;
        double dolares = 1.28611;
        double yenes = 129.852;
        double nuevaDivisa;
        switch (moneda.toUpperCase()) {
            case "LIBRAS":
                nuevaDivisa = euro * libras;
                System.out.println("Ahora tiene " + nuevaDivisa + " libras");
                break;
            case "DOLARES":
                nuevaDivisa = euro * dolares;
                System.out.println("Ahora tiene " + nuevaDivisa + " dolares");
                break;
            case "YENES":
                nuevaDivisa = euro * yenes;
                System.out.println("Ahora tiene " + nuevaDivisa + " yenes");
                break;
        }
    }
}

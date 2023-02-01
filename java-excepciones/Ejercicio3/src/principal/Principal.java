package principal;

import entidad.DivisionNumero;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DivisionNumero division = new DivisionNumero();

        try {
            System.out.print("---> Ingrese el primer número: ");
            String numStrA = leer.next();
            System.out.print("---> Ingrese el segundo número: ");
            String numStrB = leer.next();

            double numA = Integer.parseInt(numStrA);
            double numB = Integer.parseInt(numStrB);

            division.setResultado(numA / numB);

            System.out.println("La división es " + division.getResultado());

        } catch (NumberFormatException e) {
            System.out.println(">> Error: No se puede convertir una letra en número");
            System.out.println(">> " + e.getMessage());
            System.out.println(">> " + e);
            System.out.println(">> " + e.fillInStackTrace());
        }

    }

}

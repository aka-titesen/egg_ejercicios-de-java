package JavaGuia6;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena;
        boolean encendido = true;
        int correctas, incorrectas;
        int longitud;
        correctas = 0;
        incorrectas = 0;
        String primerLetra, ultimaLetra;
        do {
            System.out.print("Ingrese una cadena:");
            cadena = leer.nextLine();
            if (cadena.equals("&&&&&")) {
                encendido = false;
            }
            longitud = cadena.length();
            primerLetra = cadena.substring(0, 1);
            ultimaLetra = cadena.substring(4, 5);

            if ((longitud == 5) && (primerLetra.toUpperCase().equals("X") && (ultimaLetra.toUpperCase().equals("O")))) {
                correctas++;
            } else {
                incorrectas++;
            }

        } while (encendido);
        System.out.println("Cantidad de envíos correctos es: " + correctas);
        System.out.println("Cantidad de envíos incorrectos es:" + incorrectas);
    }
}

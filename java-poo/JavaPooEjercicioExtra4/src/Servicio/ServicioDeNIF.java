package Servicio;

import Clase.NIF;
import java.util.Scanner;

public class ServicioDeNIF {

    public NIF crearNIF() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        NIF n1 = new NIF();
        System.out.print("Ingrese el DNI:");
        n1.setDNI(leer.nextLong());
        //Calculo que letra debe tener a partir del DNI suministrado
        n1.setLetra(calcularPosicionDelDNI(n1));
        return n1;
    }

    public static String calcularPosicionDelDNI(NIF n1) {
        String[] posicion = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int division = (int) (n1.getDNI() % 23);
        String auxiliar = "";
        for (int i = 0; i < posicion.length; i++) {
            if (i == division) {
                auxiliar = posicion[i];
            }
        }
        return auxiliar;
    }

    public static void imprimirNIF(NIF n1) {
        System.out.println("========= NIF =========");
        System.out.println("NIF: " + n1.getDNI() + "-" + n1.getLetra());
    }
}

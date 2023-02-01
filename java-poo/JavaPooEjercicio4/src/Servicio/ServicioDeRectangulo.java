package Servicio;

import Clase.Rectangulo;
import java.util.Scanner;

public class ServicioDeRectangulo {

    public Rectangulo crearRectangulo() {
        Rectangulo r1 = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la base para el rectangulo:");
        r1.setBase(leer.nextDouble());
        System.out.print("Ingrese la altura pra el rectangulo:");
        r1.setAltura(leer.nextDouble());
        return r1;
    }

    public static void calcularSuperficie(Rectangulo r1) {
        System.out.println("La superficie del rectangulo es: " + r1.getBase() * r1.getAltura());
    }

    public static void calcularPerimetro(Rectangulo r1) {
        System.out.println("El perimetro del rectangulo es: " + (r1.getBase() + r1.getAltura()) * 2);
    }

    public static void imprimirRectangulo(Rectangulo r1) {
        double base = r1.getBase();
        double altura = r1.getAltura();
        System.out.println("========= Dibujo del rectángulo =========");
        System.out.println("");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i == 0) || (i == (altura - 1)) || (j == 0) || (j == (base - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

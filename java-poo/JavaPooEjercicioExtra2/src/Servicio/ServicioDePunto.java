package Servicio;

import Clase.Punto;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ServicioDePunto {

    public Punto crearPunto() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Punto p1 = new Punto();
        System.out.println("========= Ingrese los 2 números de la coordenada A =========");
        System.out.print("Ingrese el número de x1:");
        p1.setX1(read.nextDouble());
        System.out.print("Ingrese el número de y1:");
        p1.setY1(read.nextDouble());
        System.out.println("========= Ingrese los 2 números de la coordenada B =========");
        System.out.print("Ingrese el número de x2:");
        p1.setX2(read.nextDouble());
        System.out.print("Ingrese el número de y2:");
        p1.setY2(read.nextDouble());
        return p1;
    }

    public static double calcularDistancia(Punto p1) {
        System.out.println("========= Cálculo de la distancia =========");
        double distancia = Math.sqrt((Math.pow((p1.getX2() - p1.getX1()), 2)) + (Math.pow((p1.getY2() - p1.getY1()), 2)));
        return distancia;
    }

    public static String formatoDecimalPersonalizado(double distancia) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(distancia);
    }
}

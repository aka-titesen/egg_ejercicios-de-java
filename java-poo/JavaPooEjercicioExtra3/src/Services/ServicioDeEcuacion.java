package Services;

import Clase.Ecuacion;
import java.util.Scanner;

public class ServicioDeEcuacion {

    public Ecuacion crearEcuacion() {
        Ecuacion e1 = new Ecuacion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Ax^2 + Bx + C = 0
        System.out.print("Ingrese el termino cuádratico (A):");
        e1.setA(leer.nextDouble());
        System.out.print("Ingrese el termino líneal (B):");
        e1.setB(leer.nextDouble());
        System.out.print("Ingrese el termino independiente (C):");
        e1.setC(leer.nextDouble());
        return e1;
    }

    public static double obtenerDiscriminante(Ecuacion e1) {
        double discriminante = ((Math.pow(e1.getB(), 2)) - 4 * e1.getA() * e1.getC());
        return discriminante;

    }

    public boolean tieneRaices(double d) {
        boolean bandera = false;
        if (d >= 0) {
            bandera = true;
        }
        return bandera;
    }

    public boolean tieneRaiz(double d) {
        boolean bandera = false;
        if (d == 0) {
            bandera = true;
        }
        return bandera;
    }

    public void obtenerRaices(Ecuacion r1, double d) {
        System.out.println("X1: " + (((-r1.getB()) + (Math.sqrt(d))) / (2 * r1.getA())));
        System.out.println("X2: " + (((-r1.getB()) - (Math.sqrt(d))) / (2 * r1.getA())));
    }

    public void obtenerRaiz(Ecuacion r1, double d) {
        System.out.println("X: " + ((-r1.getB()) / (2 * r1.getA())));
    }

    public void calcular(Ecuacion r1) {
        double d = obtenerDiscriminante(r1);
        if (tieneRaices(d)) {
            System.out.println("=== La ecuación se puede hacer ===");
            if (tieneRaiz(d)) {
                obtenerRaiz(r1, d);
            } else {
                obtenerRaices(r1, d);
            }
        } else {
            System.out.println("=== La ecuación NO se puede hacer ===");
        }
    }
}

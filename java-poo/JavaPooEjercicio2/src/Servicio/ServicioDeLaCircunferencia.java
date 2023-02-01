package Servicio;

import Clase.Circunferencia;
import java.util.Scanner;

public class ServicioDeLaCircunferencia {

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el radio de la circumferencia:");
        c1.setRadio(leer.nextDouble());
        return c1;
    }

    public static double calcularArea(Circunferencia c1) {
        double resultado = 0;
        double radio = c1.getRadio();
        double area = Math.PI * Math.pow(radio, 2);
        resultado = area;
        return resultado;
    }

    public static double calcularPerimetro(Circunferencia c1) {
        double resultado = 0;
        double radio = c1.getRadio();
        double perimetro = 2 * Math.PI * radio;
        resultado = perimetro;
        return resultado;
    }
}

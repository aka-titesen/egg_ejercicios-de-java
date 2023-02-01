package Servicio;

import Clase.Operacion;
import java.util.Scanner;

public class ServicioDeOperacion {

    public Operacion crearOperacion() {
        Operacion o1 = new Operacion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el primer número:");
        o1.setNum1(leer.nextDouble());
        System.out.print("Ingrese el segundo número:");
        o1.setNum2(leer.nextDouble());
        return o1;
    }

    public static double suma(Operacion o1) {
        double resultado = o1.getNum1() + o1.getNum2();
        return resultado;
    }

    public static double resta(Operacion o1) {
        double resultado = o1.getNum1() - o1.getNum2();
        return resultado;
    }

    public static double multiplicacion(Operacion o1) {
        double resultado = 0;
        if (o1.getNum1() == 0 && o1.getNum2() == 0 || o1.getNum1() == 0 || o1.getNum2() == 0) {
            System.out.println("Error, no se puede multiplicar con 0");
        } else {
            resultado = o1.getNum1() * o1.getNum2();
        }
        return resultado;
    }

    public static double division(Operacion o1) {
        double resultado = 0;
        if (o1.getNum1() == 0 && o1.getNum2() == 0 || o1.getNum1() == 0 || o1.getNum2() == 0) {
            System.out.println("Error, no se puede dividir con 0");
        } else {
            resultado = o1.getNum1() / o1.getNum2();
        }
        return resultado;
    }
}

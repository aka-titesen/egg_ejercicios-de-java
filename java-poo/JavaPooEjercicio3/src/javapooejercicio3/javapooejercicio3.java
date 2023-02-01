package javapooejercicio3;

import Clase.Operacion;
import Servicio.ServicioDeOperacion;

public class javapooejercicio3 {

    public static void main(String[] args) {
        ServicioDeOperacion sdo = new ServicioDeOperacion();
        Operacion o1 = sdo.crearOperacion();
        double suma = sdo.suma(o1);
        System.out.println("La suma es: " + suma);
        double resta = sdo.resta(o1);
        System.out.println("La resta es: " + resta);
        double multiplicacion = sdo.multiplicacion(o1);
        System.out.println("La multiplicación es: " + multiplicacion);
        double division = sdo.division(o1);
        System.out.println("La división es: " + division);
    }

}

package javapooejercicio4;

import Clase.Rectangulo;
import Servicio.ServicioDeRectangulo;

public class javapooejercicio4 {

    public static void main(String[] args) {
        ServicioDeRectangulo sdr = new ServicioDeRectangulo();
        Rectangulo r1 = sdr.crearRectangulo();
        sdr.calcularSuperficie(r1);
        sdr.calcularPerimetro(r1);
        sdr.imprimirRectangulo(r1);
    }

}

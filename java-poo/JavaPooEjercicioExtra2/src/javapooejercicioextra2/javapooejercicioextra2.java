package javapooejercicioextra2;

import Clase.Punto;
import Servicio.ServicioDePunto;
import java.text.DecimalFormat;

public class javapooejercicioextra2 {

    public static void main(String[] args) {
        ServicioDePunto sdp = new ServicioDePunto();
        Punto p1 = sdp.crearPunto();
        double distancia = sdp.calcularDistancia(p1);
        System.out.println("La distancia es: " + sdp.formatoDecimalPersonalizado(distancia));
    }

}

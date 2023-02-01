package javapooejercicio6;

import Clase.Cafetera;
import Servicio.ServicioDeLaCafetera;

public class javapooejercicio6 {

    public static void main(String[] args) {
        ServicioDeLaCafetera sdlc = new ServicioDeLaCafetera();
        Cafetera c1 = sdlc.crearCafetera();
        sdlc.opcionesDeLista(c1);
    }
}

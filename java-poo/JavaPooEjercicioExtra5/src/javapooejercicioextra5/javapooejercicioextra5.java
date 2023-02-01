package javapooejercicioextra5;

import Clase.Mes;
import Servicio.ServicioDeMes;

public class javapooejercicioextra5 {

    public static void main(String[] args) {
        ServicioDeMes ms = new ServicioDeMes();
        Mes m1 = ms.crearMes();
        ms.descubraElMesSecreto(m1);
    }

}

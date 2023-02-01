package javapooejercicioextra4;

import Clase.NIF;
import Servicio.ServicioDeNIF;

public class javapooejercicioextra4 {

    public static void main(String[] args) {
        ServicioDeNIF sdn = new ServicioDeNIF();
        NIF n1 = sdn.crearNIF();
        sdn.imprimirNIF(n1);
    }
}

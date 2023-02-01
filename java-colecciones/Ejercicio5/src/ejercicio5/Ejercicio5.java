package ejercicio5;

import Entidad.Pais;
import Servicio.ServicioDePais;
import java.util.Set;

public class Ejercicio5 {

    public static void main(String[] args) {
        ServicioDePais sdp = new ServicioDePais();
        Set<Pais> paises = sdp.frabricaDePaises();
        sdp.menuFinal(paises);
    }

}

package javapooejercicio12;

import Clase.Persona;
import Servicio.ServicioDePersona;

public class javapooejercicio12 {

    public static void main(String[] args) {
        ServicioDePersona sdp = new ServicioDePersona();
        Persona facundo = sdp.crearPersona();
        sdp.imprimirInformacionDeLaPersona(facundo);
    }

}

package manosalaobra;

import entidad.Auto;
import entidad.Bicicleta;

public class ManosALaObra {

    public static void main(String[] args) {
        Auto volkswagenGolfGTI = new Auto();
        Bicicleta vairo = new Bicicleta();

        volkswagenGolfGTI.avanzar();
        volkswagenGolfGTI.detenerse();
        vairo.avanzar();
        vairo.detenerse();
        vairo.sentarse();
    }
}

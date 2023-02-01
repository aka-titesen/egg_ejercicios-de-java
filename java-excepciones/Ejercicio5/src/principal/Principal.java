package principal;

import entidad.Adivinanza;
import servicio.ServicioDeAdivinanza;

public class Principal {

    public static void main(String[] args) {
        ServicioDeAdivinanza sda = new ServicioDeAdivinanza();
        Adivinanza adivinanza = sda.crearJuego();

        sda.rondaDelJuego(adivinanza);

    }
}

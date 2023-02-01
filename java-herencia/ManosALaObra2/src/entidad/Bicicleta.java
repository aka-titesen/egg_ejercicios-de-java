package entidad;

import interfaz.Asiento;
import interfaz.Rueda;

public class Bicicleta implements Rueda, Asiento {

    public Bicicleta() {
    }

    @Override
    public void avanzar() {
        System.out.println("La bicicleta avanza");

    }

    @Override
    public void detenerse() {
        System.out.println("La bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse");
    }

}

package entidad;

import interfaz.Rueda;

public class Auto implements Rueda {

    public Auto() {
    }

    @Override
    public void avanzar() {
        System.out.println("El auto avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El auto se detiene");
    }

}

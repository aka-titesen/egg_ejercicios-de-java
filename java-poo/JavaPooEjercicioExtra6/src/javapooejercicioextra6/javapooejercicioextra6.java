package javapooejercicioextra6;

import Clase.Ahorcado;
import Servicios.ServiciosDeAhorcado;

public class javapooejercicioextra6 {

    public static void main(String[] args) {
        ServiciosDeAhorcado sda = new ServiciosDeAhorcado();
        Ahorcado nuevoAhorcado = sda.crearJuego();
        sda.jugandoAlAhorcado(nuevoAhorcado);
    }

}

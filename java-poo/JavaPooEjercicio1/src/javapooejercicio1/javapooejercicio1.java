package javapooejercicio1;

import Servicio.ServicioDeLibro;
import Clase.Libro;

public class javapooejercicio1 {

    public static void main(String[] args) {
        ServicioDeLibro sdl = new ServicioDeLibro();
        Libro l1 = sdl.crearLibro();
        sdl.mostarElLibro(l1);
    }
}

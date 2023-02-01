package Principal;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

public class principal {

    public static void main(String[] args) {
        //Mi lista de jugadores
        Jugador jugador1 = new Jugador("jugador1", "apellido1", "Lateral", 7);
        Jugador jugador2 = new Jugador("jugador2", "apellido2", "Mediocampista", 5);
        Jugador jugador3 = new Jugador("jugador3", "apellido3", "Arquero", 1);
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        //Instancio mi equipo y establezco la lista de jugadores en su atributo de tipo lista "Jugadores"
        Equipo equipo1 = new Equipo();
        equipo1.setJugadores(jugadores);
        //Recorro el atributo del tipo lista "Jugadores" del objeto equipo "ViejosChotosFC"
        for (Jugador jugador : equipo1.getJugadores()) {
            System.out.println(jugador);
        }
    }

}

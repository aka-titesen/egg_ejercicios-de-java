package ejercicio2;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.Partidas;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        Partidas partidaRuletaRusa = new Partidas();
        
        Revolver revolver = partidaRuletaRusa.llenarRevolver();
        
        
        List<Jugador> jugadores = partidaRuletaRusa.llenarJugadores();
        
        
        Juego juegoRuletaRusa = partidaRuletaRusa.llenarJuego(revolver, jugadores);
        
        
        partidaRuletaRusa.ronda(juegoRuletaRusa);
    }

}

package ejercicio3;

import Entidad.Baraja;
import Entidad.Mano;
import Servicio.ServicioDeCartas;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        ServicioDeCartas sdc = new ServicioDeCartas(); //Servicio con el cual crearé el objeto mano, baraja que a su vez contendrá como atributo una lista de clase carta      
        Baraja barajaJugador = sdc.crearBaraja(); //Creo mi objeto baraja que tendrá como atributo una lista de cartas de la clase carta
        Mano manoJugador = sdc.crearMano(); //Creo mi objeto mano que tendrá como atributo una lista de cartas de la clase carta
        sdc.rondaCartas(barajaJugador, manoJugador);
        
    }
    
}

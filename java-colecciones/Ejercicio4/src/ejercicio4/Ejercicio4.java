package ejercicio4;

import Entidad.Pelicula;
import Servicio.ServicioDePelicula;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        ServicioDePelicula sdp = new ServicioDePelicula();
        List<Pelicula> peliculas = sdp.fabricaDePeliculas();
        sdp.menuManipulacionDeListasDePeliculas(peliculas);

    }

}

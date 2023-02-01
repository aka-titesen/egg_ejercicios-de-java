package Utilidad;

import Entidad.Pais;
import java.util.Comparator;

public class Comparador {

    public static Comparator<Pais> ordenarPorNombreAscendente = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

}

package javapooejercicio8;

import Clase.CadenaDeTexto;
import Servicio.ServicioDeCadenaDeTexto;

public class javapooejercicio8 {

    public static void main(String[] args) {
        ServicioDeCadenaDeTexto sdcdt = new ServicioDeCadenaDeTexto();
        CadenaDeTexto cdt1 = sdcdt.crearCadena();
        sdcdt.contarVocales(cdt1);
        sdcdt.invertirPalabra(cdt1);
        sdcdt.letrasRepetidas(cdt1);
        sdcdt.compararLongitud(cdt1);
        sdcdt.unirPalabras(cdt1);
        sdcdt.reemplazarLetra(cdt1);
        if (sdcdt.verificarLetra(cdt1) == true) {
            System.out.println("La letra SI se encuentra");
        } else {
            System.out.println("La letra NO se encuentra");
        }
    }

}

package javapooejercicio9;

import Clase.Matematica;
import Servicio.ServicioDeMatematica;

public class javapooejercicio9 {

    public static void main(String[] args) {
        ServicioDeMatematica sdm = new ServicioDeMatematica();
        Matematica m1 = sdm.crearOperacion();
        int[] numeros = sdm.retornaElMayor(m1);
        sdm.calcularPotencia(numeros);
        sdm.calcularRaiz(numeros);
    }
}

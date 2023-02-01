package javapooejercicioextra3;

import Clase.Ecuacion;
import Services.ServicioDeEcuacion;

public class javapooejercicioextra3 {

    public static void main(String[] args) {
        ServicioDeEcuacion sde = new ServicioDeEcuacion();
        Ecuacion e1 = sde.crearEcuacion();
        sde.obtenerDiscriminante(e1);
        sde.calcular(e1);

    }

}

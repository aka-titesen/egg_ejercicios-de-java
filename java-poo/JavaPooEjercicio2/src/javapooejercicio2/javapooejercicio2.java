package javapooejercicio2;

import Clase.Circunferencia;
import Servicio.ServicioDeLaCircunferencia;

public class javapooejercicio2 {

    public static void main(String[] args) {
        ServicioDeLaCircunferencia sdlc = new ServicioDeLaCircunferencia();
        Circunferencia c1 = sdlc.crearCircunferencia();
        double area = sdlc.calcularArea(c1);
        System.out.println("El área de la circunferencia es : " + area);
        double perimetro = sdlc.calcularPerimetro(c1);
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
}

package principal;

import entidad.Circulo;
import entidad.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        Circulo nuevoCicrulo = new Circulo();
        Circulo c1 = nuevoCicrulo.crearCirculo();
        c1.areaCirculo();
        c1.perimetroCirculo();
        System.out.println(c1);

        Rectangulo nuevoRectangulo = new Rectangulo();
        Rectangulo r1 = nuevoRectangulo.crearRectangulo();
        r1.areaRectangulo();
        r1.perimetroRectangulo();
        System.out.println(r1);
    }

}

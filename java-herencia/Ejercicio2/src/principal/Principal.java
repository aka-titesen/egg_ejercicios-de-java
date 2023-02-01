package principal;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //Ejercicio 1
        Lavadora nuevaLavadora = new Lavadora(); //Creo un objeto lavadora para después a través de éste llamar a sus métodos
        Lavadora whirpoolWNQ06AB = nuevaLavadora.crearLavadora(); //Creo una nueva lavadora con el método crearLavadora y lo guardo en whirpoolWNQ06AB
        //whirpoolWNQ06AB.precioFinal();
        Lavadora electroluxELAF07W = nuevaLavadora.crearLavadora();
        //electroluxELAF07W.precioFinal();

        Televisor nuevoTelevisor = new Televisor();
        Televisor smartLg41 = nuevoTelevisor.crearTelevisor();
        //smartLg41.precioFinal();
        Televisor smartSamsumg41 = nuevoTelevisor.crearTelevisor();
        //smartSamsumg41.precioFinal();

        //Ejercicio 2
        List<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(whirpoolWNQ06AB);
        electrodomesticos.add(electroluxELAF07W);
        electrodomesticos.add(smartLg41);
        electrodomesticos.add(smartSamsumg41);

        //Mostrará el precio de cada electrodomestico
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
        }
        //Mostrará la suma de todos precio de todas las lavadoras
        Double sumaLavadoras = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                sumaLavadoras += electrodomestico.getPrecio();
            }
        }
        System.out.println("> La suma de todas las lavadoras $" + sumaLavadoras);
        //Mostrará la suma de todos precio de todos los televisores
        Double sumaTelevisores = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Televisor) {
                sumaTelevisores += electrodomestico.getPrecio();
            }
        }
        System.out.println("> La suma de todos los televisores $" + sumaTelevisores);
        //Mostrará la suma total de todos los electrodomestricos
        Double sumaTotal = 0d;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            sumaTotal += electrodomestico.getPrecio();
        }
        System.out.println("> La suma de todos los electrodomesticos es $" + sumaTotal);
    }

}

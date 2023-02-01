package principal;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

public class Principal {

    public static void main(String[] args) {
        Animal milo = new Perro("Milo", "Carne de res", 5, "Pitbull");
        milo.alimentarse();

        Animal wilson = new Gato("Wilson", "Whiskas", 3, "Siberiano");
        wilson.alimentarse();

        Animal felix = new Caballo("Félix", "Alfalfa", 5, "Mustang");
        felix.alimentarse();
    }

}

package principal;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Creo primero un objeto de la SuperClase
        Animal facu = new Animal("Facundo", "Dios", 24);
        //Objeto de la SubClase Perro
        Animal milo = new Perro("Pitbull", "Milo", "Facundo", 5);
        //Objeto de la SubClase Gato
        Animal oliver = new Gato("Callejero", "Oliver", "Facundo", 1);
        //Guardo los tres animales en una lista de tipo animal
        List<Animal> animales = new ArrayList();
        animales.add(facu);
        animales.add(milo);
        animales.add(oliver);
        //Imprimo cada animal y sus atributos
        for (Animal animal : animales) {
            System.out.println(animal);
        }
        //Imprimo cada animal llamando a su método hacer ruido
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }

}

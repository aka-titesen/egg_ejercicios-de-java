package principal;

import entidad.Duenio;
import entidad.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", "Salchica", 4, 1.7);
        Perro cacho = new Perro("Cacho", "Pitbull", 2, 5.7);

        Duenio facundo = new Duenio("Facundo", "González", 23, firulais);
        Duenio nicolas = new Duenio("Nicolás", "González", 23, cacho);

        System.out.println(facundo);
        System.out.println(nicolas);
    }
}

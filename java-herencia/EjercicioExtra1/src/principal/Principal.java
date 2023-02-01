package principal;

import servicio.ServicioAlquiler;

public class Principal {

    public static void main(String[] args) {
        ServicioAlquiler sistemaDeAlquiler = new ServicioAlquiler();
        sistemaDeAlquiler.menu();
    }

}

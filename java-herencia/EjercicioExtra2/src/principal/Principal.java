package principal;

import servicio.ServicioDeEdificio;

public class Principal {

    public static void main(String[] args) {
        ServicioDeEdificio sistemaDeEdificios = new ServicioDeEdificio();
        sistemaDeEdificios.menu();
    }

}

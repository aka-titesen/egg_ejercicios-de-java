package principal;

import servicio.ServicioDeAlojamiento;

public class principal {

    public static void main(String[] args) {
        ServicioDeAlojamiento sistemaDeAlojamiento = new ServicioDeAlojamiento();
        sistemaDeAlojamiento.menu();
    }

}

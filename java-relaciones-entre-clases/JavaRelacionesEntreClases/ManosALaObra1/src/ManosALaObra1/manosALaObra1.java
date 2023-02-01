package ManosALaObra1;

import Entidad.DNI;
import Entidad.Persona;
import java.util.Scanner;

public class manosALaObra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona fulanito = new Persona();
        System.out.print("---> Ingresa el nombre:");
        fulanito.setNombre(leer.next());
        System.out.print("---> Ingresa el apellido: ");
        fulanito.setApellido(leer.next());
        //Creación del objeto DNI que luego le pasaré como atributo al objeto persona
        DNI dni_de_fulanito = new DNI("Z", 40908692);
        //Le asigno el DNI a la persona
        fulanito.setDni(dni_de_fulanito);
        //Muestro por pantalla
        System.out.println("Nombre: " + fulanito.getNombre() + " Apellido: " + fulanito.getApellido() + " DNI: " + fulanito.getDni().getSerie() + "-" + fulanito.getDni().getNumero());
    }

}

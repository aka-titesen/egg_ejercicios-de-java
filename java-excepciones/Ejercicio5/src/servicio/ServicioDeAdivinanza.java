package servicio;

import entidad.Adivinanza;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServicioDeAdivinanza {

    private Scanner leer;

    public ServicioDeAdivinanza() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int numeroAleatorio() {
        return (int) (Math.random() * 500 + 1);
    }

    public Adivinanza crearJuego() {
        Adivinanza adivinanza = new Adivinanza();
        adivinanza.setNumeroSecreto(numeroAleatorio());
        System.out.println(">> El número aleatorio ya ha sido seleccionado");
        return adivinanza;
    }

    public void rondaDelJuego(Adivinanza adivinanza) throws InputMismatchException {
        adivinanza.setIntentos(1);
        boolean menu = true;
        System.out.println("### Bienvenido al juego de adivinanza ###");
        while (menu) {
            try {
                System.out.println("### Adivine el número el número secreto que está entre 1-500");
                System.out.print(">> Ingrese un número: ");
                adivinanza.setNumeroAAdivinar(leer.nextInt());
                if (adivinanza.getNumeroSecreto() == adivinanza.getNumeroAAdivinar()) {
                    System.out.println(">> Felicitaciones ha acertado, el número secreto era " + adivinanza.getNumeroSecreto());
                    System.out.println(">> Gracias por jugar, lo resolvió en el intento N° " + adivinanza.getIntentos());
                    menu = false;
                } else {
                    if (adivinanza.getNumeroSecreto() > adivinanza.getNumeroAAdivinar()) {
                        System.out.println(">> El número secreto es mayor al número que ingreso");
                        System.out.println(">> Es el intento " + adivinanza.getIntentos());
                        adivinanza.setIntentos(adivinanza.getIntentos() + 1);
                    } else {
                        System.out.println(">> El número secreto es menor al número que ingreso");
                        System.out.println(">> Es el intento " + adivinanza.getIntentos());
                        adivinanza.setIntentos(adivinanza.getIntentos() + 1);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println(">> Ha ingresado un dato no esperado cuando se esperaba un número");
                leer.next(); //Si no pongo ésto entonces repitrá infinitamente el bloque catch
            }
        }
    }
}

package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import Entidad.Mano;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioDeCartas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja crearBaraja() {
        Baraja barajaJugador = new Baraja();
        List<Carta> baraja = new ArrayList<>();
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        for (int i = 0; i < 4; i++) {
            String palo = palos[i];
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    baraja.add(new Carta(j, palo));
                }
            }
        }
        barajaJugador.setBaraja(baraja);
        return barajaJugador;
    }

    public Mano crearMano() {
        Mano manoJugador = new Mano();
        List<Carta> barajaMano = new ArrayList<>();
        manoJugador.setBarajaMano(barajaMano);
        return manoJugador;
    }

    public void barajar(Baraja juegoDeCartas) {
        List<Carta> baraja = new ArrayList<>(juegoDeCartas.getBaraja());
        Collections.shuffle(baraja);
        juegoDeCartas.setBaraja(baraja);
    }

    public boolean siguienteCarta(Baraja barajaJugador, Mano manoJugador, int cantidadDeCartas) {
        int j = 0;
        Iterator it = barajaJugador.getBaraja().iterator();
        boolean cartasEntregadas = true;
        if (cantidadDeCartas <= barajaJugador.getBaraja().size()) {
            for (int i = 0; i < cantidadDeCartas; i++) {
                manoJugador.getBarajaMano().add(barajaJugador.getBaraja().get(i));
            }
            while (it.hasNext() && j < cantidadDeCartas) {
                Object nextCarta = it.next();
                it.remove();
                j++;
            }
        } else {
            cartasEntregadas = false;
        }
        return cartasEntregadas;
    }

    public void darCarta(Baraja barajaJugador, Mano manoJugador) {
        System.out.print("---> ¿Cuántas cartas pedirá?: ");
        int cantidadDeCartas = leer.nextInt();
        if (siguienteCarta(barajaJugador, manoJugador, cantidadDeCartas)) {
            System.out.println("> Todas las cartas han sido entregadas");
        } else {
            System.out.println("> No se han encontrado las sufientes cartas que pidió el jugador");
        }
    }

    public void cartasDisponibles(Baraja barajaJugador) {
        System.out.println("> Quedan " + barajaJugador.getBaraja().size() + " cartas en la baraja para repartir");
    }

    public void cartasMonton(Mano manoJugador) {
        if (manoJugador.getBarajaMano().isEmpty()) {
            System.out.println("> No hay cartas disponibles en la mano");
        } else {
            System.out.println("> Cartas disponibles en la mano");
            for (Carta carta : manoJugador.getBarajaMano()) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja(Baraja barajaJugador) {
        if (barajaJugador.getBaraja().isEmpty()) {
            System.out.println("> No hay cartas disponibles en la baraja");
        } else {
            for (Carta carta : barajaJugador.getBaraja()) {
                System.out.println(carta);
            }
        }
    }

    public void rondaCartas(Baraja barajaJugador, Mano manoJugador) {
        boolean barajar = false;
        boolean menu = true;
        System.out.println("========= Bienvenido a la casita robada =========");
        System.out.println("> Ingrese alguna de las siguientes opciones");
        while (menu) {
            System.out.println("1: Mescle la baraja, 2: Pida un número de cartas, 3: Mostrar cartas disponibles en la baraja, 4: Mostar cartas en la mano,"
                    + "5: Mostrar cartas en la baraja, 6: Terminar juego");
            switch (leer.nextInt()) {
                case 1:
                    if (barajaJugador.getBaraja().isEmpty()) {
                        System.out.println("> No hay cartas para barajar");
                    } else if (barajaJugador.getBaraja().size() < 10) {
                        System.out.println("> No hay cartas suficientes para barajar");
                    } else {
                        barajar(barajaJugador);
                        System.out.println("> Cartas barajadas");
                        barajar = true;
                    }
                    break;
                case 2:
                    if (barajar) {
                        darCarta(barajaJugador, manoJugador);
                    } else {
                        System.out.println("> No ha barajado la cartas, primero haga eso");
                    }
                    break;
                case 3:
                    if (barajar) {
                        cartasDisponibles(barajaJugador);
                    } else {
                        System.out.println("> No ha barajado la cartas, primero haga eso");
                    }
                    break;
                case 4:
                    cartasMonton(manoJugador);
                    break;
                case 5:
                    mostrarBaraja(barajaJugador);
                    break;
                case 6:
                    System.out.println("Ha terminado el juego, gracias por jugar");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, ingrese nuevamente");
            }
        }
    }
}

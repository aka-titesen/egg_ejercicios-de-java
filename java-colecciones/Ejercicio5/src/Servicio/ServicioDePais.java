package Servicio;

import Entidad.Pais;
import Utilidad.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ServicioDePais {

    public Pais crearPais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("---> Ingrese el país:");
        String nombre = leer.next().toUpperCase();
        return new Pais(nombre);
    }

    public Set<Pais> frabricaDePaises() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Set<Pais> paises = new HashSet<>();
        System.out.print("---> ¿Cuántos países va a agregar al conjunto?:");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("========= Cargando país N° " + (i + 1) + " ========= ");
            paises.add(crearPais());
        }
        return paises;
    }

    public List<Pais> ordenarPorNombreAscendente(Set<Pais> paises) {
        List<Pais> paisesArrayList = new ArrayList<Pais>(paises);
        Collections.sort(paisesArrayList, Comparador.ordenarPorNombreAscendente);
        return paisesArrayList;

    }

    public void mostrarConjunto(List<Pais> paises) {
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
    }

    public boolean eliminarElementoEnElConjunto(Set<Pais> paises) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Iterator<Pais> it = paises.iterator();
        boolean eliminado = false;
        System.out.println("Ingrese el país que desea eliminar");
        String pais = leer.nextLine().toUpperCase();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(pais)) {
                it.remove();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public void menuFinal(Set<Pais> paises) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        if (paises.isEmpty()) {
            System.out.println("> El conjunto está vació");
        } else {
            System.out.println("========= Bienvenido a la aplicación de Países =========");
            System.out.println("1: Muestra el conjunto de manera ordenada alfábeticamente");
            System.out.println("2: Elimina un país del conjunto");
            System.out.println("3: Finalizar el programa");
            System.out.println("¿Desea realizar alguna operación?");
            System.out.print("---> Ingrese s/n:");
            if (leer.next().equalsIgnoreCase("S")) {
                do {
                    System.out.print("---> Ingrese una de las opciones:");
                    switch (leer.nextInt()) {
                        case 1:
                            mostrarConjunto(ordenarPorNombreAscendente(paises));
                            break;
                        case 2:
                            if (eliminarElementoEnElConjunto(paises)) {
                                mostrarConjunto(ordenarPorNombreAscendente(paises));
                            } else {
                                System.out.println("> El país no se encuentra en la lista");
                            }
                            break;
                        case 3:
                            menu = false;
                            System.out.println("> Programa finalizado");
                            break;
                        default:
                            System.out.println("> Opción incorrecta, vuelve al menú nuevamente");
                            break;
                    }
                } while (menu);
            } else {
                System.out.println("> Entiendo :') gracias por usar la app");
            }
        }
    }
}

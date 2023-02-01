package Servicio;

import Entidad.Pelicula;
import Utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServicioDePelicula {

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el título de la película:");
        String titulo = leer.next();
        System.out.print("Ingrese el director de la película:");
        String director = leer.next();
        System.out.print("Ingrese la duración de la película:");
        int duracion = leer.nextInt();
        return new Pelicula(titulo, director, duracion);

    }

    public List<Pelicula> fabricaDePeliculas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Pelicula> peliculas = new ArrayList<>();
        System.out.print("¿Cuántas películas va a agregar a la lista?:");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("========= Cargando datos de la película N° " + (i + 1) + " ========= ");
            peliculas.add(crearPelicula());
        }
        return peliculas;

    }

    public void mostarListadoDePeliculas(List<Pelicula> peliculas) {
        System.out.println("========= Lista de todas las peliculas =========");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasDeMasDeUnaHora(List<Pelicula> peliculas) {
        System.out.println("========= Lista de todas las peliculas que duran más de una hora =========");
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getDuracion() > 60) {
                System.out.println(peliculas.get(i));
            }
        }

    }

    public void ordenarDuracionAscedente(List<Pelicula> peliculas) {
        System.out.println("========= Ordenación ascendente en base a la duración =========");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAscendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarDuracionDescendente(List<Pelicula> peliculas) {
        System.out.println("========= Ordenación descendente en base a la duración =========");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDescendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarAscendentePorTitulo(List<Pelicula> peliculas) {
        System.out.println("========= Ordenación alfabética en base a los títulos =========");
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAscendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void ordenarAscendentePorDirector(List<Pelicula> peliculas) {
        System.out.println("========= Ordenación alfabética en base a los directores =========");
        Collections.sort(peliculas, Comparadores.ordenarPorDirectorAscendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void menuManipulacionDeListasDePeliculas(List<Pelicula> peliculas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        if (peliculas.isEmpty()) {
            System.out.println("> La lista se encuentra vacía por lo tanto no se pueda realizar ninguna operación ");
        } else if (peliculas.size() == 1) {
            System.out.println("> La lista tiene un solo elemento por lo tanto no tiene sentido realizar operación");
        } else {
            System.out.println("========= Bienvenido al asistente que le ayudará a manipular su lista de películas =========");
            System.out.println("====== Puede hacer las siguientes operaciones ======");
            System.out.println("1: Mostrar todas las peliculas");
            System.out.println("2: Mostras todas las peliculás que duren más de una hora");
            System.out.println("3: Listar las películas en base a su duración de forma ascendente");
            System.out.println("4: Listar las películas en base a su duración de forma descendente");
            System.out.println("5: Listas las películas alfábeticamente en base a su título");
            System.out.println("6: Listas las películas alfábeticamente en base a su director");
            System.out.println("7: Finalizar el programa");
            System.out.println("¿Desea realizar alguna operación?");
            System.out.print("---> Ingrese s/n:");
            if (leer.next().equalsIgnoreCase("S")) {
                do {
                    System.out.print("---> Ingrese una de las opciones:");
                    switch (leer.nextInt()) {
                        case 1:
                            mostrarPeliculasDeMasDeUnaHora(peliculas);
                            break;
                        case 2:
                            mostrarPeliculasDeMasDeUnaHora(peliculas);
                            break;
                        case 3:
                            ordenarDuracionAscedente(peliculas);
                            break;
                        case 4:
                            ordenarDuracionDescendente(peliculas);
                            break;
                        case 5:
                            ordenarAscendentePorTitulo(peliculas);
                            break;
                        case 6:
                            ordenarAscendentePorDirector(peliculas);
                            break;
                        case 7:
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

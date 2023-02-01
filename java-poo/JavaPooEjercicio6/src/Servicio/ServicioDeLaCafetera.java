package Servicio;

import Clase.Cafetera;
import java.util.Scanner;

public class ServicioDeLaCafetera {

    public Cafetera crearCafetera() {
        Cafetera c1 = new Cafetera();
        c1.setcapacidadMaxima(30);
        return c1;
    }

    public static void cargarGranosDeCafe(Cafetera c1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresé la cantidad de granos café que desea preparar en (cm):");
        int nuevaCapacidadActual = leer.nextInt();
        if (nuevaCapacidadActual <= c1.getcapacidadMaxima()) {
            c1.setcapacidadActual(nuevaCapacidadActual);
        } else {
            System.out.println("La cantidad de granos (cm) que ingresó supera a la cantidad máxima sopcionesortada");
        }
    }

    public static void llenarCafetera(Cafetera c1) {
        if (c1.getcapacidadActual() < c1.getcapacidadMaxima()) {
            c1.setcapacidadActual(c1.getcapacidadMaxima());
        } else {
            System.out.println("La cafetera ya está en su máxima capacidad");
        }
    }

    public static void servirTaza(Cafetera c1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño de la taza:");
        int faltante;
        int nuevaTaza = leer.nextInt();
        if (c1.getcapacidadActual() < nuevaTaza) {
            nuevaTaza = c1.getcapacidadActual();
            faltante = nuevaTaza - c1.getcapacidadActual();
            System.out.println("La taza se carga de café pero no se lleno y le falto " + faltante + " cm");
        }
    }

    public static void vaciarCafetera(Cafetera c1) {
        c1.setcapacidadActual(0);
    }

    public static void opcionesDeLista(Cafetera c1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("========= Bienvenido a las opcionesciones de la Cafetera =========");
        System.out.println("====== Menú de opciones ======");
        System.out.println("1: Cargar granos de café | 2: Servir una taza de cafe | 3: Llenar la cafetera | 4: Vaciar la cafetera | 5: Salir");
        boolean menu = true;
        int opciones = 0;
        do {
            System.out.print("Seleccione una opción:");
            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    cargarGranosDeCafe(c1);
                    break;
                case 2:
                    servirTaza(c1);
                    break;
                case 3:
                    llenarCafetera(c1);
                    break;
                case 4:
                    vaciarCafetera(c1);
                    break;
                case 5:
                    menu = false;
                    break;
            }
        } while (menu);
    }
}

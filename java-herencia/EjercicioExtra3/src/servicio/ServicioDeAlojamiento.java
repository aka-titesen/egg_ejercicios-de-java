package servicio;

import comparador.Comparador;
import entidad.Alojamiento;
import entidad.Camping;
import entidad.HotelCinco;
import entidad.HotelCuatro;
import entidad.Residencia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServicioDeAlojamiento {

    private List<Alojamiento> registrosAlojamientos;
    private Scanner leer;

    public ServicioDeAlojamiento() {
        this.registrosAlojamientos = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    //Creo Hotel 4 Estrellas
    public HotelCuatro crearHCuatro() {
        HotelCuatro hc1 = new HotelCuatro();
        System.out.print("---> Ingrese la cantidad de habitaciones: ");
        hc1.setCantHabitaciones(leer.nextInt());
        System.out.print("---> Ingrese el número de camas: ");
        hc1.setNumeroCamas(leer.nextInt());
        System.out.print("---> Ingrese el número de pisos: ");
        hc1.setCantPisos(leer.nextInt());
        System.out.print("---> Ingrese el nombre del hotel: ");
        hc1.setNombre(leer.next());
        System.out.print("---> Ingrese la dirección: ");
        hc1.setDireccion(leer.next());
        System.out.print("---> Ingrese la localidad: ");
        hc1.setLocalidad(leer.next());
        System.out.print("---> Ingrese el gerente");
        hc1.setGerente(leer.next());
        hc1.setGimnasio(hc1.categoriaGimnasio()); //Método que devuelve la categoría del Gimnasio
        System.out.print("---> Ingrese nombre del restaurante: ");
        hc1.setNombreRestaurante(leer.next());
        System.out.print("----> Ingrese la capacidad del restaurante: ");
        hc1.setCapacidadRestaurante(leer.nextInt());
        hc1.setPrecioPorHabitaciones(hc1.precioPorHabitacion()); //Uso el método para cálcular el precio por habitación
        return hc1;
    }

    //Creo Hotel 5 Estrellas
    public HotelCinco crearHCinco() {
        HotelCinco hc1 = new HotelCinco();
        System.out.print("---> Ingrese la cantidad de habitaciones: ");
        hc1.setCantHabitaciones(leer.nextInt());
        System.out.print("---> Ingrese el número de camas: ");
        hc1.setNumeroCamas(leer.nextInt());
        System.out.print("---> Ingrese el número de pisos: ");
        hc1.setCantPisos(leer.nextInt());
        System.out.print("---> Ingrese el nombre del hotel: ");
        hc1.setNombre(leer.next());
        System.out.print("---> Ingrese la dirección: ");
        hc1.setDireccion(leer.next());
        System.out.print("---> Ingrese la localidad: ");
        hc1.setLocalidad(leer.next());
        System.out.print("---> Ingrese el gerente");
        hc1.setGerente(leer.next());
        hc1.setGimnasio(hc1.categoriaGimnasio()); //Método que devuelve la categoría del Gimnasio
        System.out.print("---> Ingrese nombre del restaurante: ");
        hc1.setNombreRestaurante(leer.next());
        System.out.print("----> Ingrese la capacidad del restaurante: ");
        hc1.setCapacidadRestaurante(leer.nextInt());
        System.out.print("---> Ingrese la cantidad de salas de conferencias: ");
        hc1.setCantSalonesConferencia(leer.nextInt());
        System.out.print("---> Ingrese la cantidad de suites: ");
        hc1.setCantSuites(leer.nextInt());
        System.out.print("---> Ingrese la cantidad limusinas");
        hc1.setCantLimusinas(leer.nextInt());
        hc1.setPrecioPorHabitaciones(hc1.precioPorHabitacion()); //Uso el método para cálcular el precio por habitación
        return hc1;
    }

    //Creo un Camping
    public Camping crearCamping() {
        Camping c1 = new Camping();
        System.out.print("---> Ingrese la cantidad de carpas: ");
        c1.setCantMaximaCarpas(leer.nextInt());
        System.out.print("---> Ingrese la cantidad de baños disponibles: ");
        c1.setCantBanhosDisponibles(leer.nextInt());
        c1.setRestaurante(c1.restauranteONo()); //Éste método devuelve si tiene o no restaurante, dependiendo de lo que elija el usuario
        c1.setPrivado(c1.privadoONo()); //Éste método devuelve si es o no privado, dependiendo de lo que elija el usuario
        System.out.print("---> Ingresa el nombre del camping: ");
        c1.setNombre(leer.next());
        System.out.print("---> Ingresa la dirección del camping: ");
        c1.setDireccion(leer.next());
        System.out.print("---> Ingresa la localidad del camping: ");
        c1.setLocalidad(leer.next());
        System.out.print("---> Ingresa el gerente del camping: ");
        c1.setGerente(leer.next());
        return c1;
    }

    //Creo una residencia
    public Residencia crearResidencia() {
        Residencia r1 = new Residencia();
        System.out.print("---> Ingresa la cantidad de habitaciones de la residencia: ");
        r1.setCantHabitaciones(leer.nextInt());
        r1.setDescuento(r1.descuentoONo()); //Éste método devuelve si tendrá descuento o no, dependiendo de lo que elija el usuario
        r1.setCampoDeportivo(r1.campoDeportivoONo()); //Éste método devuelve si tendrá campo deportivo o no, dependiendo de lo que elija el usuario
        r1.setPrivado(r1.privadoONo()); //Éste método devuelve si será privado o no, dependiendo de lo que elija el usuario
        System.out.print("---> Ingresa el nombre de la residencia: ");
        r1.setNombre(leer.next());
        System.out.print("---> Ingresa la dirección de la residencia: ");
        r1.setDireccion(leer.next());
        System.out.print("---> Ingresa la localidad de la residencia: ");
        r1.setLocalidad(leer.next());
        System.out.print("---> Ingresa el gerente de la residencia: ");
        r1.setGerente(leer.next());
        return r1;
    }

    //Método para crear los diferentes alojamientos
    public void tipoDeAlojamiento() {
        boolean menu = true;
        System.out.println(" ### Seleccione el tipo de alojamiento ### ");
        while (menu) {
            System.out.println(">> 1: Hotel 5 estrellas | 2: Hotel 4 estrellas | 3: Camping | 4: Residencia | 5: Salir");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    registrosAlojamientos.add(crearHCinco());
                    break;
                case 2:
                    registrosAlojamientos.add(crearHCuatro());
                    break;
                case 3:
                    registrosAlojamientos.add(crearCamping());
                    break;
                case 4:
                    registrosAlojamientos.add(crearResidencia());
                    break;
                case 5:
                    System.out.println("Ha salido del programa...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }
    }

    public void menu() {
        boolean menu = true;
        System.out.println("### Bienvenido al sistema gestión de Alojamientos ###");
        System.out.println(">> Puede operar con las siguientes opciones");
        while (menu) {
            System.out.println(">> 1: Crea un nuevo alojamiento | 2: Ve todos los alojamientos registrados | 3: Ve los hoteles de más caro a más barato | 4: Ve todos los campings con restaurante | 5: Todas las residencias que tienen descuentos | 6: Salir");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    tipoDeAlojamiento();
                    break;
                case 2:
                    for (Alojamiento alojamiento : registrosAlojamientos) {
                        alojamiento.mostrarInformacion();
                    }
                    break;
                case 3:
                    List<HotelCuatro> hotelesCuatro = new ArrayList(); //Guardaré solo los hoteles 4 estrellas para luego ordenarlos
                    List<HotelCinco> hotelesCinco = new ArrayList(); //Guardaré solo los hoteles 5 estrellas para luego ordenarlos

                    for (Alojamiento alojamiento : registrosAlojamientos) { //Guardo los hoteles 4 y 5 en sus respectivas listas
                        if (alojamiento instanceof HotelCuatro) {
                            hotelesCuatro.add((HotelCuatro) alojamiento);
                        } else if (alojamiento instanceof HotelCinco) {
                            hotelesCinco.add((HotelCinco) alojamiento);
                        }
                    }

                    Collections.sort(hotelesCuatro, Comparador.hCuatroCaroABarato); //Ordeno los hoteles por precio de mayor a menor
                    Collections.sort(hotelesCinco, Comparador.hCincoCaroABarato);

                    for (HotelCuatro hotelCuatro : hotelesCuatro) { //Muestro los hoteles 4 estrellas ordenados
                        hotelCuatro.mostrarInformacion();
                    }

                    for (HotelCinco hotelCinco : hotelesCinco) { //Muestro los hoteles 4 estrellas ordenados
                        hotelCinco.mostrarInformacion();
                    }
                    break;
                case 4:
                    campingConRestaurante(registrosAlojamientos);
                    break;
                case 5:
                    residenciaConDescuento(registrosAlojamientos);
                    break;
                case 6:
                    menu = false;
                    System.out.println("Ha salido del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }
    }

    public void campingConRestaurante(List<Alojamiento> alojamientos) {
        System.out.println("### Campings con restaurantes ###");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isRestaurante()) {
                    alojamiento.mostrarInformacion();
                }
            }
        }
    }

    public void residenciaConDescuento(List<Alojamiento> alojamientos) {
        System.out.println("### Residencias con Descuentos ###");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuento()) {
                    alojamiento.mostrarInformacion();
                }
            }
        }
    }
}

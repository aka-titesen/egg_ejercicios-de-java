package servicio;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioDeEdificio {

    private List<Edificio> registrosDeEdificios;

    private Scanner leer;

    public ServicioDeEdificio() {
        this.registrosDeEdificios = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public List<Edificio> getRegistrosDeEdificios() {
        return registrosDeEdificios;
    }

    public void setRegistrosDeEdificios(List<Edificio> registrosDeEdificios) {
        this.registrosDeEdificios = registrosDeEdificios;
    }

    public Polideportivo crearPolideportivo() {
        Polideportivo pd1 = new Polideportivo();
        System.out.print("---> Ingrese el nombre del polideportivo: ");
        pd1.setNombrePolideportivo(leer.next());
        pd1.setTipoInstalacion(pd1.tipoPolideportivo()); //Función que retorno el tipo de Polideportivo que eligió el usuario
        System.out.print("---> Ingrese le ancho del polideportivo: ");
        pd1.setAncho(leer.nextDouble());
        System.out.print("---> Ingrese el alto del polideportivo: ");
        pd1.setAlto(leer.nextDouble());
        System.out.print("---> Ingrese el largo del polideportivo: ");
        pd1.setLargo(leer.nextDouble());
        return pd1;
    }

    public EdificioDeOficinas crearEdificioDeOficinas() {
        EdificioDeOficinas edo1 = new EdificioDeOficinas();
        System.out.print("---> Ingrese el número de pisos:  ");
        edo1.setNumeroDepisos(leer.nextInt());
        System.out.print("---> Ingrese el número de oficinas por cada piso: ");
        edo1.setNumeroDeOficinas(leer.nextInt());
        System.out.print("---> Ingrese el número de personas que estarán en cada oficina: ");
        edo1.setCantidadDePersonas(leer.nextInt());
        System.out.print("---> Ingrese el ancho del Edificio de Oficinas: ");
        edo1.setAncho(leer.nextDouble());
        System.out.print("---> Ingrese el alto del Edificio de Oficinas: ");
        edo1.setAlto(leer.nextDouble());
        System.out.print("---> Ingrese el largo del Edificio de Oficinas: ");
        edo1.setLargo(leer.nextDouble());
        return edo1;

    }

    public void tipoDeEdificio(int tipoDeEdificio) {
        switch (tipoDeEdificio) {
            case 1:
                Polideportivo pd1 = crearPolideportivo();
                registrosDeEdificios.add(pd1);
                break;
            case 2:
                EdificioDeOficinas edo1 = crearEdificioDeOficinas();
                registrosDeEdificios.add(edo1);
                break;
        }
    }

    public void menu() {
        boolean menu = true;
        int seleccionarTipoEdificio = 0;
        while (menu) {
            System.out.println(">> 1: Crea un nuevo edificio | 2: Ve el registro de edificios | 3: Salir");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println(">> 1: Crea un polideportivo | 2: Crea un edificio de oficinas");
                    System.out.print("---> Seleccione: ");
                    seleccionarTipoEdificio = leer.nextInt();
                    while (seleccionarTipoEdificio != 1 && seleccionarTipoEdificio != 2) {
                        System.out.println("Incorrecto, vuelva a ingresar");
                        System.out.println(">> 1: Crea un polideportivo | 2: Crea un edificio de oficinas");
                        System.out.print("---> Seleccione: ");
                        seleccionarTipoEdificio = leer.nextInt();
                    }
                    tipoDeEdificio(seleccionarTipoEdificio);
                    break;
                case 2:
                    for (Edificio registroDeEdificio : registrosDeEdificios) {
                        registroDeEdificio.calcularSuperficie();
                        registroDeEdificio.calcularVolumen();
                        registroDeEdificio.mostratInformacion();
                        if (registroDeEdificio instanceof EdificioDeOficinas) {
                            ((EdificioDeOficinas) registroDeEdificio).cantPersonas();
                        }
                    }
                    int[] cantTiposPolideportivos = cantTiposPolideportivos(registrosDeEdificios);
                    mostrarCantTiposPolideportivos(cantTiposPolideportivos);
                    break;
                case 3:
                    System.out.println("Ha salido del programa...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }

    }

    public int[] cantTiposPolideportivos(List<Edificio> edificios) {
        int[] cantTipo = new int[2];
        int techado = 0;
        int abierto = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techado++;
                } else {
                    abierto++;
                }
            }
        }
        cantTipo[0] = techado;
        cantTipo[1] = abierto;
        return cantTipo;
    }

    public void mostrarCantTiposPolideportivos(int[] cantTipo) {
        System.out.println("### Tipos de polideportivos ###");
        System.out.println(">> " + cantTipo[0] + " techados");
        System.out.println(">> " + cantTipo[1] + " abiertos");
        System.out.println("...");
    }

}

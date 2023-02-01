package entidad;

import java.util.Scanner;

public class Residencia extends ExtraHotel {

    private int cantHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public boolean campoDeportivoONo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean siONo = false;
        boolean menu = true;
        System.out.println(">> ¿Tendrá campo deportivo? ");
        while (menu) {
            System.out.println(">> 1: Si | 2: No");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    siONo = true;
                    menu = false;
                    break;
                case 2:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }

        }
        return siONo;
    }

    public boolean descuentoONo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean siONo = false;
        boolean menu = true;
        System.out.println(">> ¿Tendrá descuento? ");
        while (menu) {
            System.out.println(">> 1: Si | 2: No");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    siONo = true;
                    menu = false;
                    break;
                case 2:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }

        }
        return siONo;
    }

    @Override
    public boolean privadoONo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean siONo = false;
        boolean menu = true;
        System.out.println(">> ¿Será privado? ");
        while (menu) {
            System.out.println(">> 1: Si | 2: No");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    siONo = true;
                    menu = false;
                    break;
                case 2:
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }

        }
        return siONo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" ### Información de la Residencia " + nombre + " ###");
        System.out.println(">> La residencia tiene " + cantHabitaciones + " habitaciones");
        if (descuento) {
            System.out.println(">> La residencia hace descuentos");
        } else {
            System.out.println(">> La residencia no hace descuentos");
        }
        if (campoDeportivo) {
            System.out.println(">> La residencia tiene campo deportivo");
        } else {
            System.out.println(">> La residencia no tiene campo deportivo");
        }
        if (privado) {
            System.out.println(">> La residencia es privada");
        } else {
            System.out.println(">> La residencia no es privada");
        }
        System.out.println(">> " + direccion + " es la dirección de la residencia");
        System.out.println(">> " + localidad + " es la localidad de la residencia");
        System.out.println(">> " + gerente + " es el gerente de la residencia");
        System.out.println("...");
    }

}

package entidad;

import java.util.Scanner;

public class Camping extends ExtraHotel {

    private int cantMaximaCarpas;
    private int cantBanhosDisponibles;
    private boolean restaurante; //True es si tiene y false si no

    public Camping() {
    }

    public Camping(int cantMaximaCarpas, int cantBanhosDisponibles, boolean restaurante, boolean privado, String nombre, String direccion, String localidad, String gerente) {
        super(privado, nombre, direccion, localidad, gerente);
        this.cantMaximaCarpas = cantMaximaCarpas;
        this.cantBanhosDisponibles = cantBanhosDisponibles;
        this.restaurante = restaurante;
    }

    public int getCantMaximaCarpas() {
        return cantMaximaCarpas;
    }

    public void setCantMaximaCarpas(int cantMaximaCarpas) {
        this.cantMaximaCarpas = cantMaximaCarpas;
    }

    public int getCantBanhosDisponibles() {
        return cantBanhosDisponibles;
    }

    public void setCantBanhosDisponibles(int cantBanhosDisponibles) {
        this.cantBanhosDisponibles = cantBanhosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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

    public boolean restauranteONo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean siONo = false;
        boolean menu = true;
        System.out.println(">> ¿Tendrá restaurante? ");
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
        System.out.println(" ### Información del Camping " + nombre + " ###");
        System.out.println(">> Tiene " + cantMaximaCarpas + " carpas ");
        System.out.println(">> Tiene " + cantBanhosDisponibles + " baños disponibles");
        if (restaurante) {
            System.out.println(">> Tiene restaurante: ");
        } else {
            System.out.println(">> No tiene restaurant: e");
        }
        if (privado) {
            System.out.println(">> Es privado");
        } else {
            System.out.println(">> No es privado");
        }
        System.out.println(">> " + direccion + " es la dirección del Camping");
        System.out.println(">> " + localidad + " es la localidad del Camping");
        System.out.println(">> " + gerente + " es el gerente del Camping");
        System.out.println("...");
    }

}

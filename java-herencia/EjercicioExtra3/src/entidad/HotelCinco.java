package entidad;

import java.util.Scanner;

public class HotelCinco extends HotelCuatro {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimusinas;

    public HotelCinco() {
    }

    public HotelCinco(int cantSalonesConferencia, int cantSuites, int cantLimusinas, char gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numeroCamas, int cantPisos, Double precioPorHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroCamas, cantPisos, precioPorHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimusinas() {
        return cantLimusinas;
    }

    public void setCantLimusinas(int cantLimusinas) {
        this.cantLimusinas = cantLimusinas;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioPorHabitaciones() {
        return precioPorHabitaciones;
    }

    public void setPrecioPorHabitaciones(Double precioPorHabitaciones) {
        this.precioPorHabitaciones = precioPorHabitaciones;
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

    @Override
    public double precioPorHabitacion() {
        double capacidadRestaurante = 0;
        double categoriaGimnasio = 0;
        double categoriaLimusina;
        if (this.capacidadRestaurante < 10) {
            capacidadRestaurante = 10;
        } else if (this.capacidadRestaurante >= 30 && this.capacidadRestaurante <= 50) {
            capacidadRestaurante = 30;
        } else {
            capacidadRestaurante = 50;
        }
        String gimnasio = String.valueOf(this.gimnasio); //Convierto el char de gimnasio a String
        if (gimnasio.equalsIgnoreCase("A")) {
            categoriaGimnasio = 50;
        } else {
            categoriaGimnasio = 30;
        }
        categoriaLimusina = this.cantLimusinas * 15;
        return 50 + (1 * numeroCamas) + capacidadRestaurante + categoriaGimnasio + categoriaLimusina;
    }

    @Override
    public char categoriaGimnasio() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        char categoria = 0;
        System.out.println(">> Seleccione la categoría del Gimnasio");
        while (menu) {
            System.out.println(">> Hay 2 opciones, 1: A | 2: B");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    categoria = 'A';
                    menu = false;
                    break;
                case 2:
                    categoria = 'B';
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelve al menú");
                    break;
            }
        }
        return categoria;

    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" ### Información del hotel " + nombre + " ###");
        System.out.println(">> El gimnasio es categoría " + gimnasio);
        System.out.println(" >> " + nombreRestaurante + " es el nombre del restaurante");
        System.out.println(">> " + capacidadRestaurante + " es la capacidad el restaurante");
        System.out.println(">> Tiene " + cantHabitaciones + " habitaciones");
        System.out.println(">> Tiene " + numeroCamas + " camas");
        System.out.println(">> Tiene " + cantPisos + " pisos");
        System.out.println(">> Tiene " + cantSalonesConferencia + " salones para conferencia");
        System.out.println(">> Tiene " + cantSuites + " suites");
        System.out.println(">> Tiene " + cantLimusinas + " limusinas");
        System.out.println(">> " + direccion + " es la dirección del Hotel");
        System.out.println(">> " + localidad + " es la localidad del Hotel");
        System.out.println(">> " + gerente + " es el gerente del Hotel");
        System.out.println(">> El precio de la habitación $" + precioPorHabitaciones);
        System.out.println("...");
    }

}

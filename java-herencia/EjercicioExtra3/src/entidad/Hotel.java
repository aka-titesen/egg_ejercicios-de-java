package entidad;

public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones; //Cantidad de habitaciones
    protected int numeroCamas; //Números de camas
    protected int cantPisos; //Cantidad de pisos
    protected Double precioPorHabitaciones; //Precio por habitaciones

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numeroCamas, int cantPisos, Double precioPorHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioPorHabitaciones = precioPorHabitaciones;
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

}

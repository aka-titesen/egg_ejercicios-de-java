package entidad;

import java.time.LocalDate;

public abstract class Alquiler {

    //Datos del cliente
    protected String nombreCliente;
    protected Integer dniCliente;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int posicionAmarre;
    protected double precio;
    //Datos generales de los barcos
    protected String matricula;
    protected int eslora;
    protected LocalDate anhoFabricacion;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer dniCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, double precio, String matricula, int eslora, LocalDate anhoFabricacion) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.precio = precio;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(LocalDate anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public abstract double precioBase();

    public abstract void mostrarInformacion();
}

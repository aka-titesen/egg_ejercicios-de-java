package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Yate extends Alquiler {

    private int cv;
    private int camarotes;

    public Yate() {
    }

    public Yate(int cv, int camarotes, String nombreCliente, Integer dniCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, double precio, String matricula, int eslora, LocalDate anhoFabricacion) {
        super(nombreCliente, dniCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, precio, matricula, eslora, anhoFabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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

    @Override
    public double precioBase() {
        return (ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion)) * (eslora * 10) + (cv + camarotes);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" ### Yate ###");
        System.out.println(">> Alquilador por " + nombreCliente + " ...");
        System.out.println(">> DNI " + dniCliente + "...");
        System.out.println(">> Fecha de alquiler " + fechaAlquiler + "...");
        System.out.println(">> Fecha de devolución " + fechaDevolucion + "...");
        System.out.println(">> Posición de amarre " + posicionAmarre + "...");
        System.out.println(">> Precio $" + precio + "...");
        System.out.println(">> Matricula " + matricula + "...");
        System.out.println(">> Eslora " + eslora + "...");
        System.out.println(">> Año de fabricación " + anhoFabricacion.getYear() + "...");
        System.out.println(">> Potencia en caballos " + cv + "...");
        System.out.println(">> Número de camarotes " + camarotes + "...");
        System.out.println("...");
    }

}

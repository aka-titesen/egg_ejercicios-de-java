package entidad;

import java.time.LocalDate;

public abstract class Empleado extends Persona {

    protected LocalDate anhoIncorporacion;
    protected int despacho;

    public Empleado(LocalDate anhoIncorporacion, int despacho) {
        this.anhoIncorporacion = anhoIncorporacion;
        this.despacho = despacho;
    }

    public Empleado(LocalDate anhoIncorporacion, int despacho, String nombre, String apellido, String estadoCivil) {
        super(nombre, apellido, estadoCivil);
        this.anhoIncorporacion = anhoIncorporacion;
        this.despacho = despacho;
    }

    public Empleado() {
    }

    public LocalDate getAnhoIncorporacion() {
        return anhoIncorporacion;
    }

    public void setAnhoIncorporacion(LocalDate anhoIncorporacion) {
        this.anhoIncorporacion = anhoIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public abstract String estadoCivil();

    @Override
    public abstract void mostrarInformacion();

}

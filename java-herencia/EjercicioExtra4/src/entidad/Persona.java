package entidad;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String estadoCivil;
    protected int id;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
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

    public abstract String estadoCivil();

    public abstract void mostrarInformacion();

}

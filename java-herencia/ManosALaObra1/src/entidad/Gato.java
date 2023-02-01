package entidad;

public class Gato extends Animal {

    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(String raza, String nombre, String duenho, Integer edad) {
        super(nombre, duenho, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenho() {
        return duenho;
    }

    public void setDuenho(String duenho) {
        this.duenho = duenho;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + '}';
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau!, miau!, miau!");
    }
}

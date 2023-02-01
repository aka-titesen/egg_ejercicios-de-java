package entidad;

public class Animal {

    protected String nombre;
    protected String duenho;
    protected Integer edad;

    public Animal() {
    }

    public Animal(String nombre, String duenho, Integer edad) {
        this.nombre = nombre;
        this.duenho = duenho;
        this.edad = edad;
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
        return "Animal{" + "nombre=" + nombre + ", duenho=" + duenho + ", edad=" + edad + '}';
    }

    public void hacerRuido() {
        System.out.println("Hola");
    }
}

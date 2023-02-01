package Clase;

public class Persona {

    private String nombre;
    private int edad;
    private String Sexo;
    private double altura;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, int edad, String Sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", Sexo=" + Sexo + ", altura=" + altura + ", peso=" + peso + '}';
    }

}

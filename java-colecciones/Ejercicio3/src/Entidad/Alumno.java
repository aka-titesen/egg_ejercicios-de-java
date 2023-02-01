package Entidad;

import java.util.List;

public class Alumno {

    private String nombre;
    private List<Integer> Notas;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> Notas) {
        this.nombre = nombre;
        this.Notas = Notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(List<Integer> Notas) {
        this.Notas = Notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Notas=" + Notas + '}';
    }

}

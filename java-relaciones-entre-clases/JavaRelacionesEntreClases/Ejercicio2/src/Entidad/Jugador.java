package Entidad;

public class Jugador {

    private Integer id;
    private String Nombre;
    private Boolean mojado;

    //Constructor vacio y constructor lleno
    public Jugador() {
    }

    public Jugador(Integer id, String Nombre, Boolean mojado) {
        this.id = id;
        this.Nombre = Nombre;
        this.mojado = mojado;
    }
    //Método get & set

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
//Método toString

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", Nombre=" + Nombre + ", mojado=" + mojado + '}';
    }

}

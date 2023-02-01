package Entidad;

import java.util.List;

public class Baraja {

    private List<Carta> baraja;

    //Constructor vacio y lleno
    public Baraja() {
    }

    public Baraja(List<Carta> baraja) {
        this.baraja = baraja;
    }
    //Método get & set

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    //Método toString
    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
}

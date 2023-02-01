package Entidad;

import java.util.List;

public class Mano {

    private List<Carta> barajaMano;

    public Mano() {
    }

    public Mano(List<Carta> barajaMano) {
        this.barajaMano = barajaMano;
    }

    public List<Carta> getBarajaMano() {
        return barajaMano;
    }

    public void setBarajaMano(List<Carta> barajaMano) {
        this.barajaMano = barajaMano;
    }

    @Override
    public String toString() {
        return "Mano{" + "barajaMano=" + barajaMano + '}';
    }

}

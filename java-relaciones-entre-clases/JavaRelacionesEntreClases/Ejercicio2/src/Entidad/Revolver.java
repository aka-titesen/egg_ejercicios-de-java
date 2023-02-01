package Entidad;

public class Revolver {

    private int posicionDisparo;
    private int posicionAgua;

    //Constructor vacio y constructor lleno
    public Revolver() {
    }

    public Revolver(int posicionDisparo, int posicionAgua) {
        this.posicionDisparo = posicionDisparo;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionDisparo() {
        return posicionDisparo;
    }

    public void setPosicionDisparo(int posicionDisparo) {
        this.posicionDisparo = posicionDisparo;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    //Métodos get & set
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //Método toString
    @Override
    public String toString() {
        return "\n ### El agua estaba en el tambor " + posicionAgua + " y el cañon estaba en el tambor " + posicionDisparo + " ###";
    }

}

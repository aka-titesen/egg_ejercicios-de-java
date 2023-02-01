package Clase;

public class Ahorcado {

    private String[] palabra;
    private int cantidadLetrasEcontradas;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadLetrasEcontradas, int intentos) {
        this.palabra = palabra;
        this.cantidadLetrasEcontradas = cantidadLetrasEcontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetrasEcontradas() {
        return cantidadLetrasEcontradas;
    }

    public void setCantidadLetrasEcontradas(int cantidadLetrasEcontradas) {
        this.cantidadLetrasEcontradas = cantidadLetrasEcontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidadLetrasEcontradas=" + cantidadLetrasEcontradas + ", intentos=" + intentos + '}';
    }

}

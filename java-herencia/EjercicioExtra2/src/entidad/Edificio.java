package entidad;

public abstract class Edificio {

    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();
    
    public abstract void mostratInformacion();
}

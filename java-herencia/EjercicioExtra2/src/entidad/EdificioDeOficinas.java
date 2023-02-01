package entidad;

public class EdificioDeOficinas extends Edificio {

    private int numeroDeOficinas; //Por piso
    private int cantidadDePersonas; //Por oficina
    private int numeroDepisos; //Pisos total en el edificio

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePersonas, int numeroDepisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroDepisos = numeroDepisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumeroDepisos() {
        return numeroDepisos;
    }

    public void setNumeroDepisos(int numeroDepisos) {
        this.numeroDepisos = numeroDepisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println(" ### Cálculo de superficie ### ");
        System.out.println(">> La superficie de éste edificio es :" + (6 * (ancho * alto)) + " Cm2 ");
        System.out.println("...");
    }

    @Override
    public void calcularVolumen() {
        System.out.println(" ### Cálculo de Volumen ### ");
        System.out.println(">> El volumen del edificio es: " + (Math.pow((ancho * alto), 3)) + " m3 ");
        System.out.println("...");
    }

    @Override
    public void mostratInformacion() {
        System.out.println("### Registro de Edificio De Oficinas ###");
        System.out.println(">> Número de oficinas " + numeroDeOficinas);
        System.out.println(">> Cantidad de personas por oficinas " + cantidadDePersonas);
        System.out.println(">> Número total de pisos en el edificio " + numeroDepisos);
        System.out.println(">> El ancho del edificio de oficinas " + ancho);
        System.out.println(">> El alto del edificio de oficinas " + alto);
        System.out.println(">> El largo del edificio de oficinas " + largo);
        System.out.println("...");
    }

    public void cantPersonas() {
        System.out.println(" ### Cantidad de personas en total que trabajan en éste edificios ### ");
        System.out.println(">> " + (numeroDepisos * numeroDeOficinas) * cantidadDePersonas + " personas");
        System.out.println("...");
    }
}

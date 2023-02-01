package entidad;

import java.util.Scanner;

public class Polideportivo extends Edificio {

    private String nombrePolideportivo;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombrePolideportivo, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombrePolideportivo = nombrePolideportivo;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombrePolideportivo() {
        return nombrePolideportivo;
    }

    public void setNombrePolideportivo(String nombrePolideportivo) {
        this.nombrePolideportivo = nombrePolideportivo;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
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
        System.out.println("### Registro de Polideportivo ###");
        System.out.println(">> Nombre del polideportivo " + nombrePolideportivo);
        System.out.println(">> Tipo de instalacion " + tipoInstalacion);
        System.out.println(">> El ancho del polideportivo " + ancho);
        System.out.println(">> El alto del polideportivo " + alto);
        System.out.println(">> El largo del polideportivo " + largo);
        System.out.println("...");
    }

    public String tipoPolideportivo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        String tipoPolideportivo = "";
        System.out.println("--> Seleccione el polideportivo");
        while (menu) {
            System.out.println("---> 1: Techado | 2: Abierto");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    tipoPolideportivo = "Techado";
                    menu = false;
                    break;
                case 2:
                    tipoPolideportivo = "Abierto";
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, seleccione de nuevo");
                    break;
            }
        }
        return tipoPolideportivo;
    }
}

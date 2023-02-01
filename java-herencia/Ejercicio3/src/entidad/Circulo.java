package entidad;

import interfaz.CalculoCirculo;
import java.util.Scanner;

public class Circulo implements CalculoCirculo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private double radio;
    private double perimetro;
    private double area;

    //Constructores
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double perimetro, double area) {
        this.radio = radio;
        this.perimetro = perimetro;
        this.area = area;
    }
    //Get & set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    //toString

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    //Métodos propios
    //--------------------------------------------------------------------------
    public Circulo crearCirculo() {
        System.out.print("Informe el radio del circulo: ");
        double radio = leer.nextDouble();
        return new Circulo(radio);
    }

    @Override
    public void perimetroCirculo() {
        this.perimetro = Math.round(2 * Math.PI * this.radio);
    }

    @Override
    public void areaCirculo() {
        this.area = Math.round(Math.PI * (Math.pow(this.radio, 2)));
    }

}

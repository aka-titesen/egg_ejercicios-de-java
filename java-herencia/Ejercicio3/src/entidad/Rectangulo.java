package entidad;

import interfaz.CalculoRectangulo;
import java.util.Scanner;

public class Rectangulo implements CalculoRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private double base;
    private double altura;
    private double perimetro;
    private double area;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, double perimetro, double area) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    //Get & set
    public void setArea(double area) {
        this.area = area;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", area=" + area + '}';
    }

    //Métodos propios
    //--------------------------------------------------------------------------
    public Rectangulo crearRectangulo() {
        System.out.print("Informe la base del rectángulo: ");
        double base = leer.nextDouble();
        System.out.print("Informe la altura del rectángulo: ");
        double altura = leer.nextDouble();
        return new Rectangulo(base, altura);
    }

    @Override
    public void perimetroRectangulo() {
        this.perimetro = (this.base + this.altura) * 2;
    }

    @Override
    public void areaRectangulo() {
        this.area = this.base * this.altura;
    }
}

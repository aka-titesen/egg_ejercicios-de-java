package entidad;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double precio;
    protected String color;
    protected char consumoEletrico;
    protected Double peso;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEletrico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEletrico = consumoEletrico;
        this.peso = peso;
    }
    //Get & Set

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEletrico() {
        return consumoEletrico;
    }

    public void setConsumoEletrico(char consumoEletrico) {
        this.consumoEletrico = consumoEletrico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    //Métodos propios
    //--------------------------------------------------------------------------
    protected char comprobarConsumoEnergetico(char consumoEletrico) {
        char auxiliar = 0;
        boolean letraCorrecta = false;
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        String stringValueOf = String.valueOf(consumoEletrico); //Convierto char a String para hacer las comparaciones
        for (int i = 0; i < letras.length; i++) {
            if (stringValueOf.equalsIgnoreCase(letras[i])) {
                letraCorrecta = true;
                break;
            }
        }
        if (letraCorrecta) {
            auxiliar = consumoEletrico;
        } else {
            auxiliar = "F".charAt(0);
        }
        return auxiliar;
    }

    protected String comprobarColor(String color) {
        String auxiliar = "";
        boolean colorCorrecto = false;
        String[] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                colorCorrecto = true;
                break;
            }
        }
        if (colorCorrecto) {
            auxiliar = color;
        } else {
            auxiliar = "BLANCO";
        }
        return auxiliar;
    }

    public Electrodomestico crearElectrodomestico() {
        Double precio = 1000d;
        System.out.print("Informe el peso: ");
        Double peso = leer.nextDouble();
        System.out.print("Informe el color: ");
        String color = comprobarColor(leer.next());
        System.out.print("Informe el consumo energético: ");
        char consumoEléctrico = leer.next().charAt(0);
        return new Electrodomestico(precio, color, consumoEléctrico, peso);
    }

    public void precioFinal() {

        String stringValueOf = String.valueOf(consumoEletrico); //Convierto char a String para hacer las comparaciones

        if (stringValueOf.equalsIgnoreCase("A")) {
            precio += 1000;
        } else if (stringValueOf.equalsIgnoreCase("B")) {
            precio += 800;
        } else if (stringValueOf.equalsIgnoreCase("C")) {
            precio += 600;
        } else if (stringValueOf.equalsIgnoreCase("D")) {
            precio += 500;
        } else if (stringValueOf.equalsIgnoreCase("E")) {
            precio += 300;
        } else {
            precio += 100;
        }

        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else {
            precio += 1000;
        }
        System.out.println("El precio final es: " + precio);
    }
}

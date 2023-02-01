package entidad;

public class Lavadora extends Electrodomestico {

    private Double carga;
    //Constructores

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char consumoEletrico, Double peso) {
        super(precio, color, consumoEletrico, peso);
        this.carga = carga;
    }
    //Get & set

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

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
    @Override
    public Lavadora crearElectrodomestico() {
        Double precio = 1000d;
        System.out.print("Informe el peso: ");
        Double peso = leer.nextDouble();
        System.out.print("Informe el color: ");
        String color = comprobarColor(leer.next());
        System.out.print("Informe el consumo energético: ");
        char consumoEléctrico = leer.next().charAt(0);
        System.out.print("Informe la carga de la lavadora: "); //Agrego la carga
        Double carga = leer.nextDouble();
        return new Lavadora(carga, precio, color, consumoEletrico, peso);
    }

    public Lavadora crearLavadora() {
        return crearElectrodomestico();
    }

    @Override
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

        if (carga > 30) {
            precio += 500;
        }
        System.out.println("> El precio final de la lavadora será: $" + precio);
    }

}

package entidad;

public class Televisor extends Electrodomestico {

    private Double pulgadas;
    private boolean tdt;
    //Constructores

    public Televisor() {
    }

    public Televisor(Double pulgadas, boolean tdt) {
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public Televisor(Double pulgadas, boolean tdt, Double precio, String color, char consumoEletrico, Double peso) {
        super(precio, color, consumoEletrico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
    //Get & set

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
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
    public Televisor crearElectrodomestico() {
        boolean menu = true;
        char pregunta = 0;
        boolean tdt = false;
        Double precio = 1000d;
        System.out.print("Informe el peso: ");
        Double peso = leer.nextDouble();
        System.out.print("Informe el color: ");
        String color = comprobarColor(leer.next());
        System.out.print("Informe el consumo energético: ");
        char consumoElectrico = leer.next().charAt(0);
        System.out.print("Informe la pulgadas: ");
        Double pulgadas = leer.nextDouble();
        System.out.print("Informe si tiene tdt: ");
        while (menu) {
            System.out.print("Responder s/n: ");
            pregunta = leer.next().charAt(0);
            switch (String.valueOf(pregunta).toUpperCase()) {
                case "S":
                    tdt = true;
                    menu = false;
                    break;
                case "N":
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta vuelva a elegir");
            }
        }
        return new Televisor(pulgadas, tdt, precio, color, consumoElectrico, peso);
    }

    public Televisor crearTelevisor() {
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

        if (pulgadas > 40) {
            precio += (precio * 0.3);
        }
        if (tdt) {
            precio += 500;
        }
        System.out.println("> El precio final del televisor será: $" + precio);
    }
}

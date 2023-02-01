package Servicio;

import Clase.Persona;
import java.util.Scanner;

public class ServicioDePersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona1 = new Persona();
        System.out.print("Ingrese el nombre de la persona:");
        persona1.setNombre(leer.next());
        System.out.print("Ingrese la edad de la persona:");
        persona1.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo de la persona, H o M:");
            persona1.setSexo(leer.next());
        } while (!persona1.getSexo().equalsIgnoreCase("M") && !persona1.getSexo().equalsIgnoreCase("H"));
        //Altura
        System.out.print("Ingrese la altura de la persona:");
        persona1.setAltura(leer.nextDouble());
        //Peso
        System.out.print("Ingrese el peso de la persona:");
        persona1.setPeso(leer.nextDouble());
        return persona1;
    }

    public static int calcularIMC(Persona persona1) {
        System.out.println("========= Datos de " + persona1.getNombre() + " =========");
        System.out.println("Ésta persona pesa " + persona1.getPeso());
        System.out.println("Ésta persona mide " + persona1.getAltura());
        int verificacion = 0;
        double imc = persona1.getPeso() / (Math.pow(persona1.getAltura(), 2));
        if (imc < 20) {
            verificacion = -1;
        } else if (imc >= 20 && imc <= 25) {
            verificacion = 0;
        } else if (imc > 25) {
            verificacion = 1;
        }
        return verificacion;
    }

    public static boolean mayorDeEdad(Persona persona1) {
        boolean verificacion = false;
        if (persona1.getEdad() >= 18) {
            verificacion = true;
        } else {
            verificacion = false;
        }
        return verificacion;
    }

    public static void calcularIMCPorcentaje(double imc1, double imc2, double imc3, double imc4) {
        double porcentajeBajoImc = 0;
        double porcentajeNormallImc = 0;
        double porcentajeAltoImc = 0;
        int bajoImc = 0;
        int normalImc = 0;
        int altoImc = 0;
        double[] vectorImc = new double[4];
        vectorImc[0] = imc1;
        vectorImc[1] = imc2;
        vectorImc[2] = imc3;
        vectorImc[3] = imc4;
        for (int i = 0; i < 4; i++) {
            if (vectorImc[i] == -1) {
                bajoImc++;
            } else if (vectorImc[i] == 0) {
                normalImc++;
            } else if (vectorImc[i] == 1) {
                altoImc++;
            }
        }
        porcentajeBajoImc = (bajoImc * 100) / 4;
        System.out.println("El porcentaje con el IMC bajo es: " + porcentajeBajoImc + "%");
        porcentajeNormallImc = (normalImc * 100) / 4;
        System.out.println("El porcentaje con el IMC normal es: " + porcentajeNormallImc + "%");
        porcentajeAltoImc = (altoImc * 100) / 4;
        System.out.println("El porcentaje con el IMC alto es: " + porcentajeAltoImc + "%");

    }

    public static void calcularEdadPorcentaje(boolean edad1, boolean edad2, boolean edad3, boolean edad4) {
        double porcentajeMenores = 0;
        double porcentajeMayores = 0;
        double menores = 0;
        double mayores = 0;
        boolean[] vectorEdad = new boolean[4];
        vectorEdad[0] = edad1;
        vectorEdad[1] = edad2;
        vectorEdad[2] = edad3;
        vectorEdad[3] = edad4;
        for (int i = 0; i < 4; i++) {
            if (vectorEdad[i] == true) {
                mayores++;
            } else {
                menores++;
            }
        }
        porcentajeMayores = (mayores * 100) / 4;
        System.out.println("El porcentaje de los mayores de edad es: " + porcentajeMayores + "%");
        porcentajeMenores = (menores * 100) / 4;
        System.out.println("El porcentaje de los menores de edad es: " + porcentajeMenores + "%");
    }
}

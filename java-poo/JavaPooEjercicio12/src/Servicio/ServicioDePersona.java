package Servicio;

import Clase.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicioDePersona {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p1 = new Persona();
        System.out.print("Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.print("Ingrese el año de nacimiento:");
        int anio = leer.nextInt() - 1900;
        System.out.print("Ingrese el mes de nacimiento de forma númerica: ");
        int mes = leer.nextInt() - 1;
        System.out.print("Ingrese el dia de nacimiento de forma númerica: ");
        int dia = leer.nextInt();
        Date fechaDeNacimiento = new Date(anio, mes, dia);
        p1.setFechaDeNacimiento(fechaDeNacimiento);
        return p1;
    }

    public static String fechaPersonalizada(Persona p1) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaPersonalizada = sdf.format(p1.getFechaDeNacimiento());
        return fechaPersonalizada;
    }

    public static int calcularEdad(Persona p1) {
        Date fechaActual = new Date();
        return fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();

    }

    public static boolean menorQue(Persona p1, int edad) {
        int edadDeLaPersona = calcularEdad(p1);
        boolean verificacion = false;
        if (edad < edadDeLaPersona) {
            verificacion = true;
        }
        return verificacion;

    }

    public static void imprimirInformacionDeLaPersona(Persona p1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("========= Datos de la persona =========");
        String fechaPersonalizada = fechaPersonalizada(p1);
        System.out.println(p1.getNombre() + " nació el " + fechaPersonalizada + " y actualmente tiene " + calcularEdad(p1) + " años");
        System.out.print("Ingresé una edad para comparar con la persona:");
        int edad = leer.nextInt();
        boolean verificacion = menorQue(p1, edad);
        if (verificacion) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }
    }
}

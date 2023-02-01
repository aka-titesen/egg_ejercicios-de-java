package Servicio;

import Clase.CuentaBancaria;
import java.util.Scanner;

public class ServicioDeCuentaBancaria {

    public CuentaBancaria crearCuentaBancaria() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancaria cb1 = new CuentaBancaria();
        System.out.print("Ingrese su DNI:");
        cb1.setDNI(leer.nextLong());
        System.out.print("Ingrese su número de cuenta:");
        cb1.setnumeroDeCuenta(leer.nextInt());
        System.out.print("Ingrese su saldo actual :$");
        cb1.setsaldoActual(leer.nextInt());
        return cb1;
    }

    public static void ingresoDeDinero(CuentaBancaria cb1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("¿Cuánto dinero desea ingresar a su cuenta?:");
        int nuevoMonto = leer.nextInt();
        int saldoActual = cb1.getsaldoActual();
        cb1.setsaldoActual(saldoActual + nuevoMonto);
    }

    public static void retiroDeDinero(CuentaBancaria cb1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("¿Cuánto dinero desea retirar de su cuenta?:");
        int nuevoMonto = leer.nextInt();
        int saldoActual = cb1.getsaldoActual();
        if (saldoActual == 0) {
            System.out.println("No sé pueda retirar porque su saldo es 0");
        } else if (nuevoMonto <= saldoActual) {
            cb1.setsaldoActual(saldoActual - nuevoMonto);
        } else {
            System.out.println("No se puede retirar más de lo que tiene su cuenta");
        }
    }

    public static void rapidaExtraccion(CuentaBancaria cb1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int saldoActual = cb1.getsaldoActual();
        System.out.print("Solo puedes sacar el 20% de su saldo actual, ¿Cuánto dinero deseas retirar?:");
        int nuevoMonto = leer.nextInt();
        int vientePorciento = (saldoActual * 20) / 100;
        if (nuevoMonto <= vientePorciento) {
            cb1.setsaldoActual(saldoActual - nuevoMonto);
        } else {
            System.out.println("El saldo ingresado es mayor al 20%");
        }

    }

    public static int balanceDeLaCuenta(CuentaBancaria cb1) {
        int saldoActual = cb1.getsaldoActual();
        return saldoActual;
    }

    public static void imprimirLaCuenta(CuentaBancaria cb1) {
        System.out.println("========= DATOS DE LA CUENTA =========");
        System.out.println("El número de la cuenta es: " + cb1.getnumeroDeCuenta());
        System.out.println("El DNI del cliente es: " + cb1.getDNI());
        System.out.println("El saldo actual es: " + cb1.getsaldoActual());
    }
}

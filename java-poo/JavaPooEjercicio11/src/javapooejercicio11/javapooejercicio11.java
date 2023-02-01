package javapooejercicio11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class javapooejercicio11 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int anio = 1998 - 1900;
        int mes = 1 - 1;
        int dia = 21;
        Date fechaDeNacimiento = new Date(anio, mes, dia);
        System.out.println("Mi fecha de nacimiento es: " + sdf.format(fechaDeNacimiento));
        System.out.println("");
        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + sdf.format(fechaActual));
        switch (fechaActual.compareTo(fechaDeNacimiento)) {
            case 1:
                System.out.println("Es más reciente");
                break;
            case 0:
                System.out.println("Es hoy");
                break;
            case -1:
                System.out.println("Es más del pasado");
                break;
        }
        System.out.println("");
        System.out.println("Tengo " + (fechaActual.getYear() - fechaDeNacimiento.getYear()) + " años");
    }

}

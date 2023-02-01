package Servicio;

import Clase.Mes;
import java.util.Scanner;

public class ServicioDeMes {

    public Mes crearMes() {
        Mes m1 = new Mes();
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        m1.setMes(meses);
        return m1;
    }

    public static void descubraElMesSecreto(Mes m1) {
        String[] meses = new String[m1.getMes().length];
        System.arraycopy(m1.getMes(), 0, meses, 0, meses.length);
        int aleatorio = (int) (Math.random() * 12);
        String mesSecreto = meses[aleatorio];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("========= Ingrese el mes secreto =========");
        String auxiliar = leer.next();
        while (!mesSecreto.equalsIgnoreCase(auxiliar)) {
            System.out.println("No has acertado");
            aleatorio = (int) (Math.random() * 12);
            mesSecreto = meses[aleatorio];
            System.out.println("Ingrese nuevamente un mes");
            auxiliar = leer.next();
        }
        if (mesSecreto.equalsIgnoreCase(auxiliar)) {
            System.out.println("Has acertado");
        }
    }
}

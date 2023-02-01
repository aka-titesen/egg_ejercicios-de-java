package Servicio;

import Clase.Matematica;

public class ServicioDeMatematica {

    public Matematica crearOperacion() {
        Matematica m1 = new Matematica();
        m1.setNumA(Math.random() * 9 + 1);
        m1.setNumB(Math.random() * 9 + 1);
        return m1;
    }

    public static int[] retornaElMayor(Matematica m1) {
        System.out.println("========= Número mayor =========");
        int[] numeros = new int[2];
        if (m1.getNumA() > m1.getNumB()) {
            numeros[0] = (int) m1.getNumA();
            numeros[1] = (int) m1.getNumB();
        } else {
            numeros[0] = (int) m1.getNumB();
            numeros[1] = (int) m1.getNumA();
        }
        System.out.println("El número mayor es " + numeros[0] + " y el menor es " + numeros[1]);
        System.out.println("");
        return numeros;
    }

    public static void calcularPotencia(int[] vector1) {
        System.out.println("========= Potencia entre el número mayor y el menor =========");
        int potencia = (int) Math.round((Math.pow(vector1[0], vector1[1])));
        System.out.println("La potencia es " + potencia);
        System.out.println("");
    }

    public static void calcularRaiz(int[] vector1) {
        System.out.println("========= Raíz cuadrado del número menor =========");
        double raiz = Math.round(Math.sqrt(vector1[1]));
        System.out.println("La raíz cuadrada es " + raiz);
        System.out.println("");
    }

}

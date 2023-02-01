package JavaGuia6;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio = leer.nextInt();
        //Inicializa un vector con un tamaño a traves de una función
        int[] vector = crearVector(tamanio);
        //Rellena un vector con un tamaño a traves de una función
        rellenarVector(vector);
        //Contabiliza cuantos números con un 1 digito y así hasta el 5
        contabilizar(vector);
    }

    public static int[] crearVector(int tamanio) {
        int[] vector = new int[tamanio];
        return vector;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);
        }
    }

    public static void contabilizar(int[] vector) {

        int numeros_un_digito = 0;
        int numeros_dos_digitos = 0;
        int numeros_tres_digitos = 0;
        int numeros_cuatro_digitos = 0;
        int numeros_cinco_digitos = 0;
        int digito = 0;
        int numero = 0;
        for (int i = 0; i < vector.length; i++) {
            digito = 0;
            numero = 0;
            numero = vector[i];
            while (numero != 0) {
                numero = numero / 10;
                digito++;
            }
            switch (digito) {
                case 1:
                    numeros_un_digito++;
                    break;
                case 2:
                    numeros_dos_digitos++;
                    break;
                case 3:
                    numeros_tres_digitos++;
                    break;
                case 4:
                    numeros_cuatro_digitos++;
                    break;
                case 5:
                    numeros_cinco_digitos++;
                    break;
            }
        }
        System.out.println("========= Cantidad de números según los digitos =========");
        System.out.println("    N° de 1 digitos: " + numeros_un_digito);
        System.out.println("    N° de 2 digitos: " + numeros_dos_digitos);
        System.out.println("    N° de 3 digitos: " + numeros_tres_digitos);
        System.out.println("    N° de 4 digitos: " + numeros_cuatro_digitos);
        System.out.println("    N° de 5 digitos: " + numeros_cinco_digitos);
    }
}

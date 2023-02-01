/*
CONSIGNA:
23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.  
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().  
 */
package javaintroextras;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23Extra {

    public static void main(String[] args) {
        juego();
    }

    public static void juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); // agregamos un Scanner para leer la respuesta del usuario
        boolean jugando = true;
        do { //Iniciamos el ciclo do-while
            String[][] sopaDeLetras = cargarMatriz();
            String[] vectorPalabra = cargarPalabra();
            int filaSorteada = getRandomNumber(0, 19);
            boolean comprobacionEspacio = comprobarEspacioMatriz(sopaDeLetras, vectorPalabra, filaSorteada);
            if (comprobacionEspacio) {
                sopaDeLetras = cargarPalabraEnMatriz(sopaDeLetras, vectorPalabra, filaSorteada);
                escribirMatriz(sopaDeLetras);
            } else {
                System.out.println("No hay espacio");
            }
            //Preguntamos al usuario si desea ingresar otra palabra
            System.out.print("¿Desea ingresar otra palabra? (s/n): ");
            String respuesta = leer.next();
            //Si la respuesta es "n", cambiamos el valor de la variable jugando a false para finalizar el ciclo
            if (respuesta.equalsIgnoreCase("n")) {
                jugando = false;
            }
        } while (jugando); //El ciclo se repite mientras jugando sea true
    }

    public static String[][] cargarMatriz() {
        //NxM 20 filas (n) y 20 columnas (m)
        return new String[20][20];
    }

    public static String[] cargarPalabra() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra = "";
        String[] vectorPalabra;
        //Do while para que el usuario ingrese la palabra, no pasará de acá hasta que ponga una palabra que sea mayor que 3 y menor que 5
        do {
            System.out.print("Ingresa varias palabras, haz un espacio entre cada palabra: ");
            palabra = leer.next();
            vectorPalabra = palabra.split("\\s+");
        } while (vectorPalabra.length < 1 || vectorPalabra.length > 20);
        return vectorPalabra;
    }

    public static String[][] cargarPalabraEnMatriz(String[][] matriz, String[] vectorPalabra, int filaSorteada) {
        for (int i = 0; i < vectorPalabra.length; i++) {
            if (matriz[filaSorteada][i] == null) {
                matriz[filaSorteada][i] = vectorPalabra[i];
            }
        }
        return matriz;
    }

    public static void escribirMatriz(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c] == null) {
                    System.out.print("[ * ]");
                } else {
                    System.out.print("[ " + matriz[f][c] + " ]");
                }
            }
            System.out.println("");
        }
    }

    public static boolean comprobarEspacioMatriz(String[][] sopaDeLetras, String[] vectorPalabra, int filaSorteada) {
        int contadorDeEspacio = 0;
        for (int i = 0; i < vectorPalabra.length; i++) {
            if (sopaDeLetras[filaSorteada][i] == null) {
                contadorDeEspacio++;
            }
        }
        if (contadorDeEspacio >= vectorPalabra.length) {
            return true;
        } else {
            return false;
        }
    }

    //Función que generará un número aleatorio a partir de un rango especificado (min y max) los extremos están incluidos
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        //Si quieres excluir el límite superior, solo tienes que cambiar la línea return r.nextInt((max - min) + 1) + min; por return r.nextInt(max - min) + min;.
        return r.nextInt((max - min) + 1) + min;
    }
}

/*CONSIGNA:
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java. 
 */
package javaintroextras;

import java.util.Random;

public class Ejercicio10Extra {

    public static void main(String[] args) {
        double multA = 0d;
        double multB = 0d;
        double resultado = 0d;
        double adivinar = 0d;
        int i = 0;

        do {
            multA = getRandomNumber(0, 10);
            multB = getRandomNumber(0, 10);
            resultado = multA * multB;
            if (adivinar == resultado) {
                System.out.println("");
                System.out.println("Ha acertado, finaliza la ejecución. El resutaldo era " + resultado + " lo logró en la vuelta N°: " + (i + 1));
                break;
            } else {
                if (i == 0) {
                    System.out.println("");
                    System.out.print("Vuelta N°: " + (i + 1) + ", probando un número para adivinar el resultado de la multiplicación: ");
                    adivinar = getRandomNumber(0, 100);
                } else {
                    System.out.println("");
                    System.out.print("Fallido, vuelta N°: " + (i + 1) + ", probando otro número para adivinar el resultado de la multiplicación: ");
                    adivinar = getRandomNumber(0, 100);
                }
            }
            i++;
        } while (true);

    }

    //Función que generará un número aleatorio a partir de un rango especificado (min y max) los extremos están incluidos
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        //Si quieres excluir el límite superior, solo tienes que cambiar la línea return r.nextInt((max - min) + 1) + min; por return r.nextInt(max - min) + min;.
        return r.nextInt((max - min) + 1) + min;
    }
}

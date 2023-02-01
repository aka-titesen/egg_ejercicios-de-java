/*
CONSIGNA:
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E 0-0-4 0-1-2 0-1-E 
Nota: investigar función equals() y como convertir números a String. 
 */
package javaintroextras;

public class Ejercicio12Extra {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) { //Recorremos el primer dígito del contador (va del 0 al 9)
            for (int j = 0; j <= 9; j++) { //Recorremos el segundo dígito del contador (va del 0 al 9)
                for (int k = 0; k <= 9; k++) { //Recorremos el tercer dígito del contador (va del 0 al 9)
                    String num1 = convertirANumeroOE(i); //Convertimos el primer dígito a una cadena y lo sustituye por una E si es igual a 3
                    String num2 = convertirANumeroOE(j);  //Convertimos el segundo dígito a una cadena y lo sustituye por una E si es igual a 3
                    String num3 = convertirANumeroOE(k); //Convertimos el tercer dígito a una cadena y lo sustituye por una E si es igual a 3
                    System.out.println(num1 + "-" + num2 + "-" + num3); //Mostramos el contador en pantalla con el formato X-X-X
                }
            }
        }
    }

    public static String convertirANumeroOE(int num) {
        if (num == 3) {
            return "E";
        } else {
            return Integer.toString(num);
        }
    }
}

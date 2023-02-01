/*
CONSIGNA:
5. Una obra social tiene tres clases de socios:  o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.  o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.  o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio. 
 */
package javaintroextras;

import java.util.Scanner;

public class Ejercicio5Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Pedimos al usuario que ingrese la clase de socio y el costo del tratamiento
        System.out.print("Ingrese la clase de socio (A, B o C): ");
        char claseSocio = leer.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = leer.nextDouble();

        //Calculamos el importe a pagar en efectivo en base a la clase de socio
        double importePagar = 0.0;
        if (claseSocio == 'A') {
            //Los socios tipo A tienen un 50% de descuento
            importePagar = costoTratamiento * 0.5;
        } else if (claseSocio == 'B') {
            //Los socios tipo B tienen un 35% de descuento
            importePagar = costoTratamiento * 0.65;
        } else {
            //Los socios tipo C no tienen descuento
            importePagar = costoTratamiento;
        }

        //Mostramos el importe a pagar en efectivo
        System.out.println("Importe a pagar: " + importePagar);
    }
}

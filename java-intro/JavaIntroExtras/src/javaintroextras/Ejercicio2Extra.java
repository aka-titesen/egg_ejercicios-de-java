/*
CONSIGNA:
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. 
 */
package javaintroextras;

public class Ejercicio2Extra {

    public static void main(String[] args) {
        int aux = 0;
        System.out.println("--- Valores originales ---");
        int b = 20;
        System.out.println("Valor original de b " + b);
        int c = 30;
        System.out.println("Valor original de c " + c);
        int a = 10;
        System.out.println("Valor original de a " + a);
        int d = 40;
        System.out.println("Valor original de d " + d);

        System.out.println("--- Nuevos valores ---");

        aux = b; //Guardo el valor de b para después asignarlo a d al final de la secuencia de intercambio
        b = c; //B toma el valor de c
        System.out.println("Nuevo valor de b " + b);
        c = a;//C toma el valor de a
        System.out.println("Nuevo valor de c " + c);
        a = d;//A toma el valor de d
        System.out.println("Nuevo valor de a " + a);
        d = aux;//D toma el valor de b
        System.out.println("Nuevo valor de d " + d);

    }

}

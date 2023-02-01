/*
COSIGNA:
9. Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13: 50 – 13 = 37  
una resta realizada  37 – 13 = 24  
dos restas realizadas  24 – 13 = 11  
tres restas realizadas dado que 11 es menor que 13, entonces: 
el residuo es 11 y el cociente es 3. ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas. 
 */
package javaintroextras;

public class Ejercicio9Extra {

    public static void main(String[] args) {
        int dividendo = 50; //50/13
        int divisor = 13; //50/13
        int cociente = 0; //El número de veces que se haga la resta

        /* 
        Necesitamos ésto para poner de condición.
        El residuo va a ser de bandera de salida para que pare el bucle, tomará el valor del "dividendo" porque a éste le va ir restando el "divisor". 
        Cuándo éste menor que el divisor, entonces será el "residuo"
         */
        int residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        /*
        COMIENZO:
        dividendo = 50
        divisor = 13
        cociente = 0
        residuo = dividendo
        
        1er vuelta:
        residuo(50) - divisor(13) = "37"
        cociente = 1
        
        2da vuelta:
        residuo(37) - divisor(13) = "24"
        cociente = 2
        
        3ra vuelta:
        residuo(24) - divisor(13) = "11"
        cociente = 3
        
        FINAL:
        residuo = 11
        cociente = 3
         */

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }

}

package principal;

import entidad.Numero;

public class Principal {

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException ‎se produce cuando accedemos a un vector, matriz o una colección a tráves de un índice no válido
        //Esto significa que el índice es menor que cero o mayor o igual que el tamaño de la matriz. Además, la comprobación se realiza en tiempo de ejecución
        int[] numerosVector = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Declaro e inicializo un vector del 1-9 con un índice del 0-8
        Numero numeros = new Numero(numerosVector); //Asigno el vector al objeto numeros de la clase Numero que tiene como atributo un vector
        try { //Intento "Try" ejecutar la línea 11 y 12 
            numeros.getNumeros()[9] = 10; // Intento asignar el número 10 a un posición que no existe, la "9", fallará en ésta línea y pasará la excepción a atrapar "catch"
            System.out.println(numeros.getNumeros());
        } catch (ArrayIndexOutOfBoundsException e) { //En éste caso ejecutará lo que haya dentro de catch
            System.out.println(">> Error: está intentando ingresar a una posición que no existe");
            System.out.println(">> " + e.getMessage());
            System.out.println(">> " + e);
            System.out.println(">> " + e.fillInStackTrace());
        }
    }
}

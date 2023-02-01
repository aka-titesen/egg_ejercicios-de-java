package principal;

import static principal.Uno.metodo;

public class Principal {

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println(">> Excepcion en el metodo() ");
            e.printStackTrace();
        }
    }
}

class Uno {

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1; // 0 + 1
            valor = valor + Integer.parseInt("42"); // 1 + 42 = 43
            valor = valor + 1; // 43 + 1 = 44 
            System.out.println("Valor final del try:" + valor); //Imprimirá ésto
        } catch (NumberFormatException e) { //Salteará ésta línea
            valor = valor + Integer.parseInt("42"); //Salteará ésta línea
            System.out.println("Valor final del catch  :" + valor); //Salteará ésta línea
        } finally {
            valor = valor + 1; // 44 + 1 = 45
            System.out.println("Valor final de finally : " + valor); //Imprimirá ésto
        }
        valor = valor + 1; //45 + 1 = 46
        System.out.println("Valor antes del return " + valor); //Imprimirá ésto
        return valor;
    }
}

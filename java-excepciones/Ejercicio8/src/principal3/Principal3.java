package principal3;

import static principal3.tres.metodo;

public class Principal3 {

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(">> Excepcion en el metodo() ");
            e.printStackTrace();
        }
    }
}

class tres {

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1; // 0 + 1 = 1 
            valor = valor + Integer.parseInt("W"); // 1 + W ?
            valor = valor + 1; //No llegará a ésta línea 
            System.out.println("Valor final del try: " + valor); //No llegará a ésta línea 
        } catch (NumberFormatException e) { //Entrará en el Catch pero como devuelta intentamos sumar una cadena convertida a entero dará error 
            valor = valor + Integer.parseInt("W"); //Acá dará NumberFormatException 
            System.out.println("Valor final del catch: " + valor); //No llegará a ésta línea
        } finally {
            valor = valor + 1; // 1 + 1 = 2
            System.out.println("Valor final del finally: " + valor); //Acá imprimiría 2
        }
        valor = valor + 1; // 2 + 1 
        System.out.println("Valor antes del return: " + valor); //Acá imprimiría 3
        return valor;
    }
}

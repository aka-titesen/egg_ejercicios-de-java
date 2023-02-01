package principal2;

import static principal2.Dos.metodo;

public class Principal2 {

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(">> Excepcion en  el metodo() ");
            e.printStackTrace();
        }
    }

}

class Dos {

    public static int metodo() {
        int valor = 0; //Acá es 0
        try {
            valor = valor + 1;  // 0 + 1 = 1
            valor = valor + Integer.parseInt("W"); // 1 + W ? | Dará la excepción NumberFormarException
            valor = valor + 1; //No llegará acá
            System.out.println("Valor final del try: " + valor); //No llegará acá
        } catch (NumberFormatException e) { //Llegará al catch 
            valor = valor + Integer.parseInt("42"); //1 + 42 = 43 
            System.out.println("Valor final del catch: " + valor); //Imprimirá ésto
        } finally {
            valor = valor + 1; // 43 + 1 = 44
            System.out.println("Valor final del finally: " + valor); //Imprimirá ésto
        }
        valor = valor + 1; // 44 + 1 = 45
        System.out.println("Valor antes del return: " + valor); //Imprimirá ésto
        return valor;
    }
}

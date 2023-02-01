package principal;

import entidad.Persona;

public class Principal {

    public static void main(String[] args) {
        Persona facundo = null; //Declaro un objeto vacio
        //NullPointerException ‎es una excepción en tiempo de ejecución que se produce cuando se accede a una variable que no apunta a ningún objeto y se refiere a nada o nulo
        try { // Intentaré "Try" ejecutar ésta condicional dentro del bloque try, si no da ninguna excepción debería ejecutarse el if o else de la condicional
            if (facundo.mayorDeEdad()) { //Éste objeto llama el método mayorDeEdad() para comprobar si es mayor, pero como el objecto es nulo, va a fallar
                System.out.println(">> Es mayor de edad;");
            } else {
                System.out.println(">> Es menor de edad;");
            }
        } catch (NullPointerException e) { //En éste caso se ejecutará la instancia atrapar "catch" y recibirá el objeto excepción "e" de la clase NullPointerException
            System.out.println(">> Error: El objeto está vacio"); //Devuelvo un mensaje personalizado
            System.out.println(">> " + e.getMessage()); //Devuelvo un mensaje personalizado de la clase que devolvió con throw new
            System.out.println(">> " + e); //Devuelvo un mensaje completa
            System.out.println(">> " + e.fillInStackTrace()); //Recibo una pila de errores, ésto si es que el método que dió la excepción se llamo en otros métodos, me mostraría éstos
        }
    }
}

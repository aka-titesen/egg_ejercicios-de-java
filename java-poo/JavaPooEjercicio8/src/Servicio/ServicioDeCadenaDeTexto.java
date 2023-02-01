package Servicio;

import Clase.CadenaDeTexto;
import java.util.Scanner;

public class ServicioDeCadenaDeTexto {

    public CadenaDeTexto crearCadena() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaDeTexto cdt1 = new CadenaDeTexto();
        System.out.print("Ingrese la frase: ");
        cdt1.setPalabra(leer.next());
        //Obtiene la longitud de la frase ingresadaS
        cdt1.setLongitudDeLaPalabra(cdt1.getPalabra().length());
        //Se generá el vector a partir de la frase ingresada y longitud
        String[] vectorCadena = new String[cdt1.getPalabra().length()];
        for (int i = 0; i < vectorCadena.length; i++) {
            vectorCadena[i] = cdt1.getPalabra().substring(i, i + 1);
        }
        cdt1.setVectorCadena(vectorCadena);
        return cdt1;
    }

    public static void contarVocales(CadenaDeTexto cdt1) {
        int contador = 0;
        System.out.println("========= Recuento de vocales =========");
        for (int i = 0; i < cdt1.getVectorCadena().length; i++) {
            if (cdt1.getVectorCadena()[i].equalsIgnoreCase("a") || cdt1.getVectorCadena()[i].equalsIgnoreCase("e") || cdt1.getVectorCadena()[i].equalsIgnoreCase("i") || cdt1.getVectorCadena()[i].equalsIgnoreCase("o") || cdt1.getVectorCadena()[i].equalsIgnoreCase("u")) {
                contador++;
            }
        }
        System.out.println(cdt1.getPalabra() + " tiene " + contador + " vocales");
        System.out.println("");
    }

    public static void invertirPalabra(CadenaDeTexto cdt1) {
        System.out.println("========= Palabra invertida =========");
        for (int i = cdt1.getVectorCadena().length - 1; i >= 0; i--) {
            System.out.print(cdt1.getVectorCadena()[i]);
        }
        System.out.println("");
    }

    public static void letrasRepetidas(CadenaDeTexto cdt1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        System.out.println("========= Letra repetida =========");
        System.out.print("Ingrese una letra que desea buscar si se está repetida: ");
        String auxiliar = leer.next();
        for (int i = 0; i < cdt1.getVectorCadena().length; i++) {
            if (cdt1.getVectorCadena()[i].equalsIgnoreCase(auxiliar)) {
                contador++;
            }
        }
        System.out.println(auxiliar + " aparece " + contador + " veces");
        System.out.println("");
    }

    public static void compararLongitud(CadenaDeTexto cdt1) {
        System.out.println("========= Comparación de longitud =========");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese una frase para comparar la longitud: ");
        String auxiliar = leer.next();
        if (cdt1.getLongitudDeLaPalabra() == auxiliar.length()) {
            System.out.println("Son iguales");
        } else {
            System.out.println("NO son iguales");
        }
        System.out.println("");
    }

    public static void unirPalabras(CadenaDeTexto cdt1) {
        System.out.println("========= Unir palabra =========");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese una nueva frase para unirla: ");
        String auxiliar = leer.next();
        System.out.println(cdt1.getPalabra().concat(" ").concat(auxiliar));
        System.out.println("");
    }

    public static void reemplazarLetra(CadenaDeTexto cdt1) {
        System.out.println("========= Reemplazar la letra A =========");
        String[] vectorCadena = new String[cdt1.getLongitudDeLaPalabra()];
        System.arraycopy(cdt1.getVectorCadena(), 0, vectorCadena, 0, vectorCadena.length);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese un carácter con la quieras reemplazar todas las A: ");
        String auxiliar = leer.next();
        for (int i = 0; i < vectorCadena.length; i++) {
            if (vectorCadena[i].equalsIgnoreCase("a")) {
                vectorCadena[i] = auxiliar;
            }
            System.out.print(vectorCadena[i]);
        }
        System.out.println("");
    }

    public static boolean verificarLetra(CadenaDeTexto cdt1) {
        boolean verificacion = false;
        System.out.println("========= Verifica si existe la letra =========");
        System.out.print("Ingrese la letra que quiere verificar si existe: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String auxiliar = leer.next();

        for (int i = 0; i < cdt1.getVectorCadena().length; i++) {
            if (cdt1.getVectorCadena()[i].equalsIgnoreCase(auxiliar)) {
                verificacion = true;
                break;
            }
        }
        return verificacion;
    }
}

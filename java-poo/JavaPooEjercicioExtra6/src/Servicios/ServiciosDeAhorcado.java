package Servicios;

import Clase.Ahorcado;
import java.util.Scanner;

public class ServiciosDeAhorcado {

    /*
    Configuré el juego para jugar con la palabra "vicho" que consta de solamente 5 letras,
    el jugador solo contará de 10 intentos para lograrlo si no perderá.
     */
    public Ahorcado crearJuego() {
        Ahorcado nuevoAhorcado = new Ahorcado();
        //Vector que contendrá la palabra a adivinar
        String[] palabraSecreta = {"v", "i", "c", "h", "o"};
        //Establezco el vector en el atributo del vector
        nuevoAhorcado.setPalabra(palabraSecreta);
        System.out.println(" ¡¡¡ La palabra secreta ha sido cargada !!! <");
        //Establece la cantidad de intentos en "10" por defecto
        nuevoAhorcado.setIntentos(10);
        //Estable la cantidad de letras encontradas en "0" por defecto
        nuevoAhorcado.setCantidadLetrasEcontradas(0);
        //Devuelve el objeto con sus atributos establecidos
        return nuevoAhorcado;
    }

    //Con éste devuelvo el número total de carácteres de una cadena
    public static int longitud(Ahorcado nuevoAhorcado) {
        return nuevoAhorcado.getPalabra().length;
    }

    //Con éste busca la letra que ingresa el usuario en el vector, y devuelvo true si encontró o false si no lo encontró
    public static boolean buscarLetra(Ahorcado nuevoAhorcado, String letra) {
        String[] palabraSecreta = new String[nuevoAhorcado.getPalabra().length];
        System.arraycopy(nuevoAhorcado.getPalabra(), 0, palabraSecreta, 0, palabraSecreta.length);
        boolean bandera = false;
        //Busco la letra ingresada por el usuario en el vector
        for (int i = 0; i < palabraSecreta.length; i++) {
            if (palabraSecreta[i].equalsIgnoreCase(letra)) {
                bandera = true;
            }
        }
        return bandera;
    }

    /*
Con éste recibe la respuesta del método "buscarLetra" y si es true, incremeta el atributo "CantidadLetrasEncontradas,
y disminuye el atributo "Intentos". Si recibe false, disminuye solo el atributo "Intentos".
     */
    public static void encontradas(Ahorcado nuevoAhorcado, boolean buscarLetra) {
        int CantidadLetrasEcontradas = nuevoAhorcado.getCantidadLetrasEcontradas();
        int intentos = 0;
        if (buscarLetra) {
            CantidadLetrasEcontradas++;
            nuevoAhorcado.setCantidadLetrasEcontradas(CantidadLetrasEcontradas);
            System.out.println("> La letra pertenece a la palabra <");
            System.out.println("> La cantidad de letras encontradas es: " + CantidadLetrasEcontradas + " <");
            intentos = intentos(nuevoAhorcado);
            System.out.println("> Le quedan " + intentos + " intentos <");

        } else {
            intentos = intentos(nuevoAhorcado);
            System.out.println("La letra NO pertenece a la palabra");
            System.out.println("> Le quedan " + intentos + " intentos <");
        }
    }

    //Cuando éste es llamado disminuye -1, el atributo intentos
    public static int intentos(Ahorcado nuevoAhorcado) {
        int intentos = nuevoAhorcado.getIntentos();
        intentos--;
        nuevoAhorcado.setIntentos(intentos);
        return intentos;
    }

    //Método principal donde llamo a todos los métodos para realizar el juego
    public static void jugandoAlAhorcado(Ahorcado nuevoAhorcado) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String letra = "";
        boolean comprobacion;
        System.out.println("========= B I E N V E N I D O  A L  J U E G O  D E L  A H O R C A D O =========");
        //Condición para que siga ejecutando el juego
        while ((nuevoAhorcado.getIntentos() > 0) && (nuevoAhorcado.getCantidadLetrasEcontradas() != longitud(nuevoAhorcado))) {
            System.out.print("Ingrese una letra:");
            //El usuario ingresa una letra
            letra = leer.next();
            //Con éste busca la letra en el vector
            comprobacion = buscarLetra(nuevoAhorcado, letra);
            //Éste recibe la respuesta de "buscarLetra" e incrementa "CantidadLetrasEncontradas" y disminuye intentos, o solo disminuye éste último
            encontradas(nuevoAhorcado, comprobacion);
        }
        System.out.println("");
        //En base a lo que pasó en el While, se dará un resultado u otro
        if (nuevoAhorcado.getCantidadLetrasEcontradas() == longitud(nuevoAhorcado)) {
            System.out.println("<--- ¡Has ganado! --->");
        } else if (nuevoAhorcado.getIntentos() == 0) {
            System.out.println("<--- ¡Has sido ahorcado --->!");
        }
    }
}

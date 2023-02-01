package libreria;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

public class Libreria {

    public static void main(String[] args) throws Exception {

        EditorialService es = new EditorialService();
        AutorService as = new AutorService();
        LibroService ls = new LibroService();
        Menu menu = new Menu();

        menu.sistemaLibreria();

//        Autor autorUno = as.crearAutor("Gabriel García Márquez");
//        Autor autorDos = as.crearAutor("Jorge Luis Borges");
//        Autor autorTres = as.crearAutor("Robert Arlt"); //3
//        Autor autorCuatro = as.crearAutor("Julio Cortázar"); //4
//        Autor autorCinco = as.crearAutor("Alejandra Pizarnik"); //5
//        Autor autorSeis = as.crearAutor("Silvina Ocampo"); //6
//        Autor autorSiete = as.crearAutor("Ernesto Sabato"); //7
//        Autor autorOcho = as.crearAutor("Alfonsina Storni"); //8
//        Autor autorNueve = as.crearAutor("Rodolfo Walsh"); //9
//        Autor autorDiez = as.crearAutor("Victoria Ocampo"); //10
//
//        Editorial editorialUno = es.crearEditorial("El Espectador"); //1
//        Editorial editorialDos = es.crearEditorial("Losada"); //2
//        Editorial editorialTres = es.crearEditorial("Editorial Latina"); //3
//        Editorial editorialCuatro = es.crearEditorial("Sudamericana"); //4
//        Editorial editorialCinco = es.crearEditorial("Testigo"); //5
//        Editorial editorialSeis = es.crearEditorial("Sur"); //6
//        Editorial editorialSiete = es.crearEditorial("Ovni Press"); //7
//        Editorial editorialOcho = es.crearEditorial("Ediciones Sigla"); //8
//        Editorial editorialNueve = es.crearEditorial("Sylvia Molloy"); //9
//        Editorial editorialDiez = es.crearEditorial("Malsava"); //10
//
//        Libro libroUno = ls.crearLibro("Relato de un náufrago", 1955, 200, 100, autorUno, editorialUno);
//        Libro libroDos = ls.crearLibro("El inmortal", 1947, 200, 100, autorDos, editorialDos);
//        Libro libroTres = ls.crearLibro("Los siete locos", 1929, 200, 100, autorTres, editorialTres);
//        Libro libroCuatro = ls.crearLibro("Rayuela", 1963, 200, 100, autorCuatro, editorialCuatro);
//        Libro libroCinco = ls.crearLibro("La condesa sangrienta", 1966, 200, 100, autorCinco, editorialCinco);
//        Libro libroSeis = ls.crearLibro("Viaje olvidado", 1937, 200, 100, autorSeis, editorialSeis);
//        Libro libroSiete = ls.crearLibro("El túnel", 1948, 200, 100, autorSiete, editorialSiete);
//        Libro libroOcho = ls.crearLibro("El dulce daño", 1918, 200, 100, autorOcho, editorialOcho);
//        Libro libroNueve = ls.crearLibro("Operación Masacre", 1957, 200, 100, autorNueve, editorialNueve);
//        Libro libroDiez = ls.crearLibro("La viajera y sus sombras", 1951, 200, 100, autorDiez, editorialDiez);
    }
}

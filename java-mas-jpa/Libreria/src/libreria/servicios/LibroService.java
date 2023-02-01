package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroService {

    private final LibroDAO dao;

    public LibroService() {
        this.dao = new LibroDAO();
    }

    public Libro crearLibro(String titulo, Integer anho, Integer ejemplares, Integer ejemplaresPrestados, Autor autor, Editorial editorial) {
        Libro libro = new Libro();
        try {
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar un título para el libro !!! <---");
            }
            if (anho == null || anho <= 0) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar un año para el libro !!! <---");
            }
            if (ejemplares == null || ejemplares <= 0) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar el número de ejemplares para el libro !!! <---");
            }
            if (ejemplaresPrestados == null || ejemplaresPrestados < 0) {
                throw new Exception("---> ¡¡¡ Error: El número de ejemplares prestados no puede ser menor a cero !!! <---");
            }
            if (ejemplaresPrestados > ejemplares) {
                throw new Exception("---> ¡¡¡ Error: No puedes prestar más ejemplares de lo que tienes !!! <---");
            }
            if (autor == null) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar el autor para el libro !!! <---");
            }
            if (editorial == null) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar la editorial para el libro !!! <---");
            }

            Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
            libro.setIsbn(libro.generarISBN());
            libro.setTitulo(titulo);
            libro.setAnho(anho);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(true);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public Libro buscarPorIsbn(String isbn) {
        Libro libro = null;
        try {
            libro = dao.buscarPorIsbn(isbn);
            if (libro == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un libro con el isbn especificado !!! <---");
            }
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
        return null;
    }

    public Libro buscarPorTitulo(String titulo) {
        Libro libro = null;
        try {
            libro = dao.buscarPorTitulo(titulo);

            if (libro == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un libro con el título especificado !!! <---");
            }
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public void editarAlta(String isbn) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = false;
        Libro libro = null;
        try {
            libro = dao.buscarPorIsbn(isbn);
            if (libro == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un libro con el isbn especificado !!! <---");
            }
            if (libro.isAlta()) {
                menu = true;
                System.out.println(">> El libro está visible");
                System.out.println(">> ¿Desea cambiarlo a invisible?");
                while (menu) {
                    System.out.println(">> Elija, S: lo vuelve invisible, N: lo deja visible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            libro.setAlta(false);
                            menu = false;
                            break;
                        case 'n':
                            menu = false;
                            break;
                        default:
                            System.out.println(">> Opción incorrecta, vuelva a elegir...");
                            break;
                    }
                }
            } else {
                menu = true;
                System.out.println(">> El libro está invisible");
                System.out.println(">> ¿Desea cambiarlo a visible?");
                while (menu) {
                    System.out.println(">> Elija, S: lo vuelve visible, N: lo deja invisible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            libro.setAlta(true);
                            menu = false;
                            break;
                        case 'n':
                            menu = false;
                            break;
                        default:
                            System.out.println(">> Opción incorrecta, vuelva a elegir...");
                            break;
                    }
                }
            }
            dao.editar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public List<Libro> buscarLibroPorNombreAutor(String nombre) {
        try {
            List<Libro> libros = dao.buscarLibroPorNombreAutor(nombre);
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarLibroPorNombreEditorial(String nombre) {
        try {
            List<Libro> libros = dao.buscarLibroPorNombreEditorial(nombre);
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> listarTodosLosLibros() {
        try {
            List<Libro> llibros = dao.listarTodosLosLibros();
            return llibros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean comprobarSiExistePorTitulo(String titulo) {

        try {
            if (buscarPorTitulo(titulo) == null) {
                throw new Exception("No existe ese libro");
            } else {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

package libreria;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

public class Menu {

    EditorialService es;
    AutorService as;
    LibroService ls;

    public Menu() {
        this.es = new EditorialService();
        this.as = new AutorService();
        this.ls = new LibroService();
    }

    public void sistemaLibreria() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("### Sistema gestión de la librería ###");
        boolean menu = true;
        boolean subMenu = false;
        while (menu) {
            System.out.println("1: Listar todos los registros");
            System.out.println("2: Agregar un registro");
            System.out.println("3: Editar un registro");
            System.out.print("---> Elija: ");
            switch (leer.nextByte()) {
                case 1:
                    subMenu = true;
                    while (subMenu) {
                        System.out.println("### Submenu de listado ###");
                        System.out.println("1: Listar todos los libros");
                        System.out.println("2: Listar todos los autores");
                        System.out.println("3: Listar todas las editoriales");
                        System.out.println("4: Salir del submenu Listar");
                        System.out.print("---> Elija: ");
                        switch (leer.nextByte()) {
                            case 1:
                                List<Libro> libros = ls.listarTodosLosLibros();
                                libros.forEach((libro) -> {
                                    System.out.println(libro);
                                });
                                break;
                            case 2:
                                List<Autor> autores = as.listarTodosLosAutores();
                                autores.forEach((autor) -> {
                                    System.out.println(autor);
                                });
                                break;
                            case 3:
                                List<Editorial> editoriales = es.listarTodasLasEditoriales();
                                editoriales.forEach((editorial) -> {
                                    System.out.println(editorial);
                                });
                                break;
                            case 4:
                                subMenu = false;
                                esperarConfirmacion();
                                System.out.println("Saliendo del programa...");
                                limpiarPantalla();
                                break;
                            default:
                                System.out.println("Opción incorrecta, vuelva a elegir");
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                        }
                    }
                    break;
                case 2:
                    subMenu = true;
                    while (subMenu) {
                        System.out.println("### Submenu para insertar registros ###");
                        System.out.println("1: Insertar un autor");
                        System.out.println("2: Insertar una editorial");
                        System.out.println("3: Insertar un libro");
                        System.out.println("4: Salir del submenu Insertar");
                        System.out.print("---> Elija: ");
                        switch (leer.nextByte()) {
                            case 1:
                                System.out.println("### Creación de autor ###");
                                System.out.print("---> Ingrese el nombre: ");
                                String nombreAutor = leer.next();
                                if (as.comprobarSiExistePorNombre(nombreAutor)) {
                                    System.out.println("El autor ya existe");
                                } else {
                                    as.crearAutor(nombreAutor);
                                }
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 2:
                                System.out.println("### Creación de editorial ###");
                                System.out.print("---> Ingrese el nombre: ");
                                String nombreEditorial = leer.next();
                                if (es.comprobarSiExistePorNombre(nombreEditorial)) {
                                    System.out.println("La editorial ya existe");
                                } else {
                                    es.crearEditorial(nombreEditorial);
                                }
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 3:
                                System.out.println("### Creación de libro ###");
                                System.out.print("---> Ingrese el nombre: ");
                                String nombreLibro = leer.next();
                                if (ls.comprobarSiExistePorTitulo(nombreLibro)) {
                                    System.out.println("El libro ya existe");
                                } else {
                                    System.out.print("---> Ingrese el año del libro: ");
                                    Integer anho = leer.nextInt();
                                    System.out.print("---> Ingrese ejemplares");
                                    Integer ejemplares = leer.nextInt();
                                    System.out.print("---> Ingrese ejemplares prestados");
                                    Integer ejemplaresPrestados = leer.nextInt();
                                    System.out.print("---> Ingrese el nombre del autor para el libro"); //Autor
                                    String nombreAutorLibro = leer.next();
                                    Autor autorParaLibro = null;
                                    if (as.comprobarSiExistePorNombre(nombreAutorLibro)) {
                                        System.out.println("Éste autor ya existe y será asignado al libro");
                                        autorParaLibro = as.buscarPorNombre(nombreAutorLibro);
                                    } else {
                                        System.out.println("Éste autor no existe y será creado para asignarse al libro");
                                        autorParaLibro = as.crearAutor(nombreAutorLibro);
                                    }
                                    System.out.print("---> Ingrese el nombre de la editorial para el libro"); //Editorial
                                    String nombreEditorialLibro = leer.next();
                                    Editorial editorialParaLibro = null;
                                    if (es.comprobarSiExistePorNombre(nombreEditorialLibro)) {
                                        System.out.println("Ésta editorial ya existe y será asignado al libro");
                                        editorialParaLibro = es.buscarPorNombre(nombreEditorialLibro);
                                    } else {
                                        System.out.println("Ésta editorial no existe y será creada para asignarse al libro");
                                        editorialParaLibro = es.crearEditorial(nombreEditorialLibro);
                                    }
                                    ls.crearLibro(nombreLibro, anho, ejemplares, ejemplaresPrestados, autorParaLibro, editorialParaLibro);
                                }
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 4:
                                subMenu = false;
                                esperarConfirmacion();
                                System.out.println("Saliendo del programa...");
                                limpiarPantalla();
                                break;
                            default:
                                System.out.println("Opción incorrecta, vuelva a elegir");
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                        }
                    }
                    break;
                case 3:
                    subMenu = true;
                    while (subMenu) {
                        System.out.println("### Editar alta en un registro ###");
                        System.out.println("1: Editar alta en un autor");
                        System.out.println("2: Editar alta en un editorial");
                        System.out.println("3: Editar alta en un libro");
                        System.out.print("---> Elija: ");
                        switch (leer.nextByte()) {
                            case 1:
                                System.out.print("---> Ingresa el id del autor para editar el autor");
                                Integer idAutor = leer.nextInt();
                                as.editarAlta(idAutor);
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 2:
                                System.out.print("---> Ingresa el id de la editorial para editar el editorial");
                                Integer idEditorial = leer.nextInt();
                                es.editarAlta(idEditorial);
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 3:
                                System.out.print("---> Ingresa el isbn del libro para editar el libro");
                                String isbnLibro = leer.next();
                                ls.editarAlta(isbnLibro);
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                            case 4:
                                esperarConfirmacion();
                                System.out.println("Saliendo del programa...");
                                limpiarPantalla();
                                break;
                            default:
                                System.out.println("Opción incorrecta, vuelva a elegir");
                                esperarConfirmacion();
                                limpiarPantalla();
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta vuelva a elegir");
                    esperarConfirmacion();
                    limpiarPantalla();
                    break;
            }
        }
    }

    public void limpiarPantalla() {
        try {
            Robot pressbot = new Robot();
            pressbot.setAutoDelay(30);
            pressbot.keyPress(17);
            pressbot.keyPress(76);
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void esperarConfirmacion() {
        System.out.println("Presione la tecla Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

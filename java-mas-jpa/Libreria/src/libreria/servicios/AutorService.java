package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorService {

    private final AutorDAO dao;

    public AutorService() {
        this.dao = new AutorDAO();
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar un nombre para el autor !!! <---");
            }
            autor.setNombre(nombre);
            autor.setAlta(true);
            dao.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public Autor buscarPorId(Integer id) {
        Autor autor = null;
        try {
            autor = dao.buscarPorId(id);

            if (autor == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un autor con el id especificado !!! <---");
            }
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
        return null;
    }

    public Autor buscarPorNombre(String nombre) {
        Autor autor = null;
        try {
            autor = dao.buscarPorNombre(nombre);

            if (autor == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un autor con el nombre especificado !!! <---");
            }
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public void editarAlta(Integer id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = false;
        Autor autor = null;
        try {
            autor = dao.buscarPorId(id);
            if (autor == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un autor con el id especificado !!! <---");
            }
            if (autor.isAlta()) {
                menu = true;
                System.out.println(">> El autor está visible");
                System.out.println(">> ¿Desea cambiarlo a invisible?");
                while (menu) {
                    System.out.println(">> Elija, S: lo vuelve invisible, N: lo deja visible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            autor.setAlta(false);
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
                System.out.println(">> El autor está invisible");
                System.out.println(">> ¿Desea cambiarlo a visible?");
                while (menu) {
                    System.out.println(">> Elija, S: lo vuelve visible, N: lo deja invisible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            autor.setAlta(true);
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
            dao.editar(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public List<Autor> listarTodosLosAutores() {
        try {
            List<Autor> autores = dao.listarTodosLosAutores();
            return autores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean comprobarSiExistePorNombre(String nombre) {

        try {
            if (buscarPorNombre(nombre) == null) {
                throw new Exception("No existe ese autor");
            } else {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}

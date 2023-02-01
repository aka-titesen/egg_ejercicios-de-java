package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO dao;

    public EditorialService() {
        this.dao = new EditorialDAO();
    }

    public Editorial crearEditorial(String nombre) {
        Editorial editorial = new Editorial();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("---> ¡¡¡ Error: Se debe indicar un nombre para la editorial !!! <---");
            }
            editorial.setNombre(nombre);
            editorial.setAlta(true);
            dao.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public Editorial buscarPorId(Integer id) {
        Editorial editorial = null;
        try {
            editorial = dao.buscarPorId(id);

            if (editorial == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un editorial con el id especificado !!! <---");
            }
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
        return null;
    }

    public Editorial buscarPorNombre(String nombre) {
        Editorial editorial = null;
        try {
            editorial = dao.buscarPorNombre(nombre);

            if (editorial == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado una editorial con el nombre especificado !!! <---");
            }
            return editorial;
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
        Editorial editorial = null;
        try {
            editorial = dao.buscarPorId(id);
            if (editorial == null) {
                throw new Exception("---> ¡¡¡ Error: No se ha encontrado un editorial con el id especificado !!! <---");
            }
            if (editorial.isAlta()) {
                menu = true;
                System.out.println(">> La editorial está visible");
                System.out.println(">> ¿Desea cambiarlo a invisible?");
                while (menu) {
                    System.out.println(">> elija, S: lo vuelve invisible, N: lo deja visible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            editorial.setAlta(false);
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
                System.out.println(">> La editorial está invisible");
                System.out.println(">> ¿Desea cambiarlo a visible?");
                while (menu) {
                    System.out.println(">> elija, S: lo vuelve visible, N: lo deja invisible ");
                    System.out.print("---> Presione: ");
                    switch (leer.next().toLowerCase().charAt(0)) {
                        case 's':
                            editorial.setAlta(true);
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
            dao.editar(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---> ¡¡¡ Operación finalizada !!! <---");
        }
    }

    public List<Editorial> listarTodasLasEditoriales() {
        try {
            List<Editorial> editoriales = dao.listarTodasLasEditoriales();
            return editoriales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean comprobarSiExistePorNombre(String nombre) {

        try {
            if (buscarPorNombre(nombre) == null) {
                throw new Exception("No existe esa editorial");
            } else {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

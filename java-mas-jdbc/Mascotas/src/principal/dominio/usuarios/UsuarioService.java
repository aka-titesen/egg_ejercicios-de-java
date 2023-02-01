package principal.dominio.usuarios;

import java.util.Collection;
import principal.persistencia.UsuarioDAO;

public class UsuarioService {

    private UsuarioDAO dao; //Creamos una variable global de tipo Dao

    public UsuarioService() { //Inicializa cuando hacemos nacer un objeto de UsuarioService
        this.dao = new UsuarioDAO();//Establecemos una relación de composición en la que UsuarioService depende de UsuarioDAO
    }

    public void crearUsuario(String correoElectronico, String clave) throws Exception { //Éste método recibe los datos por parámetro para crear una objeto usuario y guardarlo en la base de datos
        try {
            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            if (correoElectronico.contains("@") == false) {
                throw new Exception("El correo electrónico es incorrecto");
            }
            if (clave == null || clave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave");
            }
            if (clave.length() < 8) {
                throw new Exception("La clave no puede tener menos de 8 caracteres");
            }
            if (buscarUsuarioPorCorreoElectronico(correoElectronico) != null) {
                throw new Exception("Ya existe un usuario con el correo electrónico indicado " + correoElectronico);
            }
            //Creamos el usuario
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsuario(usuario); //Llamo al método guardarUsuario del dao para insertar el objeto usuario creado recientemente
        } catch (Exception e) {
            throw e;
        }
    }

    /*
    Éste mpetodo cambia la clave de un usuario,  se le pasa por parámetro el correo, la clave actual y la nueva.
    Busca el objeto que tenga ese correo y lo devuelve para cambiarle la clave.
    Luego enviamos ese objeto con la clave cambiada para hacer una consulta de modificación
     */
    public void modificarClaveUsuario(String correoElectronico, String claveActual, String nuevaClave) throws Exception {
        try {
            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el usuario");
            }
            if (claveActual == null || claveActual.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave actual");
            }
            if (nuevaClave == null || nuevaClave.trim().isEmpty()) {
                throw new Exception("Debe indicar la clave nueva");
            }
            //Buscamos el usuario con el correo eléctronico pasado por parámetro y devolvemos
            Usuario usuario = buscarUsuarioPorCorreoElectronico(correoElectronico);
            //Validamos
            if (!usuario.getClave().equals(claveActual)) { //Comprobará la clave actual del usuario con la suministrada
                throw new Exception("La clave actual no es la regsitrada en el sistema para el correo electrónico indicado");
            }
            //Le actualizamos al usuario la nueva clave
            usuario.setClave(nuevaClave);
            dao.modificarUsuario(usuario); //Llamo al método modificarUsuario del dao para actualizar el objeto usuario que le cambiamos la clave
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarUsuario(String correoElectronico) throws Exception {//Éste método elimina un usuario pasandole su correo eléctronico
        try {
            //Validamos 
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            dao.eliminarUsuario(correoElectronico);//Lamo al método eliminarUsuario del dao para eliminar el objeto usuario que identifcamos a partir de su correo eléctronico
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {//Igual que el anterior pero para consultar y mostrar un usuario en base a correo eléctronico
        try {
            //Validamos
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            Usuario usuario = dao.buscarUsuarioPorCorreoElectronico(correoElectronico);//Llamo al método buscarUsuarioPorCorreoElectronico del dao para encontrarlo y devolverlo
            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) throws Exception {//Igual que el anterior pero con id
        try {
            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }
            Usuario usuario = dao.buscarUsuarioPorId(id);//Llamo al método buscarUsuarioPorId para encontrolar y devolverlo
            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Usuario> listarUsuario() throws Exception {//Éste método hace una consulta que extrae todos los usuarios y los devuelve
        try {
            Collection<Usuario> usuarios = dao.listarUsuarios();//Llamo al método listarUsuarios del DAO que devolverá una lista con todos los usuarios de la consulta
            return usuarios;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirUsuarios() throws Exception {//Éste método imprime por pantalla la lista de usuarios devolvidos de la consulta
        try {
            //Listamos los usuarios
            Collection<Usuario> usuarios = listarUsuario();
            //Imprimimos los usuarios
            if (usuarios.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Usuario u : usuarios) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}

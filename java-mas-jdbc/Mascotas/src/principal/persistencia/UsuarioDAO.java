package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio.usuarios.Usuario;

public final class UsuarioDAO extends DAO {

    public void guardarUsuario(Usuario usuario) throws Exception { //Recibe un objeto usuario ya rellenado, lo descompone y lo inserta en la base de datos
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario");
            }
            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                    + "VALUES ( '" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
            insertarModificarEliminar(sql); //Usa el método heredado en éste caso para insertar un objeto
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception { //Éste método especifico cambiará la clave del usuario, recibiendo un objeto usuario ya con la nueva clave
        try {
            if (usuario == null) {
                throw new Exception("Debe indicar el usuario que desea modificar");
            }
            String sql = "UPDATE Usuario SET "
                    + "clave = '" + usuario.getClave() + "' WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "'";
            insertarModificarEliminar(sql); //Usa el método heredado en éste caso para actualizar un valor de un objeto
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarUsuario(String correEletronico) throws Exception {//Éste método específico recibe un correo electronico y cuando encuentrá que usuario lo tiene, lo elimina
        try {
            String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + correEletronico + "'";
            insertarModificarEliminar(sql);//Usa el método heredado en éste caso para eliminar un objeto
        } catch (Exception e) {
            throw e;
        }
    }

    public Usuario buscarUsuarioPorCorreoElectronico(String correoElectronico) throws Exception {//Éste método recibe un correo eléctronico y busca ese usuario en la base de datos y lo DEVUELVE
        try {
            String sql = "SELECT * FROM Usuario "
                    + " WHERE correoElectronico = '" + correoElectronico + "'";
            consultarBase(sql);//Usa el método heredado en éste caso para buscar un usuario y devolverlo
            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Usuario buscarUsuarioPorId(Integer id) throws Exception {//Lo mismo que el anterior pero por id
        try {
            String sql = "SELECT * FROM Usuario "
                    + " WHERE id = '" + id + "'";
            consultarBase(sql);
            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Usuario> listarUsuarios() throws Exception { //Éste método extrae a todos los usuarios de una base de datos y los devuelve en un ArrayList para mostrarlo luego en otro método
        try {
            String sql = "SELECT correoElectronico, clave FROM Usuario ";
            consultarBase(sql);//Usa el método heredado para hacer una consulta
            Usuario usuario = null;//Un molde un usuario vacio
            Collection<Usuario> usuarios = new ArrayList(); //Una lista para albergar usuarios
            while (resultado.next()) {//Cuando encuentre una fila
                usuario = new Usuario(); //Creo un usuario y cada uno de sus atributos lo voy llenando a partir de las diferentes columnas de la fila actual
                usuario.setCorreoElectronico(resultado.getString(1)); //Ej
                usuario.setClave(resultado.getString(2)); //Ej
                usuarios.add(usuario); //Agrega el usuario ya completo
            }
            desconectarBase();
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}

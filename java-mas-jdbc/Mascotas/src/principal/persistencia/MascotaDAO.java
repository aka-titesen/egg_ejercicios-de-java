package principal.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import principal.dominio.mascotas.Mascota;
import principal.dominio.usuarios.Usuario;
import principal.dominio.usuarios.UsuarioService;

public final class MascotaDAO extends DAO {

    private final UsuarioService usuarioService;//Creamos una variable global del tipo UsuarioService

    public MascotaDAO() {//Inicializa cuando se inicie un MascotaService que a su vez llamará a éste MascotaDAO
        this.usuarioService = new UsuarioService();//Establecemos una relación de composición en la que MascotaDAO depende de UsuarioService
    }

    public void guardarMascota(Mascota mascota) throws Exception {//Éste método recibe ya un objeto Mascota ya completo y y lo descompone para cargarlo en una base de datos
        try {
            if (mascota == null) {
                throw new Exception("Debe indicar el mascota");
            }
            String sql = "INSERT INTO Mascota (apodo, raza, idUsuario) "
                    + "VALUES ( '" + mascota.getApodo() + "' , '" + mascota.getRaza() + "' ," + mascota.getUsuario().getId() + " );";
            insertarModificarEliminar(sql);//Método heredado del DAO para insertar en la base de datos una mascota creada
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarMascota(Mascota mascota) throws Exception {//Método por defecto donde se cambiará el apodo, la raza y el id de un usuario para que se relacione con otro
        try {
            if (mascota == null) {
                throw new Exception("Debe indicar el mascota que desea modificar");
            }
            String sql = "UPDATE Mascota SET "
                    + " apodo = '" + mascota.getApodo() + "' , raza = '" + mascota.getRaza() + "' , idUsuario = " + mascota.getUsuario().getId()
                    + " WHERE id = '" + mascota.getId() + "'";
            insertarModificarEliminar(sql);//Método heredado del DAO para actualizar datos en una fila de una base de datos
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarMascota(int id) throws Exception {//Método para elliminar una mascota a partir de su id
        try {
            String sql = "DELETE FROM Mascota WHERE id = " + id + "";
            insertarModificarEliminar(sql);//Llama al método heredado del DAO en éste caso para eliminar una fila en una base de datos a partir de su id
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    /*
Éste método consulta a la base de datos a partir de un id, lo armo y lo devuelvo.
También busco su usuario, lo devuelvo y se lo asigno
     */
    public Mascota buscarMascotaPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM Mascota WHERE id =  " + id + "";
            consultarBase(sql);//Llamo al método heredado del DAO para hacer hacer una consulta y devolver una mascota pasandole su id
            Mascota mascota = null;
            while (resultado.next()) {
                mascota = new Mascota();
                mascota.setId(resultado.getInt(1));
                mascota.setApodo(resultado.getString(2));
                mascota.setRaza(resultado.getString(3));
                Integer idUsuario = resultado.getInt(4);//Guardo el id del usuario en una variable Integer
                Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario);//Buscamos con la variable Integer al usuario en cuestión y lo devolvemos
                mascota.setUsuario(usuario); //Asignamos el usuario devuelto a la mascota
            }
            desconectarBase();
            return mascota;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Mascota> listarMascotas() throws Exception {//Método para consultar todas las mascotas de una base de datos, guardarlas en una lista y devolverla
        try {
            String sql = "SELECT * FROM Mascota ";
            consultarBase(sql);//Llamo al método heredado del DAO para hacer hacer una consulta y traer todas las mascotas, JUNTO CON SU USUARIO
            Mascota mascota = null;
            Collection<Mascota> mascotas = new ArrayList();
            while (resultado.next()) {
                mascota = new Mascota();
                mascota.setId(resultado.getInt(1));
                mascota.setApodo(resultado.getString(2));
                mascota.setRaza(resultado.getString(3));
                Integer idUsuario = resultado.getInt(4); //Guardo en una variable del tipo integer el id del usuario de la fila actual
                Usuario usuario = usuarioService.buscarUsuarioPorId(idUsuario); //Busco a ese usuario pasandole el id obtenido anteriormente y lo devuelvo en la fila actual de la mascota
                mascota.setUsuario(usuario); //Asigno el usuario devuelto en la mascota actual
                mascotas.add(mascota); //Guardo la mascota actual en la lista 
            }
            desconectarBase();
            return mascotas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}

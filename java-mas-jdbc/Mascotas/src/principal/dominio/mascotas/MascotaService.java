package principal.dominio.mascotas;

import java.util.Collection;
import principal.dominio.usuarios.Usuario;
import principal.persistencia.MascotaDAO;

public class MascotaService {

    private MascotaDAO dao; //Creamos una variable global del tipo MascotaDAO

    public MascotaService() {//Inicializa el objeto doa cuando hacemos nacer el MascotaService
        this.dao = new MascotaDAO();//Establecemos una relación de composición en la que MascotaService depende de MascotaDAO
    }

    //Éste método recibe por parámetro los atributos que tendrá el objeto mascota, los comprueba y lo inserta en la base de datos
    public void crearMascota(String apodo, String raza, Usuario usuario) throws Exception {
        try {
            //Validamos
            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }
            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }
            if (usuario == null) {
                throw new Exception("Debe indicar el Usuario");
            }
            //Creamos el mascota
            Mascota mascota = new Mascota();
            mascota.setApodo(apodo);
            mascota.setRaza(raza);
            mascota.setUsuario(usuario);
            dao.guardarMascota(mascota);//Llama al método guardarMascota del DAO y guarda en la base de datos
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarClaveMascota(int id, String apodo, String raza, int idUsuario) throws Exception {
        try {
            //Validamos
            if (id > 0) {
                throw new Exception("Debe indicar el id");
            }
            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }
            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }
            if (idUsuario < 0) {
                throw new Exception("Debe indicar el Usuario");
            }
            //Buscamos
            Mascota mascota = buscarMascotaPorId(id);
            dao.modificarMascota(mascota);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarMascota(int id) throws Exception {
        try {
            //Validamos 
            if (id < 0) {
                throw new Exception("Debe indicar el Id");
            }
            dao.eliminarMascota(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public Mascota buscarMascotaPorId(int id) throws Exception {
        try {
            //Validamos
            if (id < 0) {
                throw new Exception("Debe indicar el id");
            }
            Mascota mascota = dao.buscarMascotaPorId(id);
            //Verificamos
            if (mascota == null) {
                throw new Exception("No se econtró mascota para el correo electrónico indicado");
            }
            return mascota;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Mascota> listarMascota() throws Exception {
        try {
            Collection<Mascota> mascotas = dao.listarMascotas();
            return mascotas;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirMascotas() throws Exception {
        try {
            //Listamos los mascotas
            Collection<Mascota> mascotas = listarMascota();
            //Imprimimos los mascotas
            if (mascotas.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Mascota u : mascotas) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}

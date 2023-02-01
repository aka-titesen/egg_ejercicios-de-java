package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public final class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }

    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }

    public List<Autor> listarTodosLosAutores() {
        conectar();
        List<Autor> libros = (List<Autor>) em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return libros;
    }

}

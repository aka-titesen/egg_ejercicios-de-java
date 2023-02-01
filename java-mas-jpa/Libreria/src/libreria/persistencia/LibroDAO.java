package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public Libro buscarPorIsbn(String isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }

    public List<Libro> buscarLibroPorNombreAutor(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT b FROM Libro b WHERE b.autor.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarLibroPorNombreEditorial(String nombre) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT b FROM Libro b WHERE b.editorial.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> listarTodosLosLibros() {
        conectar();
        List<Libro> libros = (List<Libro>) em.createQuery("SELECT b FROM Libro b").getResultList();
        desconectar();
        return libros;
    }

}

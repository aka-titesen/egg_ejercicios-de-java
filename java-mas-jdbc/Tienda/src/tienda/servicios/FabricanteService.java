package tienda.servicios;

import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }

    public void crearFabricante(int codigo, String nombre) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Tiene un código de fabricante incorrecto");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de fabricante");
            }
            if (buscarFabricantePorNombre(nombre) != null) {
                throw new Exception("Ya existe un fabricante con el nombre indicado " + nombre);
            }
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    /*
    public void modificarNombreFabricante(int codigo, String nombreActual, String nombreNuevo) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Tiene un código de fabricante incorrecto");
            }
            if (nombreActual == null || nombreActual.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre de fabricante");
            }
            if (nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
                throw new Exception("Debe indicar el nuevo nombre del fabricante");
            }
            Fabricante fabricante = buscarFabricantePorCodigo(codigo);
            if (fabricante == null) {
                throw new Exception("No se econtró fabricante para el código indicado");
            }
            if (!fabricante.getNombre().equals(nombreActual)) {
                throw new Exception("El nombre actual que paso por parámetro no es la regsitrada en el sistema");
            }
            fabricante.setNombre(nombreNuevo);
            dao.modificarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
     */
 /*
    public void eliminarFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            dao.eliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
     */
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el correo electrónico");
            }
            Fabricante fabricante = dao.buscarFabricantePorNombre(nombre);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Debe indicar el id");
            }
            Fabricante fabricante = dao.buscarFabricantePorCodigo(codigo);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes();
            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirFabricantes() throws Exception {
        try {
            Collection<Fabricante> fabricantes = listarFabricantes();
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante f : fabricantes) {
                    System.out.println(f);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}

package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.FabricanteService;

public final class ProductoDAO extends DAO {

    private final FabricanteService fabricanteService;

    public ProductoDAO() {
        this.fabricanteService = new FabricanteService();
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (CODIGO, NOMBRE, PRECIO, CODIGO_FABRICANTE) "
                    + "VALUES ( " + producto.getCodigo() + ", '" + producto.getNombre() + "', " + producto.getPrecio() + ", " + producto.getFabricante().getCodigo() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarPrecioProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el mascota que desea modificar");
            }
            String sql = "UPDATE producto SET precio = " + producto.getPrecio() + " WHERE codigo = " + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    /*
    public void eliminarProducto(int codigo) throws Exception {
        try {
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
     */
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo =  " + codigo + ";";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigo_fabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCodigo(codigo_fabricante);
                producto.setFabricante(fabricante);
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigo_fabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCodigo(codigo_fabricante);
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> listarProductosCondicion() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        String criterioSelect = "";
        String criterioWhere = "";
        String sql = "";
        try {
            while (menu) {
                System.out.println(">> Ingrese el criterio de la consulta del SELECT" + "\n" + "Como por ejemplo, SELECT * o SELECT nombre, precio");
                System.out.print("----> Ingrese: ");
                criterioSelect = leer.next();

                System.out.println(">> ¿Desea agregar la cláusula WHERE?" + "\n" + ">> s/n");
                System.out.print("---> Seleccione: ");
                switch (leer.next().toUpperCase().charAt(0)) {
                    case 'S':
                        System.out.println(">> Ingrese el criterio de la consulta despues del from." + " \n" + "Como por ejemplo, WHERE precio < 100 o LIKE nombre %Portatil%." + " \n" + "¡No olvide de usar las comillas simples y cerrar con punto y coma!");
                        System.out.print("---> Ingrese: ");
                        criterioWhere = leer.next();
                        sql = "SELECT " + criterioSelect + " FROM producto " + criterioWhere;
                        menu = false;
                        break;
                    case 'N':
                        sql = "SELECT " + criterioSelect + " FROM producto;";
                        menu = false;
                        break;
                    default:
                        System.out.println("Opción incorrecta, vuelva a elegir");
                        break;
                }
            }
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                Integer codigo_fabricante = resultado.getInt(4);
                Fabricante fabricante = fabricanteService.buscarFabricantePorCodigo(codigo_fabricante);
                producto.setFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

}

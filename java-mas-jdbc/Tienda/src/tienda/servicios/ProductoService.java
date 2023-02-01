package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(int codigo, String nombre, double precio, Fabricante fabricante) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Debe el código");
            }
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }
            if (precio == 0 || precio < 0) {
                throw new Exception("Debe indicar el precio");
            }
            if (fabricante == null) {
                throw new Exception("Debe indicar el Usuario");
            }
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setFabricante(fabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarPrecioProducto(int codigo, double precioActual, double precioNuevo) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Debe indicar el código");
            }
            if (precioActual == 0 || precioActual < 0) {
                throw new Exception("Debe indicar el precio actual");
            }
            if (precioNuevo == 0 || precioNuevo < 0) {
                throw new Exception("Debe indicar el precio nuevo");
            }
            Producto producto = buscarProductoPorCodigo(codigo);
            if (producto == null) {
                throw new Exception("No se econtró producto para el código indicado");
            }
            producto.setPrecio(precioNuevo);
            dao.modificarPrecioProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    /*
    public void eliminarProducto(int codigo) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Debe indicar el código");
            }
            dao.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
     */
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            if (codigo == 0 || codigo < 0) {
                throw new Exception("Debe indicar el código");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        try {
            Collection<Producto> productos = listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                while (menu) {
                    System.out.println(">> ¿Desea mostrar la tabla con solo los nombre o con los nombres y sus precios?");
                    System.out.println(">> 1: para mostrar con los nombres" + "\n" + ">> 2: para mostrar con los nombres y sus precios" + "\n" + ">> 3: para mostrar todos los atributos" + "\n" + " >> 4: Salir");
                    System.out.print("---> Seleccione: ");
                    switch (leer.nextInt()) {
                        case 1:
                            System.out.println("=== Tabla de los productos ===");
                            for (Producto p : productos) {
                                System.out.println(p.getNombre());
                            }
                            break;
                        case 2:
                            System.out.println("=== Tabla de los productos ===");
                            for (Producto p : productos) {
                                System.out.println(p.getNombre() + " - $ " + p.getPrecio());
                            }
                            break;
                        case 3:
                            System.out.println("=== Tabla de los productos ===");
                            for (Producto p : productos) {
                                System.out.println(p.toString());
                            }
                            break;
                        case 4:
                            menu = false;
                            break;
                        default:
                            System.out.println(">> Opción incorrecta, vuelva a elegir");
                            break;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductosCondicion() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductosCondicion();
            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosCondicion() throws Exception {
        try {
            Collection<Producto> productos = listarProductosCondicion();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
        }
    }
}

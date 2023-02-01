package tienda;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

public class TiendaService {

    private final FabricanteService fabricanteService;
    private final ProductoService productoService;

    public TiendaService() {
        this.fabricanteService = new FabricanteService();
        this.productoService = new ProductoService();
    }

    public void menu() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        System.out.println("====== Bienvenido al software de administración de la tienda ======");
        System.out.println(">> Puede realizar las siguientes acciones: ");
        System.out.println("1: Listar todos los productos de la tabla");
        System.out.println("2: Listar productos en base a condiciones en la cláusula where y criterios en la select");
        System.out.println("3: Cambiar el precio de un producto");
        System.out.println("4: Ingresar un producto");
        System.out.println("5: Ingresar un fabricante");
        System.out.println("6: Editar un producto");
        System.out.println("7: Salir");
        while (menu) {
            System.out.print("---> Seleccione una: ");
            switch (leer.nextByte()) {
                case 1:
                    boolean menuLista = true;
                    while (menuLista) {
                        System.out.println(">> 1: Desea listar los productos" + "\n" + ">> 2: Desea listar los fabricantes" + "\n" + ">> 3: Salir del menu");
                        switch (leer.nextByte()) {
                            case 1:
                                productoService.imprimirProductos();
                                break;
                            case 2:
                                fabricanteService.imprimirFabricantes();
                                break;
                            case 3:
                                System.out.println(">> Volviendo al menú");
                                menuLista = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    productoService.imprimirProductosCondicion();
                    break;
                case 3:
                    System.out.print("---> Ingrese el código del producto: ");
                    int codigo = leer.nextInt();
                    System.out.print("---> Ingrese el precio actual: ");
                    double precioActual = leer.nextDouble();
                    System.out.print("---> Ingrese el precio nuevo: ");
                    double precioNuevo = leer.nextDouble();
                    productoService.modificarPrecioProducto(codigo, precioActual, precioNuevo);
                    break;
                case 4:
                    System.out.print("---> Ingrese el código del nuevo producto:");
                    int codigoProducto = leer.nextInt();
                    System.out.print("---> Ingrese el nombre del nuevo producto:");
                    String nombreProducto = leer.next();
                    System.out.print("---> Ingrese el precio del nuevo producto:");
                    double precioProducto = leer.nextDouble();
                    System.out.print("---> Ingrese el codigo del fabricante:");
                    Integer codigo_fabricante = leer.nextInt();
                    Fabricante fabricanteProducto = fabricanteService.buscarFabricantePorCodigo(codigo_fabricante);
                    productoService.crearProducto(codigoProducto, nombreProducto, precioProducto, fabricanteProducto);
                    break;
                case 5:
                    System.out.print("---> Ingresa el código del nuevo: ");
                    int codigoFabricante = leer.nextInt();
                    System.out.print("---> Ingresa el nombre del fabricante: ");
                    String nombreFabricante = leer.next();
                    fabricanteService.crearFabricante(codigoFabricante, nombreFabricante);
                    break;
                case 6:
                    System.out.print("---> Ingrese el código del producto: ");
                    int codigoProductoModificar = leer.nextInt();
                    System.out.print("---> Ingrese el precio actual: ");
                    double precioActualProducto = leer.nextDouble();
                    System.out.print("---> Ingrese el precio nuevo: ");
                    double precioNuevoProducto = leer.nextDouble();
                    productoService.modificarPrecioProducto(codigoProductoModificar, precioActualProducto, precioNuevoProducto);
                    break;
                case 7:
                    System.out.println(">> Salió del programa...");
                    menu = false;
                    break;
                default:
                    System.out.println(">> Opción incorrecta, vuelva a elegir");
                    break;
            }

        }

    }

}

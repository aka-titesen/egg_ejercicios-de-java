package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioDeProducto {

    public Producto fabricaDeProductos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Map<String, Double> productos = new HashMap<>();
        System.out.print("---> ¿Cuántos productos va a cargar en el mapa?:");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el nombre del producto N° " + (i + 1));
            String nombre = leer.next().toUpperCase();
            System.out.println("Ingresa el precio del producto N° " + (i + 1));
            Double precio = leer.nextDouble();
            productos.put(nombre, precio);
        }
        return new Producto(productos);
    }

    public void cargarUnProducto(Producto p1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre = "";
        Double precio = 0.0;
        System.out.println("¿Desea cargar un producto?");
        System.out.print("---> Ingrese s/n:");
        if (leer.next().equalsIgnoreCase("S")) {
            System.out.print("---> Ingresa el nombre del producto:");
            nombre = leer.next().toUpperCase();
            System.out.print("---> Ingresa el precio del producto:");
            precio = leer.nextDouble();
            p1.getProducto().put(nombre, precio);
        } else {
            System.out.println("OK :')");
        }
    }

    public void modificarPrecio(Producto p1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Double nuevoPrecio = 0.0;
        System.out.print("---> Ingrese un producto que sea modificar su precio:");
        String productoBuscar = leer.next().toUpperCase();
        if (p1.getProducto().containsKey(productoBuscar)) {
            System.out.print("---> Ingrese el nuevo precio de " + productoBuscar + ":");
            nuevoPrecio = leer.nextDouble();
            p1.getProducto().put(productoBuscar, nuevoPrecio);
        } else {
            System.out.println("> El producto no se encuentra en la lista");
        }
    }

    public void eliminarUnProducto(Producto p1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("---> Ingrese un producto que sea eliminar:");
        String productoEliminar = leer.next().toUpperCase();
        if (p1.getProducto().containsKey(productoEliminar)) {
            p1.getProducto().remove(productoEliminar);
        } else {
            System.out.println("> El producto no se encuentra en la lista");
        }
    }

    public void mostrarListaDeProductos(Producto p1) {
        System.out.println("========= Lista de todos los productos =========");
        for (Map.Entry<String, Double> producto : p1.getProducto().entrySet()) {
            System.out.println("> Producto = " + producto.getKey() + ", precio = $" + producto.getValue() + "\n");
        }
    }

    public void menuFinalProductos(Producto p1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        if (p1.getProducto().isEmpty()) {
            System.out.println("> La la lista se encuentra vacía");
        } else {
            System.out.println("========= Bienvenido al asistente de los productos =========");
            System.out.println("====== Pueda realizar las siguientes operaciones ======");
            System.out.println("1: Introducir un nuevo elemento");
            System.out.println("2: Modificar el precio de un elemento");
            System.out.println("3: Eliminar un elemento");
            System.out.println("4: Mostrar lista de los productos con su precio");
            System.out.println("5: Finalizar programa");
            System.out.println("¿Desea realizar alguna operación?");
            System.out.print("---> Ingrese s/n");
            if (leer.next().equalsIgnoreCase("S")) {
                do {
                    System.out.println("---> Ingrese una de las opciones");
                    switch (leer.nextInt()) {
                        case 1:
                            cargarUnProducto(p1);
                            break;
                        case 2:
                            modificarPrecio(p1);
                            break;
                        case 3:
                            eliminarUnProducto(p1);
                            break;
                        case 4:
                            mostrarListaDeProductos(p1);
                            break;
                        case 5:
                            System.out.println("> Programa finalizado");
                            menu = false;
                            break;
                        default:
                            System.out.println("> Opción incorrecta, vuelve al menú nuevamente");
                            break;
                    }
                } while (menu);
            } else {
                System.out.println("> Entiendo :') gracias por usar la app");
            }

        }
    }
}

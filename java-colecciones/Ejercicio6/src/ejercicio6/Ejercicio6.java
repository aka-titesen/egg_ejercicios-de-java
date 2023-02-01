package ejercicio6;

import Entidad.Producto;
import Servicio.ServicioDeProducto;
import java.util.Map;

public class Ejercicio6 {

    public static void main(String[] args) {
        Servicio.ServicioDeProducto sdp = new ServicioDeProducto();
        Producto productosDeLimpieza = sdp.fabricaDeProductos();
        sdp.menuFinalProductos(productosDeLimpieza);
    }
}

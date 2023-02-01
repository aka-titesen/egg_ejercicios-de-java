package Entidad;

import java.util.Map;

public class Producto {

    private Map<String, Double> productos;

    public Producto() {
    }

    public Producto(Map<String, Double> productos) {
        this.productos = productos;
    }

    public Map<String, Double> getProducto() {
        return productos;
    }

    public void setProducto(Map<String, Double> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Productos{" + "productos=" + productos + '}';
    }
}

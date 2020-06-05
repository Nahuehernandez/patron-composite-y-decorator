package producto.tiposProducto;

import producto.Producto;

public class ProductoSimple extends Producto {
    private int precio;
    private int stock;

    public ProductoSimple(int codigo, String descripcion, String marca, int precio, int stock) {
        super(codigo, descripcion, marca);
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public int precio() {
        return this.precio;
    }

    @Override
    public int stock() {
        return this.stock;
    }
}

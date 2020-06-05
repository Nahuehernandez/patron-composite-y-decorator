package producto.decorado;

import jdk.nashorn.internal.ir.annotations.Ignore;
import producto.Producto;

public class Packaging extends Decorado{
    private int precio;

    public Packaging(int codigo, String descripcion, String marca, Producto producto, int precio) {
        super(codigo, descripcion, marca, producto);
        this.precio = precio;
    }

    @Override
    public int precio() {
        return producto.precio() + this.precio;
    }

    @Ignore
    public int stock() {
        return 0;
    }
}

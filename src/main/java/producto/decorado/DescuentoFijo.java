package producto.decorado;

import jdk.nashorn.internal.ir.annotations.Ignore;
import producto.Producto;

public class DescuentoFijo extends Decorado{
    private int monto;

    public DescuentoFijo(int codigo, String descripcion, String marca, Producto producto, int monto) {
        super(codigo, descripcion, marca, producto);
        this.monto = monto;
    }

    @Override
    public int precio() {
        return producto.precio() - this.monto;
    }

    @Ignore
    public int stock() {
        return 0;
    }

}

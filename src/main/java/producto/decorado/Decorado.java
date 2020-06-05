package producto.decorado;

import producto.Producto;

public abstract class Decorado extends Producto {
    protected Producto producto;

    public Decorado(int codigo, String descripcion, String marca, Producto producto) {
        super(codigo, descripcion, marca);
        this.producto = producto;
    }

    public abstract int precio();

}
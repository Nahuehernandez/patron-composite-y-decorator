package producto.tiposProducto;

import producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {
    private List<Producto> productos = new ArrayList<Producto>();

    public Combo(int codigo, String descripcion, String marca) {
        super(codigo, descripcion, marca);
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public int precio() {
        return productos.stream().mapToInt(Producto::precio).sum();
    }

    @Override
    public int stock() {
        return productos.stream().mapToInt(Producto::stock).min().getAsInt();
    }
}

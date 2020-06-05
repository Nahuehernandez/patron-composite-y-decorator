package producto;

public abstract class Producto {
    private int codigo;
    private String descripcion;
    private String marca;

    public Producto(int codigo, String descripcion, String marca) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public abstract int precio();

    public abstract int stock();

}

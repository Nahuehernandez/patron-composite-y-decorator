package producto.decorado;

import instanciador.Instanciador;
import org.junit.Before;
import org.junit.Test;
import producto.Producto;
import producto.tiposProducto.Combo;
import producto.tiposProducto.ProductoSimple;
import static org.junit.Assert.assertEquals;

public class DescuentoYPackage {
    private Instanciador instanciador;
    private DescuentoFijo descuento;
    private Packaging packaging;
    private ProductoSimple celular;
    private ProductoSimple auricularBluetooth;
    private ProductoSimple funda;
    private Combo combo1;

    @Before
    public void setup(){
        instanciador = new Instanciador();
        celular = instanciador.crearCelular();
        auricularBluetooth = instanciador.crearAuricularesBluetooth();
        funda = instanciador.crearFunda();
        combo1 = instanciador.crearCombo1();
        combo1.agregarProducto(celular);
        combo1.agregarProducto(auricularBluetooth);
    }


    @Test
    public void precioFinalConDescuentoYPackaging_debeRetornar19500(){
        Producto descuentoACelular = new DescuentoFijo(23,"descuento de 1000 pesos en la compra",
                "banco nacion", celular,1000);
        Producto agregaPackaging = new Packaging(24,"caja decorada","local",
                descuentoACelular,500);

        assertEquals(19500,agregaPackaging.precio());
    }

    @Test
    public void precioFinalCombo1_debeRetornar23000(){
        Producto descuentoCombo1 = new DescuentoFijo(1,"descuento de 500 pesos en la combra",
                "local",combo1,3000);
        Producto compraPackaging = new Packaging(2,"caja decorada","local",descuentoCombo1,
                1000);

        assertEquals(23000,compraPackaging.precio());
    }
}
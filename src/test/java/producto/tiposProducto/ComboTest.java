package producto.tiposProducto;

import instanciador.Instanciador;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComboTest {
    private Instanciador instanciador;
    private ProductoSimple celular;
    private ProductoSimple auricularBluetooth;
    private ProductoSimple funda;
    private Combo combo1;
    private Combo combo2;

    @Before
    public void setup(){
        instanciador = new Instanciador();
        celular = instanciador.crearCelular();
        auricularBluetooth = instanciador.crearAuricularesBluetooth();
        funda = instanciador.crearFunda();
        combo1 = new Combo(1,"celular mas auricular bluetooth","local");
        combo1.agregarProducto(celular);
        combo1.agregarProducto(auricularBluetooth);
    }

    //PRECIOS COMBO

    @Test
    public void precioCombo_debeRetornar25000(){
        assertEquals(25000,combo1.precio());
    }

    @Test
    public void precioComboDeCombos_debeRetornar25100(){
        combo2 = new Combo(2,"combo1 mas una funda","local");
        combo2.agregarProducto(funda);
        combo2.agregarProducto(combo1);

        assertEquals(25100,combo2.precio());
    }

    //STOCK COMBOS
    @Test
    public void stockComboTest_debeRetornar50(){
        assertEquals(50,combo1.stock());
    }

    @Test
    public void stockComboDeCombosTest_debeRetornar50(){
        combo2 = new Combo(2,"combo1 mas una funda","local");
        combo2.agregarProducto(funda);
        combo2.agregarProducto(combo1);

        assertEquals(50,combo2.stock());
    }

}
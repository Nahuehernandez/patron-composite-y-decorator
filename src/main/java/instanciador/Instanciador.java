package instanciador;

import producto.tiposProducto.Combo;
import producto.tiposProducto.ProductoSimple;

public class Instanciador {

    //Productos simples

    public ProductoSimple crearCelular(){
        return new ProductoSimple(123,"Celular Moto G7","Motorola",20000,100);
    }

    public ProductoSimple crearAuricularesBluetooth(){
        return new ProductoSimple(300,"Auriculares bluetooth","Sony",5000,50);
    }

    public ProductoSimple crearAuricularesPorCable(){
        return new ProductoSimple(305,"Auriculares simples","Energy System",500,20);
    }

    public ProductoSimple crearFunda() {
        return new ProductoSimple(12, "Funda para celular", "Claro rey", 100, 50);
    }


    //Combos

    public Combo crearCombo1(){
        return new Combo(1,"celular mas auricular bluetooth","local");
    }

}
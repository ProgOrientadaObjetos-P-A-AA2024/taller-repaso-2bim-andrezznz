package paquete01;

import java.util.ArrayList;
import paquete02.Comprador;
import paquete02.Consecionaria;
import paquete03.*;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Consecionaria> listaAutos = new ArrayList<>();
               
        Comprador comp1 = new Comprador("Andres", "Cardenas");
        Comprador comp2 = new Comprador("Julio", "Cesar");
        Comprador comp3 = new Comprador("Sebastian", "Aguilar");
        Comprador comp4 = new Comprador("Sebastian", "Armijos");
        
        TipoSedan ts = new TipoSedan(comp1, "Lexus", 1250, 15);
        ts.calcularValorDescuento();
        ts.calcularSeguroMecanico();
        ts.calcularPrecioFinal();
        
        TipoSedan ts1 = new TipoSedan(comp2, "Hyundai", 1400, 20);
        ts1.calcularValorDescuento();
        ts1.calcularSeguroMecanico();
        ts1.calcularPrecioFinal();
        
        TipoSuv tv = new TipoSuv(comp3, "Toyota", 1450, 12);
        tv.calcularSeguro();
        tv.calcularPrecioFinal();
        
        TipoCamioneta tp = new TipoCamioneta(comp4, "Audi", 1700, 20);
        tp.calcularValorAdicionalFijoImportacion();
        tp.calcularSeguroAdicionalMantenimiento();
        tp.calcularPrecioFinal();
        
        
    }
    
}

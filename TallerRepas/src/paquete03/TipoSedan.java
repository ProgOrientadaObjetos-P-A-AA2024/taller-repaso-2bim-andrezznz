package paquete03;

import paquete02.Auto;
import paquete02.Comprador;

public class TipoSedan extends Auto {
    
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(Comprador pa, String m, double p, double por) {
        super(pa, m, p);
        porcentajeDescuento = por;
    }
    
    public void establecerPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }
    
    public void calcularValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    public void calcularSeguroMecanico() {
        seguroAdicionalMecanico = precioBase * 0.1;
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = (precioBase - valorDescuento) + seguroAdicionalMecanico;
    }
    
    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("TIPO SEDAN\n"
                + "%s"
                + "Porcentaje Descuento: %.2f\n"
                + "Valor Deescuento: %.2f\n"
                + "Seeguro Adicional Mecanico: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeDescuento,
                valorDescuento,
                seguroAdicionalMecanico,
                precioFinal);
        
        return cadena;  
    }
}

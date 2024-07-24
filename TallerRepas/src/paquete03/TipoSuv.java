package paquete03;

import paquete02.Comprador;
import paquete02.Consecionaria;

public class TipoSuv extends Consecionaria {
    
    private double porcentajeAdicionalSeguro;
    private double seguroPersonas;

    public TipoSuv(double por, Comprador pa, String m, double p) {
        super(pa, m, p);
        porcentajeAdicionalSeguro = por;
    }
    
    public void establecerPorcentajeAdicionalSeguro(double p) {
        porcentajeAdicionalSeguro = p;
    }
    
    public void calcularSeguro() {
        seguroPersonas = precioBase * (porcentajeAdicionalSeguro / 100);
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }

    public double obtenerPorcentajeAdicionalSeguro() {
        return porcentajeAdicionalSeguro;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("TIPO SUV\n"
                + "%s"
                + "Porcentaje Adicional Seguro Persona: %.2f\n"
                + "Seguro De Persona: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeAdicionalSeguro,
                seguroPersonas,
                precioFinal);
        
        return cadena;
    }
}

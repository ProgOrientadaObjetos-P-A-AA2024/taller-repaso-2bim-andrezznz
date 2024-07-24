package paquete03;

import paquete02.Comprador;
import paquete02.Consecionaria;

public class TipoCamioneta extends Consecionaria {
    
    private double porcentajeAdicionalFijoImportacion;
    private double valorAdicionalFijoImportacion;
    private double seguroAdicionalMantenimiento;

    public TipoCamioneta(double pro, Comprador pa, String m, double p) {
        super(pa, m, p);
        porcentajeAdicionalFijoImportacion = pro;
    }
    
    public void establecerPorcentajeAdicionalFijoImportacion(double p) {
        porcentajeAdicionalFijoImportacion = p;
    }
    
    public void calcularValorAdicionalFijoImportacion() {
        valorAdicionalFijoImportacion = precioBase * 
                (porcentajeAdicionalFijoImportacion / 100);;
    }
    
    public void calcularSeguroAdicionalMantenimiento() {
        seguroAdicionalMantenimiento = valorAdicionalFijoImportacion * 1.5;
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + valorAdicionalFijoImportacion + 
                seguroAdicionalMantenimiento;
    }
    
    public double obtenerPorcentajeAdicionalFijoImportacion() {
        return porcentajeAdicionalFijoImportacion;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("TIPO CAMIONETA\n"
                + "%s"
                + "Porcentaje Adicional Fijo por Importacion: %.2f\n"
                + "Valor Adicional Fijo por Importacion: %.2f\n"
                + "Seguro Adiconal por Mantenimiento: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeAdicionalFijoImportacion  ,
                valorAdicionalFijoImportacion,
                seguroAdicionalMantenimiento,
                precioFinal);
        
        return cadena;
    }
}

package paquete02;

import java.util.ArrayList;

public class Concesionaria {
    
    private String nombre;
    private ArrayList<Auto> listadoVehiculos = new ArrayList<>();
    private double ventasTotales;
    private double costoVehiculoMasCaro;
    private double costoVehiculoMasBarato;

    public Concesionaria(String n) {
        nombre = nombre;
    }

    public void establecerVehiculo(Auto vehiculo) {
        listadoVehiculos.add(vehiculo);
        calcularEstadisticas();
    }

    private void calcularEstadisticas() {
        ventasTotales = 0;

        for (Auto vehiculo : listadoVehiculos) {
            double precioFinal = vehiculo.obtenerPrecioFinal();
            ventasTotales += precioFinal;
            if (precioFinal > costoVehiculoMasCaro) {
                costoVehiculoMasCaro = precioFinal;
            }
            if (precioFinal < costoVehiculoMasBarato) {
                costoVehiculoMasBarato = precioFinal;
            }
        }
    }

    public String obetenerNombre() {
        return nombre;
    }

    public ArrayList<Auto> obetenerListadoVehiculos() {
        return listadoVehiculos;
    }

    public double obetenerVentasTotales() {
        return ventasTotales;
    }

    public double obetenerCostoVehiculoMasCaro() {
        return costoVehiculoMasCaro;
    }

    public double obetenerCostoVehiculoMasBarato() {
        return costoVehiculoMasBarato;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("CONCESIONARIA\n"
                + "Nombre: %s\n",
                nombre);
        
        cadena += ("Listado De Autos\n");
        for (Auto vehiculo : listadoVehiculos) {
            System.out.printf(vehiculo.toString());
        }
        
        cadena += String.format("\nVentas Totales: %.2f\n"
                + "Costo Vehiculos Mas Caro: %.2f\n"
                + "Costo Vehiculos Mas Baratos: %.2f\n",
        ventasTotales, costoVehiculoMasCaro, costoVehiculoMasBarato);
        
        return cadena;
    }
}

package paquete01;

import paquete02.Comprador;
import paquete02.Concesionaria;
import paquete03.*;

public class Principal {

    public static void main(String[] args) {
        
        Comprador comprador1 = new Comprador("Juan Perez", "0102030405");
        Comprador comprador2 = new Comprador("Maria Garcia", "0203040506");
        Comprador comprador3 = new Comprador("Luis Rodriguez", "0304050607");

        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota", 20000, 10);
        TipoSedan sedan2 = new TipoSedan(comprador2, "Honda", 18000, 15);
        TipoSuv suv1 = new TipoSuv(comprador3, "Ford", 30000, 10);
        TipoCamioneta camioneta1 = new TipoCamioneta(comprador1, "Chevrolet", 
                25000, 12);

        Concesionaria concesionaria = new Concesionaria("Concesionaria Andres");
        concesionaria.establecerVehiculo(sedan1);
        concesionaria.establecerVehiculo(sedan2);
        concesionaria.establecerVehiculo(suv1);
        concesionaria.establecerVehiculo(camioneta1);

        System.out.println(concesionaria);
    }
    
}

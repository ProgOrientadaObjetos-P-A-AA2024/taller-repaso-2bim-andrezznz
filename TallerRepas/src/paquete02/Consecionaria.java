package paquete02;

public abstract class Consecionaria {
    
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Consecionaria(Comprador pa, String m, double p) {
        propietario = pa;
        marca = m;
        precioBase = p;
    }
    
    public void establecerPropietario(Comprador p) {
        propietario = p;
    }
    
    public void establecerMarca(String m) {
        marca = m;
    }
    
    public void establecerPrecioBase(double p) {
        precioBase = p;
    }
    
    public abstract void calcularPrecioFinal();
    
    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("CONSECIONARIA\n"
                + "%s"
                + "Marca: %s\n"
                + "Precio Base: %s\n",
                propietario.toString(),
                marca,
                precioBase);
        
        return cadena;
    }
}

package paquete02;

public class Comprador {
    
    private String nombres;
    private String cedula;

    public Comprador(String n, String a) {
        nombres = n;
        cedula = a;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }
    
    public void establecerApellidos(String a) {
        cedula = a;
    }
    
    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return cedula;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("Nombres: %s\n"
                + "Cedula: %s\n",
                nombres,
                cedula);
        
        return cadena;
    }
}

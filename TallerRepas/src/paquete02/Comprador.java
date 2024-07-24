package paquete02;

public class Comprador {
    
    private String nombres;
    private String apellidos;

    public Comprador(String n, String a) {
        nombres = n;
        apellidos = a;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }
    
    public void establecerApellidos(String a) {
        apellidos = a;
    }
    
    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("Nombres: %s\n"
                + "Apellidos: %s\n",
                nombres,
                apellidos);
        
        return cadena;
    }
}

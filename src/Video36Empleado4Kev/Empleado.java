
package Video36Empleado4Kev;

import java.util.*;

public class Empleado {
    
    public Empleado(String nom){
        
        nombre = nom;
        seccion = "Administracion";
        
    }
    
    public void cambiaSeccion(String seccion){
        
        this.seccion = seccion;
        
    }
    
    
    public String devuelveDatos(){
        
        return "El nombre es : " + nombre + " y la sección es " + seccion;
        
    }
    
    private final String nombre;
    private String seccion;
    
    
    
}

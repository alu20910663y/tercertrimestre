
package practica91;

import java.util.ArrayList;


public class Usuarios {
   
    private String nombre;
    private String apellido;
    private String dni;
    private static int contador=0;
    private int id;
    private ArrayList<String> librosprestados=new ArrayList<>();
    
    public Usuarios(String nombre,String apellido,String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        id=contador;
        contador++;        
    }
    
    public String Get_nombre(){
        return nombre;
    }
    public String Get_apellido(){
        return apellido;
    }
    public String Get_dni(){
        return dni;
    }
    public int Get_id(){
        return id;
    }
    public int Get_contador(){
        return contador;
    }
    
    public void Set_nombre(String nombre){
        this.nombre=nombre;
    }
    public void Set_apellido(String apellido){
        this.apellido=apellido;
    }
    public void Set_dni(String dni){
        this.dni=dni;
    }
    
    
    
    
    
    
    
    
    
    
    
}

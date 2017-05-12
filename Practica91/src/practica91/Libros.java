
package practica91;

import java.util.ArrayList;


public class Libros {
   
    private String nombre;
    private static int contador=0;
    private int id;
    private int ejemplares;
    private int prestamos;
    private ArrayList<Integer> librosprestados=new ArrayList<>();
    
    
    
    public Libros(String nombre,int ejemplares){
        this.nombre=nombre;
        this.ejemplares=ejemplares;
    }
    
    public String Get_nombre(){
        return nombre;
    }
    public int Get_id(){
        return id;
    }
    public int Get_ejemplares(){
        return ejemplares;
    }
    public int Get_prestamos(){
        return prestamos;
    }
    
    public void Set_nombre(String nombre){
        this.nombre=nombre;
        this.ejemplares=ejemplares;
        this.prestamos=prestamos;
    }
    
    
}

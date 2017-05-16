
package practica91;

import java.util.ArrayList;
import java.util.Iterator;


public class Libros {
   
    private String nombre;
    private static int contador=0;
    private int id;
    private int ejemplares;
    private int prestamos=0;
    private ArrayList<Integer> usuariosprestados=new ArrayList<>();
    
    
    
    public Libros(String nombre,int ejemplares){
        this.nombre=nombre;
        this.ejemplares=ejemplares;
        id=contador;
        contador++;
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
    }
    public void Set_ejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public void Aumentar_prestamo(){
        prestamos++;
    }
    public void Reducir_prestamo(){
        prestamos--;
    }
    public void Añadir_usuario(int usuario){
    usuariosprestados.add(usuario);
    }
    public void Borrar_usuario(int usuario){
        usuariosprestados.remove(usuariosprestados.indexOf(usuario));
    }
    
    public void Mostrar_usuario(){
        Iterator<Integer> Iterator=usuariosprestados.iterator();
        while(Iterator.hasNext()){
            int contenido=Iterator.next();
            System.out.print(contenido+" ");
        }
    }
}


package practica91;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version 1
 * @author carlos
 */
public class Usuarios {
   
    private String nombre;
    private String apellido;
    private String dni;
    private static int contador=0;
    private int id;
    private ArrayList<Integer> librosprestados=new ArrayList<>();
    
    /**
     * Constructore con parametros
     * @param nombre
     * @param apellido
     * @param dni 
     */
    public Usuarios(String nombre,String apellido,String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        id=contador;
        contador++;        
    }
    /**
     * Obtiene el nombre
     * @return nombre
     */
    public String Get_nombre(){
        return nombre;
    }
    /**
     * Obtiene el apellido
     * @return apellido
     */
    public String Get_apellido(){
        return apellido;
    }
    /**
     * Obtiene el dni
     * @return dni
     */
    public String Get_dni(){
        return dni;
    }
    /**
     * Obtiene la id
     * @return id
     */
    public int Get_id(){
        return id;
    }
    /**
     * Obtiene el contador
     * @return contador
     */
    public int Get_contador(){
        return contador;
    }
    /**
     * Introduce el nombre
     * @param nombre 
     */
    public void Set_nombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Introduce el apellido
     * @param apellido 
     */
    public void Set_apellido(String apellido){
        this.apellido=apellido;
    }
    /**
     * Introduce el dni
     * @param dni 
     */
    public void Set_dni(String dni){
        this.dni=dni;
    }
    
    /**
     * Añade un libro al arraylist
     * @param idlibro 
     */
    public void Añadir_libro(int idlibro){
        librosprestados.add(idlibro);
    }
    /**
     * Borra un libro del arraylist
     * @param idlibro 
     */
    public void Borrar_libro(int idlibro){
        librosprestados.remove(librosprestados.indexOf(idlibro));
    }
    
    /**
     * Muestra los datos del arraylist
     */
    public void Mostrar_libros(){
        Iterator<Integer> Iterator=librosprestados.iterator();
        while(Iterator.hasNext()){
            int contenido=Iterator.next();
            System.out.print(contenido+" ");
        }
    }   
}


package practica91;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version 1
 * @author carlos
 */
public class Libros {
   
    private String nombre;
    private static int contador=0;
    private int id;
    private int ejemplares;
    private int prestamos=0;
    private ArrayList<Integer> usuariosprestados=new ArrayList<>();
    
    /**
     * Constructor con parametros
     * @param nombre
     * @param ejemplares 
     */
    
    public Libros(String nombre,int ejemplares){
        this.nombre=nombre;
        this.ejemplares=ejemplares;
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
     * obtiene la id
     * @return id
     */
    public int Get_id(){
        return id;
    }
    /**
     * Obtiene los ejemplares
     * @return ejemlares
     */
    public int Get_ejemplares(){
        return ejemplares;
    }
    /**
     * Obtiene los prestamos
     * @return prestamos
     */
    public int Get_prestamos(){
        return prestamos;
    }
    /**
     * Introduce el nombre
     * @param nombre 
     */
    public void Set_nombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Introduce los ejemplares
     * @param ejemplares 
     */
    public void Set_ejemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    /**
     * Aumenta el prestamo
     */
    public void Aumentar_prestamo(){
        prestamos++;
    }
    /**
     * Reduce el prestamo
     */
    public void Reducir_prestamo(){
        prestamos--;
    }
    /**
     * Añade un usuario al arraylist
     * @param usuario 
     */
    public void Añadir_usuario(int usuario){
    usuariosprestados.add(usuario);
    }
    /**
     * Borra un usuario del arraylist
     * @param usuario 
     */
    public void Borrar_usuario(int usuario){
        usuariosprestados.remove(usuariosprestados.indexOf(usuario));
    }
    /**
     * Muestra los datos del arraylist
     */
    public void Mostrar_usuario(){
        Iterator<Integer> Iterator=usuariosprestados.iterator();
        while(Iterator.hasNext()){
            int contenido=Iterator.next();
            System.out.print(contenido+" ");
        }
    }
}

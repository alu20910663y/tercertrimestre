
package practica86;

/**
 * @version 1
 * @author carlos
 */
public class Contador {
    
    private int contador;
    
    /**
     * Constructor por defecto
     */
    public Contador(){
        contador=0;
    }
    /**
     * Constructor con parametros
     * @param contador 
     */
    public Contador(int contador){
        this.contador=contador;
    }
    
    /**
     * Obtiene contador
     * @return contador
     */
    public int GetContador(){
        return contador;
    }
    /**
     * Introduce contador
     * @param contador 
     */
    public void SetContador(int contador){
        this.contador=contador;
    }
    /**
     * Incrementa el contador
     */
    
    public void IncrementarContador(){
        contador++;
    }
    /**
     * Reduce el contador
     */
    public void DecrementarContador(){
        contador--;
    }
    
    
    
}

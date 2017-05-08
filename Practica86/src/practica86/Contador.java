
package practica86;


public class Contador {
    
    private int contador;
    
    public Contador(){
        contador=0;
    }
    public Contador(int contador){
        this.contador=contador;
    }
    
    
    public int GetContador(){
        return contador;
    }
    public void SetContador(int contador){
        this.contador=contador;
    }
    
    public void IncrementarContador(){
        contador++;
    }
    public void DecrementarContador(){
        contador--;
    }
    
    
    
}

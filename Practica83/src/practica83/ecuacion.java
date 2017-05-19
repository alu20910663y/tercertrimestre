
package practica83;
/**
 * @version 1
 * @author carlos
 */

public class ecuacion {
    
    private int a;
    private int b;
    private int c;
    private double resultadop;
    private double resultadon;
    
    /**
     * Constructor que inicializa las variables a,b y c
     * @param a
     * @param b
     * @param c 
     */
    public ecuacion(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;   
    }
    /**
     * Metodo que calcula la raiz tanto en suma como en resta
     */
    private void calcular(){
        resultadop=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        resultadon=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
    }
    /**
     * Metodo que devuelve los resultados
     */
    public void Getresultados(){
        calcular();
        System.out.println(resultadop);
        System.out.println(resultadon);
    }
    
    
    
}

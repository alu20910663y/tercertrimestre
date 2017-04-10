
package practica83;


public class ecuacion {
    
    private int a;
    private int b;
    private int c;
    private double resultadop;
    private double resultadon;
    
    
    public ecuacion(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;   
    }
    
    private void calcular(){
        resultadop=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        resultadon=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
    }
    
    public void Getresultados(){
        calcular();
        System.out.println(resultadop);
        System.out.println(resultadon);
    }
    
    
    
}


package practica76;
/**
 * @author carlos
 * @version 1
 */

public class calculadora {
    
   private int num1;
   private int num2;
   private int resultado;
   
   /**
    * Cnstructor,se pasan los parametros num1 y num2
    * @param num1
    * @param num2 
    */
   public calculadora(int num1,int num2){
       this.num1=num1;
       this.num2=num2;
   }
   /**
    * Metodo suma 
    */
   
   
   public int GetSuma(){
       resultado=num1+num2;
       return resultado;
   }
   /**
    * Metodo resta
    */
   public int GetResta(){
       resultado=num1-num2;
       return resultado;
   }
   /**
    * Metodo multiplicacion
    */
   public int GetMult(){
       resultado=num1*num2;
       return resultado;
   }
   /**
    * Metodo division 
    */
   public int GetDiv(){
       resultado=num1/num2;
       return resultado;
   }
   
}

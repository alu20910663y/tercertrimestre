
package practica80;

/**
 * @author carlos
 * @version 1
 */
public class cubo {
   private int arista;
   private double area;
   
   /**
    * Constructor que pasandole la arista calcula el area
    * @param arista 
    */
   public cubo(int arista){
       this.arista=arista;
       area=Math.pow(arista,2)*6;
   }
   /**
    * Metodo que devuelve el area
    * @return area
    */
   public double Getarea(){
       
       return area;
   }
   
}

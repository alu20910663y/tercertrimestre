
package practica80;


public class cubo {
   private int arista;
   private double area;
   
   
   public cubo(int arista){
       this.arista=arista;
       area=Math.pow(arista,2)*6;
   }
   
   public double Getarea(){
       
       return area;
   }
   
}

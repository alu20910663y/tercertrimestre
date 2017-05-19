
package practica79;
/**
 * @author carlos
 * @version 1
 */

public class pentagono {
   
    double perimetro;
    double apotema;
    double area;
    
    /**
     * Constructor que pasandole el perimetro y la apotema calcula el area
     * @param perimetro
     * @param apotema 
     */
    
    public pentagono(double perimetro,double apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
        area=(perimetro*apotema)/2;
    }
    
    /**
     * Metado para obtener el area
     * @return area
     */
    public double Getarea(){
        
        return area;
    }
    
    
    
}

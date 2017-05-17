
package practica78;
/**
 * @author carlos
 * @version 1
 */

public class triangulo {
    
    double base;
    double altura;
    double area;
    
    /**
     * Constructor que pasandole la base y la altura calcula el area
     * @param base
     * @param altura 
     */
    
    public triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
        area=(base*altura)/2;
    }
    
    /**
     * Metodo que obtiene el area
     * @return area
     */
    public double Getarea(){
        
        return area;
    }
}

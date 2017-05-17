
package practica77;
/**
 * @author carlos
 * @version 1
 */

public class circulo {
    int radio;
    double area;
    double longitud;
    
    /**
     * Constructor que pasandole el radio, calcula el area y la longitud
     * @param radio 
     */
    public circulo(int radio){
        this.radio=radio;
        area=Math.pow(radio,2)*Math.PI;
        longitud=2*Math.PI*radio;
    }
    
    /**
     * Metodo obtener area
     * @return area
     */
    public double Getarea(){
        
        return area;
    }
    
    /**
     * Metodo obtener longitud
     * @return longitud
     */
    public double Getlongitud(){
        
        return longitud;
    }
    
    
    
}

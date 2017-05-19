
package practica81;

/**
 * 
 * @author carlos
 * @version 1
 */
public class esfera {
    private int radio;
    private double area;
    private double volumen;
    
    /**
     * Constructor que dandole el radio calcula el area y el volumen
     * @param radio 
     */
    public esfera(int radio){
        this.radio=radio;
        area=4*Math.PI*Math.pow(radio,2);
        volumen=Math.PI*Math.pow(radio,3)*4/3;
    }
    
    /**
     * Metodo para obtener el area
     * @return area
     */
    public double Getarea(){
        
        return area;
    }
    
    /**
     * Metodo para obtener el volumen
     * @return volumen
     */
    public double Getvolumen(){
        
        return volumen;
    }
}

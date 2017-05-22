
package extra3t_3;

/**
 * @version 1
 * @author carlos
 */
public class convertidor {
    
    private double pies;
    private double yardas;
    private double pulgadas;
    private double centimetros;
    private double milimetros;
    
    /**
     * Constructor con parametro
     * @param pies 
     */
    public convertidor(double pies){
        this.pies=pies;
    }
    
    /**
     * Combierte a yardas
     * @return yardas
     */
    public double Get_yardas(){
        yardas=pies/3;
        return yardas;        
    }
    /**
     * Combierte a pulgadas
     * @return pulgadas
     */
    public double Get_pulgadas(){
        pulgadas=pies*12;
        return pulgadas;
    }
    /**
     * Combierte a centimetros
     * @return centimetros
     */
    public double Get_centimetros(){
        centimetros=pies*30.48;
        return centimetros;
    }
    /**
     * Combierte a milimetros 
     * @return milimetros
     */
    public double Get_milimetros(){
        milimetros=pies*304.8;
        return milimetros;
    }
    
    
    
    
    
}

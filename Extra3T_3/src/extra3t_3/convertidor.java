
package extra3t_3;


public class convertidor {
    
    private double pies;
    private double yardas;
    private double pulgadas;
    private double centimetros;
    private double milimetros;
    
    public convertidor(double pies){
        this.pies=pies;
    }
    
    public double Get_yardas(){
        yardas=pies/3;
        return yardas;        
    }
    public double Get_pulgadas(){
        pulgadas=pies*12;
        return pulgadas;
    }
    public double Get_centimetros(){
        centimetros=pies*30.48;
        return centimetros;
    }
    public double Get_milimetros(){
        milimetros=pies*304.8;
        return milimetros;
    }
    
    
    
    
    
}

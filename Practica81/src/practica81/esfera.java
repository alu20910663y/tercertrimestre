
package practica81;


public class esfera {
    private int radio;
    private double area;
    private double volumen;
    
    public esfera(int radio){
        this.radio=radio;
        area=4*Math.PI*Math.pow(radio,2);
        volumen=Math.PI*Math.pow(radio,3)*4/3;
    }
    
    public double Getarea(){
        
        return area;
    }
    
    public double Getvolumen(){
        
        return volumen;
    }
}

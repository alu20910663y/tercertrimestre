
package practica77;


public class circulo {
    int radio;
    double area;
    double longitud;
    
    public circulo(int radio){
        this.radio=radio;
        area=Math.pow(radio,2)*Math.PI;
        longitud=2*Math.PI*radio;
    }
    
    public double Getarea(){
        
        return area;
    }
    
    public double Getlongitud(){
        
        return longitud;
    }
    
    
    
}

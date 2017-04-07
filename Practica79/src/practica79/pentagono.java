
package practica79;


public class pentagono {
   
    double perimetro;
    double apotema;
    double area;
    
    public pentagono(double perimetro,double apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
        area=(perimetro*apotema)/2;
    }
    
    public double Getarea(){
        
        return area;
    }
    
    
    
}


package practica78;


public class triangulo {
    
    double base;
    double altura;
    double area;
    
    public triangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
        area=(base*altura)/2;
    }
    
    public double Getarea(){
        
        return area;
    }
}

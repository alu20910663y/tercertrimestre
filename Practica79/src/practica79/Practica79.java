
package practica79;

import java.util.Scanner;


public class Practica79 {

    
    public static void main(String[] args) {
       
        Scanner S=new Scanner(System.in);
        double perimetro,apotema;
        
        System.out.println("Introduce el perimetro");
        perimetro=S.nextInt();
        System.out.println("Introduce la apotema");
        apotema=S.nextInt();
        
        pentagono pent=new pentagono(perimetro,apotema);
        System.out.println("Area: "+pent.Getarea());
    }
    
}

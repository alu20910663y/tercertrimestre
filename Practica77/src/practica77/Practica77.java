
package practica77;

import java.util.Scanner;
public class Practica77 {

   
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int radio;
        
        System.out.println("Introduce el radio");
        radio=S.nextInt();
        
        circulo circ=new circulo(radio);
        System.out.println("Area: "+circ.Getarea() + "| Longitud circunferencia: " + circ.Getlongitud());
        
    }
    
}

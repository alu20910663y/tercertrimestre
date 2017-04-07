
package practica81;

import java.util.Scanner;


public class Practica81 {

   
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int radio;
        
        System.out.println("Introduce el radio");
        radio=S.nextInt();
        
        esfera esf=new esfera(radio);
        System.out.println("Area: "+esf.Getarea() + "| Volumen: " + esf.Getvolumen());
        
    }
    
}


package practica82;

import java.util.Scanner;


public class Practica82 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        
        int cantidad;
        
        System.out.println("Introduce cantidad");
        cantidad=S.nextInt();
        
        divisor div=new divisor(cantidad);
        div.Getresultados();
    }
    
}

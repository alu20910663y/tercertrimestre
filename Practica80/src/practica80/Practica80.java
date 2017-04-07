
package practica80;

import java.util.Scanner;


public class Practica80 {

   
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int arista;
        
        System.out.println("Introduce la arista");
        arista=S.nextInt();
        
        cubo cube=new cubo(arista);
        System.out.println("Area: "+cube.Getarea());
    }
    
}


package practica78;

import java.util.Scanner;


public class Practica78 {

    
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        double base,altura;
        
        System.out.println("Introduce la base");
        base=S.nextInt();
        System.out.println("Introduce la altura");
        altura=S.nextInt();
        
        triangulo trian=new triangulo(base,altura);
        System.out.println("Area: "+trian.Getarea());
        
    }
    
}

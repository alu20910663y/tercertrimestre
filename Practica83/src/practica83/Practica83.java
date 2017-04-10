
package practica83;

import java.util.Scanner;


public class Practica83 {

  
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Introduce A: ");
        a=S.nextInt();
        System.out.println("Introduce B: ");
        b=S.nextInt();
        System.out.println("Introduce C: ");
        c=S.nextInt();
        
        System.out.println("Resultados: ");
        ecuacion ec=new ecuacion(a,b,c);
        ec.Getresultados();
    }
    
}

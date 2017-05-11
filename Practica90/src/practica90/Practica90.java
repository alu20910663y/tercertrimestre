
package practica90;

import java.util.Scanner;


public class Practica90 {

    public static void main(String[] args) {
        
        int numeros;
        String letra;
        
        Scanner S=new Scanner(System.in);
        System.out.println("Introduce los numeros.");
        numeros=S.nextInt();
        System.out.println("Introduce la letra.");
        letra=S.next();
        
        Dni dni=new Dni(numeros,letra);
        
        System.out.println(dni.letra_ok());
    }
    
}

package Extra3T_1;

import java.util.Scanner;


public class Extra3_T1 {

   
    public static void main(String[] args) {
        int eleccion,variable_a,variable_b;
        Scanner S=new Scanner(System.in);
        System.out.println("----------Teorema de pitagoras----------");
        System.out.println("Menu:");
        System.out.println("1.Introducir catetos");
        System.out.println("2.Introducir hipotenusa y cateto");
        
        eleccion=S.nextInt();
        
        switch(eleccion){
            case 1:
                System.out.println("Introduce catetos:");
                variable_a=S.nextInt();
                variable_b=S.nextInt();
                teorema catetos=new teorema(variable_a,variable_b,0);
                System.out.println("Resultado del teorema de pitagoras: "+catetos.Getresultado());
                break;
            case 2:
                System.out.println("Introduce cateto:");
                variable_a=S.nextInt();
                System.out.println("Introduce hipotenusa:");
                variable_b=S.nextInt();
                teorema hipotenusa=new teorema(variable_a,0,variable_b);
                System.out.println("Resultado del teorema de pitagoras: "+hipotenusa.Getresultado());
                break;
        }  
    }
}

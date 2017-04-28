
package extra3t_3;

import java.util.Scanner;


public class Extra3T_3 {

   
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int opcion;
        double pies;
        
        System.out.println("Convierte de pies a otras medidas.");
        System.out.println("Introduce la medida en pies: ");
        pies=S.nextDouble();
        System.out.println("Convertir a: ");
        System.out.println("1.Yardas");
        System.out.println("2.Pulgadas");
        System.out.println("3.centimetros");
        System.out.println("4.Milimetros");
        
        opcion=S.nextInt();
        convertidor convert=new convertidor(pies);
        switch(opcion){
            case 1:
                System.out.println(convert.Get_yardas());
                break;
            case 2:
                System.out.println(convert.Get_pulgadas());
                break;
            case 3:
                System.out.println(convert.Get_centimetros());
                break;
            case 4:
                System.out.println(convert.Get_milimetros());
                break;
           }
        
    }
    
}

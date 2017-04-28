
package practica84;
import java.util.Scanner;
public class Practica84 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int opcion1,opcion2,exit1=0,contador=0,interes,num_cuenta;
        String nombre,apellido,apellido2,dni;
        double salario;
        
        System.out.println("Bienvenido a BancodelParque.");
        cuenta arraycuenta[]=new cuenta[2];
        do{
        System.out.println("Que desea hacer: ");
        System.out.println("1.Creacion de cuenta.");
        System.out.println("2.Modificacion de cuenta.");
        System.out.println("3.Transacciones.");
        System.out.println("4.Salir del programa.");
        opcion1=S.nextInt();
        
        switch(opcion1){
            case 1:
                   System.out.println("1.Crear cuenta nueva.");
                   System.out.println("2.Copiar cuenta.");
                   opcion2=S.nextInt();
                   switch(opcion2){
                       case 1:
                           System.out.println("Introduce los siguientes datos para crear la cuenta: ");
                           System.out.println("Nombre: ");
                           nombre=S.next();
                           System.out.println("Primer apellido: ");
                           apellido=S.next();
                           System.out.println("Segundo apellido: ");
                           apellido2=S.next();
                           System.out.println("DNI: ");
                           dni=S.next();
                           System.out.println("Tipo de interes (1, 2 o 3)");
                           interes=S.nextInt();
                           arraycuenta[contador]=new cuenta(nombre,apellido,apellido2,dni,interes);
                           contador++;
                           
                        break;
                        
                       case 2:
                           System.out.println("Funcion pendiente de añadir.");
                        break;
                        
                       default:
                           System.out.println("ERROR: La opcion que ha marcado no existe.");
                   }
                   
            case 2:
                
                System.out.println("Introduce numero de cuenta: ");
                num_cuenta=S.nextInt();
                
                for(int i=0;i<2;i++){
                    if(num_cuenta==arraycuenta[i].Get_num_cuenta()){
                        
                    }
                }
                
        }
        
        
        
        }while(exit1==0);
        
        
    }
    
}

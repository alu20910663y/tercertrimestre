
package practica84;
import java.util.Scanner;
public class Practica84 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int opcion1,opcion2,opcion3,opcion4,exit1=0,contador=0,interes,num_cuenta,num_cuenta2;
        String nombre,apellido,apellido2,dni;
        String name,ap1,ap2,dni2;
        double cantidad;
        
        System.out.println("Bienvenido a BancodelParque.");
        cuenta arraycuenta[]=new cuenta[2];
        do{
        System.out.println("Que desea hacer: ");
        System.out.println("1.Creacion de cuenta.");
        System.out.println("2.Modificacion de cuenta.");
        System.out.println("3.Transacciones.");
        System.out.println("4.Mostrar datos.");
        System.out.println("5.Salir del programa.");
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
                           System.out.println("Introduce numero de cuenta del que vas a copiar: ");
                           num_cuenta=S.nextInt();
                
                           for(int i=0;i<contador;i++){
                           if(num_cuenta==arraycuenta[i].Get_num_cuenta()){
                           arraycuenta[contador]=new cuenta(arraycuenta[i].Get_nombre(),arraycuenta[i].Get_apellido(),arraycuenta[i].Get_segundo_apellido(),arraycuenta[i].Get_dni(),arraycuenta[i].Get_interes());
                           contador++;
                           System.out.println("Cuenta opiada correctamente.");
                           }
                           }
                        break;
                        
                       default:
                           System.out.println("ERROR: La opcion que ha marcado no existe.");
                   }
                   break;
            case 2:
                
                System.out.println("Introduce numero de cuenta: ");
                num_cuenta=S.nextInt();
                
                for(int i=0;i<contador;i++){
                    if(num_cuenta==arraycuenta[i].Get_num_cuenta()){
                        
                        System.out.println("Accediendo a la cuenta... ");
                        System.out.println("1.Cambiar nombre. ");
                        System.out.println("2.Cambiar primer appellido.");
                        System.out.println("3.Cambiar segundo apellido.");
                        System.out.println("4.Cambiar DNI.");
                        System.out.println("5.Cambiar tipo de interes.");
                        opcion3=S.nextInt();
                        switch(opcion3){
                            case 1:
                                System.out.println("Introduce nuevo nombre: ");
                                name=S.next();
                                arraycuenta[i].Set_nombre(name);
                                System.out.println("Nombre modificado correctamente.");
                                break;
                            case 2:
                                System.out.println("Introduce nuevo primer apellido: ");
                                ap1=S.next();
                                arraycuenta[i].Set_apellido(ap1);
                                System.out.println("Primer apellido modificado correctamente.");
                                break;
                            case 3:
                                System.out.println("Introduce nuevo segundo apellido: ");
                                ap2=S.next();
                                arraycuenta[i].Set_segundo_apellido(ap2);
                                System.out.println("Segundo apellido modificado correctamente.");
                                break;
                            case 4:
                                System.out.println("Introduce nuevo DNI: ");
                                dni2=S.next();
                                arraycuenta[i].Set_dni(dni2);
                                System.out.println("DNI modificado correctamente.");
                                break;
                            default:
                                System.out.println("No existe la opcion marcada.");
                        }
                    }
                }
                break;
            case 3:
                
                System.out.println("Introduce numero de cuenta: ");
                num_cuenta=S.nextInt();
                
                for(int i=0;i<contador;i++){
                    if(num_cuenta==arraycuenta[i].Get_num_cuenta()){
                       
                     System.out.println("Accediendo a la cuenta... ");
                     System.out.println("1.Ingreso.");
                     System.out.println("2.Reintegro.");
                     System.out.println("3.Transferencia.");   
                     
                     opcion4=S.nextInt();
                     
                     switch(opcion4){
                        case 1:
                            System.out.println("Introduce cantidad: ");
                            cantidad=S.nextDouble();
                            arraycuenta[i].Ingreso(cantidad);
                            System.out.println("Ingreso completado.");
                            break;
                         case 2:
                            System.out.println("Introduce cantidad: ");
                            cantidad=S.nextDouble();
                            arraycuenta[i].Reintegro(cantidad);
                            System.out.println("Reintegro completado.");
                            break;
                         case 3:
                            System.out.println("Introduce cantidad: ");
                            cantidad=S.nextDouble();
                            System.out.println("Introduce cuenta de transaccion: ");
                            num_cuenta2=S.nextInt();
                            for(int j=0;j<contador;j++){
                                if(num_cuenta2==arraycuenta[j].Get_num_cuenta()){
                                    
                                    arraycuenta[i].Reintegro(cantidad);
                                    arraycuenta[j].Ingreso(cantidad);
                                }
                            }
                            System.out.println("Transferencia completado.");
                            break;
                        default:    
                            System.out.println("No existe la opcion marcada."); 
                     }
                     
                     
                    }
                }
                break;
            case 4:
                System.out.println("Introduce numero de cuenta: ");
                num_cuenta=S.nextInt();
                
                for(int i=0;i<contador;i++){
                    if(num_cuenta==arraycuenta[i].Get_num_cuenta()){
                     arraycuenta[i].Get_datos();
                    }
                    }
                break;
            case 5:
                exit1=1;
                System.out.println("Buenos dias,buenas tardes y buenas noches.");
            
            default:
                System.out.println("No existe la opcion marcada.");
        }
        
        
        
        }while(exit1==0);
        
        
    }
    
}

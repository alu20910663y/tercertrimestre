package practica85;

import java.util.*;


public class Practica85 {

    
    public static void main(String[] args) {
        
        ArrayList <cuenta> cuentas=new ArrayList <cuenta>();
        
        Scanner S=new Scanner(System.in);
        
        int opcion1,opcion2,opcion3,opcion4,opcion5,exit1=0,exit2=0,interes,cuenta,cuentadestino;
        String nombre,apellido,apellido2,dni;
        cuenta aux;
        double cantidad;
        
        System.out.println("Bienvenido a BancodelParque.");
        do{
        System.out.println("1.Crear cuenta.");
        System.out.println("2.Acceder a tu cuenta.");
        System.out.println("3.Salir.");
        
        opcion1=S.nextInt();
        
        switch(opcion1){
            case 1: 
                System.out.println("1.Crear cuenta desde 0.");
                System.out.println("2.Crear cuenta desde otra cuenta.");
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
                        aux = new cuenta(nombre,apellido,apellido2,dni,interes);
                        aux.setNum_cuenta();
                        cuentas.add(aux);
                        break;   
                    case 2:
                        System.out.println("Introduce la cuenta de la que se copiaran los datos: ");
                        cuenta=S.nextInt();
                        aux = new cuenta(cuentas.get(cuenta).GetNombre(),cuentas.get(cuenta).GetApellido(),cuentas.get(cuenta).GetSegundo_apellido(),cuentas.get(cuenta).GetDni(),cuentas.get(cuenta).GetInteres());
                        aux.setNum_cuenta();
                        cuentas.add(aux);
                        System.out.println("Copia completada.");
                        break;
                    default:
                        System.out.println("ERROR: Opcion introducida no encontrada.");
                }
                break;
            case 2:
                System.out.println("Introduce numero de cuenta: ");
                cuenta=S.nextInt();
                
                for(int i=0;i<cuentas.size();i++){
                    if(i==cuenta){
                    do{
                    exit2=0;
                    System.out.println("1.Modificar cuenta.");
                    System.out.println("2.Ver datos actuales.");
                    System.out.println("3.Transacciones");
                    System.out.println("4.Ir atras.");
                    opcion3=S.nextInt();
                    
                    switch(opcion3){
                        case 1:
                            System.out.println("1.Nombre");
                            System.out.println("2.Primer apellido");
                            System.out.println("3.Segundo apellido");
                            System.out.println("4.DNI");
                            System.out.println("5.Interes");
                            opcion4=S.nextInt();
                            switch(opcion4){
                                case 1:
                                    nombre=S.next();
                                    cuentas.get(i).setNombre(nombre);
                                    break;
                                case 2:
                                    apellido=S.next();
                                    cuentas.get(i).setApellido(apellido);
                                    break;
                                case 3:
                                    apellido2=S.next();
                                    cuentas.get(i).setSegundo_apellido(apellido2);
                                    break;
                                case 4:
                                    dni=S.next();
                                    cuentas.get(i).setDNI(dni);
                                    break;
                                case 5:
                                    interes=S.nextInt();
                                    cuentas.get(i).setInteres(interes);
                                    break;
                                default:
                                    System.out.println("ERROR: Opcion introducida no encontrada.");
                            }
                        break;
                        case 2:
                            System.out.println("Cuenta numero: "+i);
                            System.out.println("Nombre: "+cuentas.get(i).GetNombre());
                            System.out.println("Primer apellido: "+cuentas.get(i).GetApellido());
                            System.out.println("Segundo apellido: "+cuentas.get(i).GetSegundo_apellido());
                            System.out.println("DNI: "+cuentas.get(i).GetDni());
                            System.out.println("Tipo de interes: "+cuentas.get(i).GetInteres());
                            System.out.println("Saldo: "+cuentas.get(i).GetSaldo());
                        break;
                        case 3:
                            System.out.println("1.Ingreso.");
                            System.out.println("2.Reintegro.");
                            System.out.println("3.Transferencia.");
                            opcion5=S.nextInt();
                            switch(opcion5){
                                case 1:
                                    cantidad=S.nextDouble();
                                    cuentas.get(i).Ingreso(cantidad);
                                    break;
                                case 2:
                                    cantidad=S.nextDouble();
                                    if(cuentas.get(i).GetSaldo()-cantidad<0){
                                        System.out.println("ERROR: Saldo insuficiente.");
                                    }
                                    else{
                                    cuentas.get(i).Reintegro(cantidad);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Introduce cuenta de destino: ");
                                    cuentadestino=S.nextInt();
                                    System.out.println("Introduce cantidad a transferir: ");
                                    cantidad=S.nextDouble();
                                    if(cuentas.get(i).GetSaldo()-cantidad<0){
                                        System.out.println("ERROR: Saldo insuficiente.");
                                    }
                                    else{
                                    cuentas.get(i).Reintegro(cantidad);
                                    cuentas.get(cuentadestino).Ingreso(cantidad);
                                    System.out.println("Transaccion completada.");
                                    }
                                    break;
                                default: 
                                    System.out.println("ERROR: Opcion introducida no encontrada.");
                            }
                            
                            break;
                        case 4:
                            exit2=1;
                            break;
                        default:
                            System.out.println("ERROR: Opcion introducida no encontrada.");
                    }
                    
                    }while(exit2==0);
                    }
                    
                }
                break; 
            case 3:
                exit1=1;
                break;
            default:
                System.out.println("ERROR: Opcion introducida no encontrada.");
        }
        
        }while(exit1==0);
    }
}


package practica86;

import java.util.Scanner;
public class Practica86 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int opcion1,contador=0,variable,exit=0,posicion,opcion2;
        
        Contador arraycontador[]=new Contador[5];
        
        do{
        System.out.println("1.Crear contador.");
        System.out.println("2.Modificar contador.");
        System.out.println("3.Mostrar contador.");
        System.out.println("4.Salir.");
        opcion1=S.nextInt();
        
        switch(opcion1){
            case 1:
                System.out.println("Introduce el numero de inicio de tu contador.");
                variable=S.nextInt();
                arraycontador[contador]=new Contador(variable);
                System.out.println("Se ha creado un contador en la posicion: "+ contador);
                contador++;
                break;
            case 2:
                System.out.println("Posicion del contador a modificar: ");
                posicion=S.nextInt();
                
                System.out.println("1.Añadir 1");
                System.out.println("2.Quitar 1");
                opcion2=S.nextInt();
                switch(opcion2){
                    case 1:
                        arraycontador[posicion].IncrementarContador();
                    break;
                    case 2:
                        arraycontador[posicion].DecrementarContador();
                    break;    
                }
                break;
            case 3:
                System.out.println("Posicion del contador: ");
                posicion=S.nextInt();
                
                System.out.println(arraycontador[posicion].GetContador());
                break;
            case 4:
                exit=1;
                break;      
        }
        }while(exit==0);
    }
}

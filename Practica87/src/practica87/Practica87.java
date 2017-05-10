
package practica87;

import java.util.*;


public class Practica87 {

   
    public static void main(String[] args) {
        int opcion,exit=0,ejemplares,prestamos,contador=0;
        String titulo,autor,titol;
        
        Scanner S=new Scanner(System.in);
        
        Libro arraylibro[]=new Libro[10];
        
        do{
            System.out.println("1.Añadir nuevo libro.");
            System.out.println("2.Gestion.");
            System.out.println("3.Mostrar datos.");
            System.out.println("4.Salir.");
            opcion=S.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("-----------------NUEVO LIBRO-------------------");
                    System.out.println("Titulo: ");
                    titulo=S.next();
                    System.out.println("Autor: ");
                    autor=S.next();
                    System.out.println("Ejemplares: ");
                    ejemplares=S.nextInt();
                    System.out.println("Prestamos: ");
                    prestamos=S.nextInt();
                    arraylibro[contador]=new Libro(titulo,autor,ejemplares,prestamos);
                    contador++;
                break;
                case 2:
                    System.out.println("---Introduce el titulo del libro---");
                    titol=S.next();
                
                    for(int i=0;i<contador;i++){
                        if(arraylibro[i].GetTitulo().equals(titol)){
                            System.out.println("1.Pedir prestado.");
                            System.out.println("2.Devolucion");
                            opcion=S.nextInt();
                            switch(opcion){
                                case 1:
                                    arraylibro[i].Prestamo();
                                break;
                                case 2:
                                    arraylibro[i].Devolucion();
                                break;    
                            }
                        }
                    }
                break;
                case 3:
                    System.out.println("---Introduce el titulo del libro---");
                    titol=S.next();
                
                    for(int i=0;i<contador;i++){
                        if(arraylibro[i].GetTitulo().equals(titol)){
                            System.out.println("Titulo: "+arraylibro[i].GetTitulo());
                            System.out.println("Autor: "+arraylibro[i].GetAutor());
                            System.out.println("Ejemplares: "+arraylibro[i].GetEjemplares());
                            System.out.println("Prestamos: "+arraylibro[i].GetPrestamos());
                        }
                        }
                break;    
                case 4:
                    exit=1;
            }
        }while(exit==0);
        
        
        
    }
    
}


package practica87;

import java.util.*;


public class Practica87 {

   
    public static void main(String[] args) {
        
        int opcion,exit=0,ejemplares,prestamos;
        String titulo,autor,titol;
        
        Scanner S=new Scanner(System.in);
        
        ArrayList <Libro> libro=new ArrayList <>();
        Libro aux;
        
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
                    aux = new Libro(titulo,autor,ejemplares,prestamos);
                    libro.add(aux);
                break;
                case 2:
                    System.out.println("---Introduce el titulo del libro---");
                    titol=S.next();
                
                    for(int i=0;i<libro.size();i++){
                        if(libro.get(i).GetTitulo().equals(titol)){
                            System.out.println("1.Pedir prestado.");
                            System.out.println("2.Devolucion");
                            opcion=S.nextInt();
                            switch(opcion){
                                case 1:
                                    libro.get(i).Prestamo();
                                break;
                                case 2:
                                    libro.get(i).Devolucion();
                                break;    
                            }
                        }
                    }
                break;
                case 3:
                    System.out.println("---Introduce el titulo del libro---");
                    titol=S.next();
                
                    for(int i=0;i<libro.size();i++){
                        if(libro.get(i).GetTitulo().equals(titol)){
                            System.out.println("Titulo: "+libro.get(i).GetTitulo());
                            System.out.println("Autor: "+libro.get(i).GetAutor());
                            System.out.println("Ejemplares: "+libro.get(i).GetEjemplares());
                            System.out.println("Prestamos: "+libro.get(i).GetPrestamos());
                        }
                        }
                break;    
                case 4:
                    exit=1;
            }
        }while(exit==0);
        
        
    }
    
}

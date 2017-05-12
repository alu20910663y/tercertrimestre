
package practica91;
import java.util.*;

public class Practica91 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int opcion1,opcion2,exit=0,exit2=0,contador=0;
        
        ArrayList<Usuarios> usuario=new ArrayList<>();
        Usuarios aux;
        
        System.out.println("Bienvenido al programa gestor de la biblioteca.");
        do{
        System.out.println("1.Gestion de usuarios.");
        System.out.println("2.Gestion de libros.");
        System.out.println("3.Salir.");
        opcion1=S.nextInt();
        
        switch(opcion1){
            case 1:
                do{
                exit2=0;
                System.out.println("1.Nuevo usuario.");
                System.out.println("2.Modificar usuario.");
                System.out.println("3.Mostrar usuario.");
                System.out.println("4.Ir atras.");
                opcion2=S.nextInt();
                
                switch(opcion2){
                    case 1:
                        System.out.println("Introduce el nombre.");
                        String nombre=S.next();
                        System.out.println("Introduce el apellido.");
                        String apellido=S.next();
                        System.out.println("Introduce el dni.");
                        String dni=S.next();
                        aux = new Usuarios(nombre,apellido,dni);
                        usuario.add(aux);
                        System.out.println("Tu id de usuario es: "+usuario.get(contador).Get_id());
                        contador++;
                        break;
                    case 2:
                        System.out.println("introduce id de usuario.");
                        int id=S.nextInt();
                        for(int i=0;i<contador;i++){
                            if(id==usuario.get(i).Get_id()){
                                System.out.println("Introduce los nuevos datos.");
                                System.out.println("Nombre: ");
                                String nuevo_nombre=S.next();
                                usuario.get(i).Set_nombre(nuevo_nombre);
                                System.out.println("Apellido: ");
                                String nuevo_apellido=S.next();
                                usuario.get(i).Set_apellido(nuevo_apellido);
                                System.out.println("DNI: ");
                                String nuevo_dni=S.next();
                                usuario.get(i).Set_dni(nuevo_dni);
                                System.out.println("Usuario modificado correctamente.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("introduce id de usuario.");
                        int id2=S.nextInt();
                        for(int i=0;i<contador;i++){
                            if(id2==usuario.get(i).Get_id()){
                              System.out.println(usuario.get(i).Get_id());
                              System.out.println(usuario.get(i).Get_nombre());
                              System.out.println(usuario.get(i).Get_apellido());
                              System.out.println(usuario.get(i).Get_dni());
                            }
                            }
                        break;
                    case 4:
                        exit2=1;
                        break;
                    default:
                        System.out.println("No existe la opcion seleccionada.");                     
                }
                }while(exit2==0);
                break;
            case 2:
                break;
            case 3:
                exit=1;
                break;
            default:
                System.out.println("No existe la opcion seleccionada.");
        }
        }while(exit==0);
        
    }
    
}

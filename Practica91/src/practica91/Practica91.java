
package practica91;
import java.util.*;

public class Practica91 {

    
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int opcion1,opcion2,opcion3,opcion4,exit=0,exit2=0,exit3=0,contador=0,contador2=0;
        
        ArrayList<Usuarios> usuario=new ArrayList<>();
        Usuarios aux;
        ArrayList<Libros> libro=new ArrayList<>();
        Libros aux2;
        
        System.out.println("Bienvenido al programa gestor de la biblioteca.");
        do{
        System.out.println("------------------------");
        System.out.println("1.Gestion de usuarios.");
        System.out.println("2.Gestion de libros.");
        System.out.println("3.Salir.");
        System.out.println("------------------------");
        opcion1=S.nextInt();
        
        switch(opcion1){
            case 1:
                do{
                exit2=0;
                System.out.println("------------------------");
                System.out.println("1.Nuevo usuario.");
                System.out.println("2.Modificar usuario.");
                System.out.println("3.Mostrar usuario.");
                System.out.println("4.Ir atras.");
                System.out.println("------------------------");
                opcion2=S.nextInt();
                
                switch(opcion2){
                    case 1:
                        
                        System.out.println("Introduce el nombre.");
                        String nombre=s.nextLine();
                        System.out.println("Introduce el apellido.");
                        String apellido=s.nextLine();
                        System.out.println("Introduce el dni.");
                        String dni=s.next();
                        aux = new Usuarios(nombre,apellido,dni);
                        usuario.add(aux);
                        System.out.println("Tu id de usuario es: "+usuario.get(contador).Get_id());
                        contador++;
                        s.nextLine();
                        break;
                    case 2:
                        
                        System.out.println("introduce id de usuario.");
                        int id=S.nextInt();
                        for(int i=0;i<contador;i++){
                            if(id==usuario.get(i).Get_id()){
                                System.out.println("Introduce los nuevos datos.");
                                System.out.println("Nombre: ");
                                String nuevo_nombre=s.nextLine();
                                usuario.get(i).Set_nombre(nuevo_nombre);
                                System.out.println("Apellido: ");
                                String nuevo_apellido=s.nextLine();
                                usuario.get(i).Set_apellido(nuevo_apellido);
                                System.out.println("DNI: ");
                                String nuevo_dni=s.next();
                                usuario.get(i).Set_dni(nuevo_dni);
                                System.out.println("Usuario modificado correctamente.");
                                s.nextLine();
                            }
                        }
                        break;
                    case 3:
                        
                        System.out.println("introduce id de usuario.");
                        int id2=S.nextInt();
                        for(int i=0;i<contador;i++){
                            if(id2==usuario.get(i).Get_id()){
                              System.out.println("ID usuario: "+usuario.get(i).Get_id());
                              System.out.println("Nombre: "+usuario.get(i).Get_nombre());
                              System.out.println("Apellido: "+usuario.get(i).Get_apellido());
                              System.out.println("DNI: "+usuario.get(i).Get_dni());
                              System.out.print("ID libros prestados acte. : ");
                              usuario.get(i).Mostrar_libros();
                              System.out.println();
                              
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
                do{
                exit3=0;
                System.out.println("------------------------");
                System.out.println("1.Introducir libro.");
                System.out.println("2.Modificar libro.");
                System.out.println("3.Mostrar libro.");
                System.out.println("4.Prestamos.");
                System.out.println("5.Ir atras");
                System.out.println("------------------------");
                opcion3=S.nextInt();
                
                switch(opcion3){
                    case 1:
                        
                        System.out.println("Introduce el nombre: ");
                        String nombre;
                        nombre=s.nextLine();
                        System.out.println("Introduce los ejemplares: ");
                        int ejemplares=S.nextInt();
                        aux2 = new Libros(nombre,ejemplares);
                        libro.add(aux2);
                        System.out.println("Libro creado correctamente, id del libro: "+libro.get(contador2).Get_id());
                        contador2++;
                        break;
                    case 2:
                        System.out.println("introduce id del libro.");
                        int id=S.nextInt();
                        for(int i=0;i<contador2;i++){
                            if(id==libro.get(i).Get_id()){
                                System.out.println("Introduce los nuevos datos.");
                                System.out.println("Nombre: ");
                                String nuevo_nombre=s.nextLine();
                                libro.get(i).Set_nombre(nuevo_nombre);
                                System.out.println("Ejemplares: ");
                                int nuevo_ejemplares=S.nextInt();
                                libro.get(i).Set_ejemplares(nuevo_ejemplares);
                                System.out.println("Libro modificado correctamente.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Introduce id del libro.");
                        int id2=S.nextInt();
                        for(int i=0;i<contador2;i++){
                            if(id2==libro.get(i).Get_id()){
                                System.out.println("Nombre: "+libro.get(i).Get_nombre());
                                System.out.println("Ejemplares: "+libro.get(i).Get_ejemplares());
                                System.out.println("Prestamos: "+libro.get(i).Get_prestamos());
                                System.out.print("Id usuarios que tienen acte. prestamos: ");
                                libro.get(i).Mostrar_usuario();
                                System.out.println();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("------------------------");
                        System.out.println("1.Pedir prestamo.");
                        System.out.println("2.Devolver prestamo.");
                        System.out.println("------------------------");
                        opcion4=S.nextInt();
                        
                        switch(opcion4){
                            case 1:
                                System.out.println("Introduce la ID del libro.");
                                int idlibro=S.nextInt();
                                System.out.println("Introduce tu ID de usuario.");
                                int idusuario=S.nextInt();
                                if(libro.get(idlibro).Get_prestamos()<libro.get(idlibro).Get_ejemplares()){
                                    libro.get(idlibro).Aumentar_prestamo();
                                    libro.get(idlibro).Añadir_usuario(idusuario);
                                    usuario.get(idusuario).Añadir_libro(idlibro);
                                    System.out.println("Prestamo aceptado.");
                                }
                                else{
                                    System.out.println("No quedan libros, espere a que alguien devuelva para pedir el prestamo.");
                                }
                                break;
                            case 2:
                                System.out.println("Introduce la ID del libro.");
                                idlibro=S.nextInt();
                                System.out.println("Introduce tu ID de usuario.");
                                idusuario=S.nextInt();
                                
                                libro.get(idlibro).Reducir_prestamo();
                                libro.get(idlibro).Borrar_usuario(idusuario);
                                System.out.println("Libro devuelto correctamente.");
                                break;
                            default:
                              System.out.println("No existe la opcion seleccionada.");  
                        }
                        break;
                    case 5:
                        exit3=1;
                        break;
                    default:
                        System.out.println("No existe la opcion seleccionada.");
                    
                }
                }while(exit3==0);
                
                
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


package practica89;

import java.util.Calendar;
import java.util.Scanner;
public class Practica89 {

    
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
        int año,mes,dia;
        
        System.out.println("Introduce el año.");
        año=S.nextInt();
        System.out.println("Introduce el mes.");
        mes=S.nextInt();
        System.out.println("Introduce el dia.");
        dia=S.nextInt();
        
        Fecha date=new Fecha(dia,mes,año);
        date.fecha_ok();
        
        Calendar c1= Calendar.getInstance();
        
        Fecha actual_date=new Fecha(c1.get(Calendar.DATE),c1.get(Calendar.MONTH)+1,c1.get(Calendar.YEAR));
        
        System.out.println("Dia: "+actual_date.get_dia()+" Mes: "+actual_date.get_mes()+" Año: "+actual_date.get_año());
        
    }
}

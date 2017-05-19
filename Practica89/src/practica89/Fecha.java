
package practica89;

import java.util.Scanner;

/**
 * @version 1
 * @author carlos
 */
public class Fecha {
   
    private int dia;
    private int mes;
    private int año;
    private int bisiesto;
    private int año_ok=0;
    private int mes_ok=0;
    private int dia_ok=0;
    
    Scanner S=new Scanner(System.in);
    
    /**
     * Constructor con parametros
     * @param dia
     * @param mes
     * @param año 
     */
    public Fecha(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    /**
     * Mustra si la fecha es corecta y sino lo que esta incorrecto
     */
    public void fecha_ok(){
        bisiesto();
        año();
        mes();
        dia();
        
        if(año_ok==1){
            System.out.println("Año incorrecto.");
        }
        if(mes_ok==1){
            System.out.println("Mes incorrecto.");
        }
        if(dia_ok==1){
            System.out.println("Dia incorrecto.");
        }
        
        if(año_ok==0&&mes_ok==0&&dia_ok==0){
            System.out.println("Dia incorrecto.");
        }
        
    }
    /**
     * Calcula si el año es bisiesto
     */
    private void bisiesto(){
        int cien,cuatrocientos,cuatro;
        cuatro=año%4;
        cien=año%100;
        cuatrocientos=año%400;    
        if(cuatro==0||(cien==0&&cuatrocientos==0)){        
            bisiesto=1;
        }
        else{        
            bisiesto=0;
        } 
    }
    /**
     * Calcula si el año es correcto
     */
    private void año(){
        if(año<0){
            año_ok=1;
        }   
    }
    /**
     * Calcula si el mes es correcto
     */
    private void mes(){
        if(mes<1||mes>12){
            mes_ok=1;
        }   
    }
    /**
     * Calcula si el dia es correcto
     */
    private void dia(){
        if(mes<1||mes>12||mes==1||mes==3||mes==5||mes==7||mes==8||mes==12){
            if(dia<1||dia>31) {
                dia_ok=1;
            }    
        }
        else if(mes==2){
            if(bisiesto==0){
                if(dia<1||dia>28){
                    dia_ok=1; 
                }           
            }
            if(bisiesto==1){
                if(dia<1||dia>29){
                    dia_ok=1;
                }
            }
        }
    }
    
    /**
     * Obtiene el dia
     * @return dia
     */
    public int get_dia(){
        return dia;
    }
    /**
     * Obtiene el mes
     * @return mes
     */
    public int get_mes(){
        return mes;
    }
    /**
     * Obtiene el año
     * @return año
     */
    public int get_año(){
        return año;
    }
}
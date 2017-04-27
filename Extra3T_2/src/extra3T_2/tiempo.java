/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3T_2;

/**
 *
 * @author carlos
 */
public class tiempo {
   
    private int tiempo;
    private int semana;
    private int dia;
    private int hora;
    private int minuto;
    
    
    private int r_semana;
    private int r_dia;
    private int r_hora;
    private int r_minuto;
    
    public tiempo(int tiempo){
        this.tiempo=tiempo;
    }
    public void calcular(){
        semana();
        dia();
        hora();
        minuto();
        }
    public void Getsegundos(){
        calcular();
        System.out.println("Semana/s: "+semana);
        System.out.println("Dia/s: " +dia);
        System.out.println("Hora/s: " +hora);
        System.out.println("Minuto/s: " +minuto);
        System.out.println("Segundo/s: "+r_minuto);
    }
    private void semana(){
        semana=tiempo/604800;
        r_semana=tiempo%604800;    
    }
    private void dia(){
        dia=r_semana/86400;
        r_dia=r_semana%86400;
    }
    private void hora(){
        hora=r_dia/3600;
        r_hora=r_dia%3600;
    }
    private void minuto(){
        minuto=r_hora/60;
        r_minuto=r_hora%60;
    }
    
    
    
            
    
    
    
    
}

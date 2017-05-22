
package extra3T_2;

/**
 * @version 1
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
    
    /**
     * Constructor con parametro
     * @param tiempo 
     */
    public tiempo(int tiempo){
        this.tiempo=tiempo;
    }
    /**
     * Calcula las operaciones
     */
    public void calcular(){
        semana();
        dia();
        hora();
        minuto();
        }
    /**
     * Muestra los resultados
     */
    public void Getsegundos(){
        calcular();
        System.out.println("Semana/s: "+semana);
        System.out.println("Dia/s: " +dia);
        System.out.println("Hora/s: " +hora);
        System.out.println("Minuto/s: " +minuto);
        System.out.println("Segundo/s: "+r_minuto);
    }
    /**
     * Calcula las semanas
     */
    private void semana(){
        semana=tiempo/604800;
        r_semana=tiempo%604800;    
    }
    /**
     * Calcula los dias
     */
    private void dia(){
        dia=r_semana/86400;
        r_dia=r_semana%86400;
    }
    /**
     * Calcula las horas
     */
    private void hora(){
        hora=r_dia/3600;
        r_hora=r_dia%3600;
    }
    /**
     * Calcula los minutos
     */
    private void minuto(){
        minuto=r_hora/60;
        r_minuto=r_hora%60;
    }
    
    
    
            
    
    
    
    
}

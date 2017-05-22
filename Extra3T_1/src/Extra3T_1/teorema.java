package Extra3T_1;
/**
 * @version 1
 * @author carlos
 */
public class teorema {
   private int catetoa;
   private int catetob;
   private int hipotenusa;
   private double resultado;
    /**
     * Constructor con parametros que diferencia si se le pasa la hipotenusa o no y calcula en funcion
     * @param catetoa
     * @param catetob
     * @param hipotenusa 
     */
    public teorema(int catetoa,int catetob,int hipotenusa){
        this.catetoa=catetoa;
        this.catetob=catetob;
        this.hipotenusa=hipotenusa;
        
        if(this.hipotenusa==0){
            teoremacatetos();
        }
        else{
            teoremahipotenusa();
        } 
    }
    /**
     * Obtiene el resultado
     * @return 
     */
    public double Getresultado(){
       return resultado;       
    }
    /**
     * Calculo del teorema con los catetos
     */
    public void teoremacatetos(){
      resultado=Math.sqrt(Math.pow(catetoa,2)+Math.pow(catetob,2));  
    }
    /**
     * Calculo del teorema con la hipotenusa y un cateto
     */
    public void teoremahipotenusa(){
      resultado=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(catetoa,2));  
    }
    
}

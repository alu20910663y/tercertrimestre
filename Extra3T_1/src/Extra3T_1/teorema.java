package Extra3T_1;

public class teorema {
   private int catetoa;
   private int catetob;
   private int hipotenusa;
   private double resultado;
    
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
    
    public double Getresultado(){
       return resultado;       
    }
    
    public void teoremacatetos(){
      resultado=Math.sqrt(Math.pow(catetoa,2)+Math.pow(catetob,2));  
    }
    public void teoremahipotenusa(){
      resultado=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(catetoa,2));  
    }
    
}

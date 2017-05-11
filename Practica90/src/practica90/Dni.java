
package practica90;


public class Dni {
    
    private int numeros;
    private String letra;
    private int resto;
    private int resultado=0;
    
    
    public Dni(int numeros,String letra){
        this.numeros=numeros;
        this.letra=letra;
    }
    
    public String letra_ok(){
        comprovar_letra();
        String letra_ok;
        if(resultado==0){
            letra_ok="La letra no coincide con los numeros.";
        }
        else{
            letra_ok="La letra coincide con los numeros.";
        }
        return letra_ok;
    }
    
    private void comprovar_letra(){
    resto=numeros%23;
        switch(resto){
            case 0:
                resultado=1;
            break; 
            case 1:
                resultado=1;
            break;
            case 2:
                resultado=1;
            break;
            case 3:
                resultado=1;
            break;
            case 4:
                resultado=1;
            break;
            case 5:
                resultado=1;
            break;
            case 6:
                resultado=1;
            break;
            case 7:
                resultado=1;
            break;
            case 8:
                resultado=1;
            break;
            case 9:
                resultado=1;
            break;
            case 10:
                resultado=1;
            break;
            case 11:
                resultado=1;
            break;
            case 12:
                resultado=1;
            break;
            case 13:
                resultado=1;
            break;
            case 14:
                resultado=1;
            break;
            case 15:
                resultado=1;
            break;
            case 16:
                resultado=1;
            break;
            case 17:
                resultado=1;
            break;
            case 18:
                resultado=1;
            break;
            case 19:
                resultado=1;
            break;
            case 20:
                resultado=1;
            break;
            case 21:
                resultado=1;
            break;
            case 22:
                resultado=1;
            break;
        }
}
}

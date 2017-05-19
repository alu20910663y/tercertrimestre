package practica82;
/**
 * 
 * @author carlos
 * @version 1
 */

public class divisor {
   
    private int cantidad;
    private int quinientos;
    private int doscientos;
    private int cien;
    private int cincuenta;
    private int veinte;
    private int diez;
    private int cinco;
    private int dos;
    private int uno;
    
    private int rquinientos;
    private int rdoscientos;
    private int rcien;
    private int rcincuenta;
    private int rveinte;
    private int rdiez;
    private int rcinco;
    private int rdos;
    
    
    /**
     * Constructor que inicializa cantidad
     * @param cantidad 
     */
    
    public divisor(int cantidad){
        this.cantidad=cantidad;
    }
    
    /**
     * Metodo que muestra los resultados
     */
    public void Getresultados(){
        
        calcular();
        System.out.println("Quinientos: "+quinientos);
        System.out.println("Doscientos: "+doscientos);
        System.out.println("Cien: "+cien);
        System.out.println("Cincuenta: "+cincuenta);
        System.out.println("Veinte: "+veinte);
        System.out.println("Diez: "+diez);
        System.out.println("Cinco: "+cinco);
        System.out.println("Dos: "+dos);
        System.out.println("Uno: "+uno);
    }
    /**
     * Metodo que calcula los resultados
     */
    private void calcular(){
        
        divquinientos();
        divdoscientos();
        divcien();
        divcincuenta();
        divveinte();
        divdiez();
        divcinco();
        divdos();
        divuno();
           
    }
    /**
     * Metodo que calcula el resultado de 500
     */
    private void divquinientos(){
        quinientos=cantidad/500;
        rquinientos=cantidad%500;
    }
    /**
     * Metodo que calcula el resultado de 200
     */
    private void divdoscientos(){
        doscientos=rquinientos/200;
        rdoscientos=rquinientos%200;
    }
    /**
     * Metodo que calcula el resultado de 100
     */
    private void divcien(){
        cien=rdoscientos/100;
        rcien=rdoscientos%100;
    }
    /**
     * Metodo que calcula el resultado de 50
     */
    private void divcincuenta(){
        cincuenta=rcien/50;
        rcincuenta=rcien%50;
    }
    /**
     * Metodo que calcula el resultado de 20
     */
    private void divveinte(){
        veinte=rcincuenta/20;
        rveinte=rcincuenta%20;
    }
    /**
     * Metodo que calcula el resultado de 10
     */
    
    private void divdiez(){
        diez=rveinte/10;
        rdiez=rveinte%10;
    }
    /**
     * Metodo que calcula el resultado de 5
     */
    private void divcinco(){
        cinco=rdiez/5;
        rcinco=rdiez%5;
    }
    /**
     * Metodo que calcula el resultado de 2
     */
    private void divdos(){
        dos=rcinco/2;
        rdos=rcinco%2;
    }
    /**
     * Metodo que calcula el resultado de 1
     */
    private void divuno(){
        uno=rdos/1;
    }
    
}

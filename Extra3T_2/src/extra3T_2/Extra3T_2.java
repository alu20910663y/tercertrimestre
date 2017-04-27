
package extra3T_2;
import java.util.Scanner;

public class Extra3T_2 {

   
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
       int segundos;
       System.out.println("Introduce una cantidad de segundos");
       segundos=S.nextInt();
       tiempo time=new tiempo(segundos);
       time.Getsegundos();
    }
    
}

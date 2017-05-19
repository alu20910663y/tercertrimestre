
package practica85;
/**
 * @version 1
 * @author carlos
 */
public class cuenta {
   
    
    private String nombre;
    private String apellido;
    private String segundo_apellido;
    private String dni;
    private static int contador_num_cuenta=0;
    private int num_cuenta;
    private int interes;
    private double saldo;
    
    /**
     * Constructor por defecto
     */
    
    public cuenta(){
        nombre="Pepito";
        apellido="Grillo";
        segundo_apellido="null";
        dni="12345678Y";
        num_cuenta=contador_num_cuenta;
        interes=0;
        saldo=0;
        contador_num_cuenta=contador_num_cuenta+1;
    }
    /**
     * Constructor con los parametros que se le pasa
     * @param nombre
     * @param apellido
     * @param segundo_apellido
     * @param dni
     * @param interes 
     */
    public cuenta(String nombre,String apellido,String segundo_apellido,String dni,int interes){
        this.nombre=nombre;
        this.apellido=apellido;
        this.segundo_apellido=segundo_apellido;
        this.dni=dni;
        num_cuenta=contador_num_cuenta;
        this.interes=interes;
        contador_num_cuenta=contador_num_cuenta+1;
    
    
    }    
    /**
     * Introduce el nombre
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Introduce el apellido
     * @param apellido 
     */
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    /**
     * Introduce el segundo apellido
     * @param apellido2 
     */
    public void setSegundo_apellido(String apellido2){
        this.segundo_apellido=apellido2;
    }
    /**
     * Introduce el dni
     * @param dni 
     */
    public void setDNI(String dni){
        this.dni=dni;
    }
    /**
     * Introduce el interes
     * @param interes 
     */
    public void setInteres(int interes){
        this.interes=interes;
    }
    /**
     * Introduce el num cuenta
     */
    public void setNum_cuenta(){
        this.contador_num_cuenta++;
        num_cuenta=contador_num_cuenta;
    }
    /**
     * Muestra el numero de cuenta
     * @return num_cuenta
     */
    public int GetNum_cuenta(){
        return num_cuenta;
    }
    /**
     * Muestra el nombre
     * @return nombre
     */
    public String GetNombre(){
        return nombre;
    }
    /**
     * Muestra el apellido
     * @return apellido
     */
    public String GetApellido(){
        return apellido;
    }/**
     * Muestra el segundo apellido
     * @return segundo_apellido
     */
    public String GetSegundo_apellido(){
        return segundo_apellido;
    }
    /**
     * Muestra el dni
     * @return dni
     */
    public String GetDni(){
        return dni;
    }
    /**
     * Muestra el interes
     * @return interes
     */
    public int GetInteres(){
        return interes;
    }
    /**
     * Muestra el saldo
     * @return saldo
     */
    public double GetSaldo(){
        return saldo;
    }
    /**
     * Realiza un ingreso
     * @param cantidad 
     */
    public void Ingreso(double cantidad){
        saldo=saldo+cantidad;
    }
    /**
     * Realiza un reintegro
     * @param cantidad 
     */
    public void Reintegro(double cantidad){
        saldo=saldo-cantidad;
    }
}

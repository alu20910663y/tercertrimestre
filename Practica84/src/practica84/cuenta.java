
package practica84;

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
     * Constructor que inicializa los parametros por defecto
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
     * Constructor que inicializa los parametros a los valores que le pasemos
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
     * Metodo que realiza un ingreso en el saldo
     * @param ingreso 
     */
    public void ingreso(double ingreso){
        saldo=saldo+ingreso;
    }
    /**
     * Metodo que realiza una transferencia en el saldo, calcula si es posible o no
     * @param transferencia 
     */
    public void transferencia(double transferencia){
        if(transferencia>saldo){
            System.out.println("ERROR:Saldo menor a la transferencia");
        }
        else{
            saldo=saldo-transferencia;
        }
    }
    /**
     * Metodo que muestra los datos de la cuenta
     */
    public void estado_cuenta(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido+" "+segundo_apellido);
        System.out.println("DNI: "+dni);
        System.out.println("NºCuenta: "+num_cuenta);
        System.out.println("Tipo de interes: "+interes);
        System.out.println("Saldo: "+saldo);
    }
    /**
     * Metodo que obtiene el nombre
     * @return nombre
     */
    public String Get_nombre(){
        return nombre;
    }
    /**
     * Metodo que obtiene el apellido
     * @return apellido
     */
    public String Get_apellido(){
        return apellido;
    }
    /**
     * Metodo que obtiene el segundo apellido
     * @return segundo_apellido
     */
    public String Get_segundo_apellido(){
        return segundo_apellido;
    }
    /**
     * Metodo que obtiene el dni
     * @return dni
     */
    public String Get_dni(){
        return dni;
    }
    /**
     * Metodo que obtiene el interes
     * @return interes
     */
    public int Get_interes(){
        return interes;
    }
    /**
     * Metodo que obtiene el numero de cuenta
     * @return num_cuenta
     */
    public int Get_num_cuenta(){
        return num_cuenta;
    }
    /**
     * Metodo que permite introducir el nombre
     * @param nombre 
     */
    public void Set_nombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Metodo que permite introducir el apellido
     * @param apellido 
     */
    public void Set_apellido(String apellido){
        this.apellido=apellido;
    }
    /**
     * Metodo que permite introducir el segundo apellido
     * @param apellido2 
     */
    public void Set_segundo_apellido(String apellido2){
        this.segundo_apellido=apellido2;
    }
    /**
     * Metodo que permite introducir el dni
     * @param dni 
     */
    public void Set_dni(String dni){
        this.dni=dni;
    }
    /**
     * Metodo para realizar un ingreso
     * @param cantidad 
     */
    
    public void Ingreso(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    /**
     * Metodo para realizar un reintegro
     * @param cantidad 
     */
    public void Reintegro(double cantidad){
        this.saldo=this.saldo-cantidad;
    }
    /**
     * Metodo que muestra todos los datos
     */
    public void Get_datos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(segundo_apellido);
        System.out.println(dni);
        System.out.println(num_cuenta);
        System.out.println(interes);
        System.out.println(saldo);
    }
    
    
    
}

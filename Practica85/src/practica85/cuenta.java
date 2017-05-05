
package practica85;

public class cuenta {
   
    
    private String nombre;
    private String apellido;
    private String segundo_apellido;
    private String dni;
    private static int contador_num_cuenta=0;
    private int num_cuenta;
    private int interes;
    private double saldo;
    
    
    
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
    public cuenta(String nombre,String apellido,String segundo_apellido,String dni,int interes){
        this.nombre=nombre;
        this.apellido=apellido;
        this.segundo_apellido=segundo_apellido;
        this.dni=dni;
        num_cuenta=contador_num_cuenta;
        this.interes=interes;
        contador_num_cuenta=contador_num_cuenta+1;
    
    
    }    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setSegundo_apellido(String apellido2){
        this.segundo_apellido=apellido2;
    }
    public void setDNI(String dni){
        this.dni=dni;
    }
    public void setInteres(int interes){
        this.interes=interes;
    }
    public void setNum_cuenta(){
        this.contador_num_cuenta++;
        num_cuenta=contador_num_cuenta;
    }
    public int GetNum_cuenta(){
        return num_cuenta;
    }
    public String GetNombre(){
        return nombre;
    }
    public String GetApellido(){
        return apellido;
    }
    public String GetSegundo_apellido(){
        return segundo_apellido;
    }
    public String GetDni(){
        return dni;
    }
    public int GetInteres(){
        return interes;
    }
    public double GetSaldo(){
        return saldo;
    }
    public void Ingreso(double cantidad){
        saldo=saldo+cantidad;
    }
    public void Reintegro(double cantidad){
        saldo=saldo-cantidad;
    }
}

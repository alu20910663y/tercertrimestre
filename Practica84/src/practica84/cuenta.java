
package practica84;


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
    
    public void ingreso(double ingreso){
        saldo=saldo+ingreso;
    }
    public void transferencia(double transferencia){
        if(transferencia>saldo){
            System.out.println("ERROR:Saldo menor a la transferencia");
        }
        else{
            saldo=saldo-transferencia;
        }
    }
    public void estado_cuenta(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido+" "+segundo_apellido);
        System.out.println("DNI: "+dni);
        System.out.println("NºCuenta: "+num_cuenta);
        System.out.println("Tipo de interes: "+interes);
        System.out.println("Saldo: "+saldo);
    }
    public String Get_nombre(){
        return nombre;
    }
    public String Get_apellido(){
        return apellido;
    }
    public String Get_segundo_apellido(){
        return segundo_apellido;
    }
    public String Get_dni(){
        return dni;
    }
    public int Get_interes(){
        return interes;
    }
    public int Get_num_cuenta(){
        return num_cuenta;
    }
    public void Set_nombre(String nombre){
        this.nombre=nombre;
    }
    public void Set_apellido(String apellido){
        this.apellido=apellido;
    }
    public void Set_segundo_apellido(String apellido2){
        this.segundo_apellido=apellido2;
    }
    public void Set_dni(String dni){
        this.dni=dni;
    }
    public void Ingreso(double cantidad){
        this.saldo=this.saldo+cantidad;
    }
    public void Reintegro(double cantidad){
        this.saldo=this.saldo-cantidad;
    }
    
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

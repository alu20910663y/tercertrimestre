
package practica90;


public class Dni {
    
    private int numeros;
    private String letra;
    
    
    public Dni(int numeros,String letra){
        this.numeros=numeros;
        this.letra=letra;
    }
    
    public void letra_ok(){
        comprovar_letras();
    }
    
    private void comprovar_letras(){
    int resto=numeros%23;
    switch(resto){
        case 0:
            if(letra.equalsIgnoreCase("T")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la T.");
            }
            break;
        case 1:
            if(letra.equalsIgnoreCase("R")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la R.");
            }
            break;
        case 2:
            if(letra.equalsIgnoreCase("W")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la W.");
            }
            break;
        case 3:
            if(letra.equalsIgnoreCase("A")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la A.");
            }
            break;
        case 4:
            if(letra.equalsIgnoreCase("G")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la G.");
            }
            break;
        case 5:
            if(letra.equalsIgnoreCase("M")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la M.");
            }
            break;
        case 6:
            if(letra.equalsIgnoreCase("Y")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la Y.");
            }
            break;
        case 7:
            if(letra.equalsIgnoreCase("F")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la F.");
            }
            break;
        case 8:
            if(letra.equalsIgnoreCase("P")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la P.");
            }
            break;
        case 9:
            if(letra.equalsIgnoreCase("D")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la D.");
            }
            break;
        case 10:
            if(letra.equalsIgnoreCase("X")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la X.");
            }
            break;
        case 11:
            if(letra.equalsIgnoreCase("B")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la B.");
            }
            break;
        case 12:
            if(letra.equalsIgnoreCase("N")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la N.");
            }
            break;
        case 13:
            if(letra.equalsIgnoreCase("J")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la J.");
            }
            break;
        case 14:
            if(letra.equalsIgnoreCase("Z")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la Z.");
            }
            break;
        case 15:
            if(letra.equalsIgnoreCase("S")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la S.");
            }
            break;
        case 16:
            if(letra.equalsIgnoreCase("Q")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la Q.");
            }
            break;
        case 17:
            if(letra.equalsIgnoreCase("V")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la V.");
            }
            break;
        case 18:
            if(letra.equalsIgnoreCase("H")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la H.");
            }
            break;
        case 19:
            if(letra.equalsIgnoreCase("L")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la L.");
            }
            break;
        case 20:
            if(letra.equalsIgnoreCase("C")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la C.");
            }
            break;
        case 21:
            if(letra.equalsIgnoreCase("K")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la K.");
            }
            break;
        case 22:
            if(letra.equalsIgnoreCase("E")){
                System.out.println("La letra coincide.");
                }
            else{
                System.out.println("La letra no coincide, deberia ser la E.");
            }
            break;
        default:
            System.out.println("La letra no existe.");
            }
}
}

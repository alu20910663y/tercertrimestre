
package practica88;


public class Libro {
  
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestamos;
    
    public Libro(String titulo,String autor,int ejemplares,int prestamos){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestamos=prestamos;
    }
    
    public void Prestamo(){
        prestamos++;
    }
    public void Devolucion(){
        prestamos--;
    }
    public String GetTitulo(){
        return titulo;
    }
    public String GetAutor(){
        return autor;
    }
    public int GetEjemplares(){
        return ejemplares;
    }
    public int GetPrestamos(){
        return prestamos;
    }
    
}

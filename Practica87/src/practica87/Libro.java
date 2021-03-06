
package practica87;

/**
 * @version 1
 * @author carlos
 */
public class Libro {
    
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestamos;
    
    /**
     * Constructor con parametros
     * @param titulo
     * @param autor
     * @param ejemplares
     * @param prestamos 
     */
    public Libro(String titulo,String autor,int ejemplares,int prestamos){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestamos=prestamos;
    }
    /**
     * Aumenta en uno el prestamo
     */
    public void Prestamo(){
        prestamos++;
    }
    /**
     * Reduce en uno el prestamo
     */
    public void Devolucion(){
        prestamos--;
    }
    /**
     * Obtiene el titulo
     * @return titulo
     */
    public String GetTitulo(){
        return titulo;
    }
    /**
     * obtiene autor
     * @return autor
     */
    public String GetAutor(){
        return autor;
    }
    /**
     * Obtiene los ejemplares
     * @return ejemplares
     */
    public int GetEjemplares(){
        return ejemplares;
    }
    /**
     * Obtiene prestamos
     * @return prestamos
     */
    public int GetPrestamos(){
        return prestamos;
    }
}

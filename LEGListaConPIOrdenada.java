package librerias.estructurasDeDatos.lineales;
import java.util.Set;


/**
 * Write a description of class LEGListaConPIOrdenada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada<E extends Comparable<E>> extends LEGListaConPI<E>
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LEGListaConPIOrdenada
     */
    public LEGListaConPIOrdenada()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void insertar (E e)
    {
        // put your code here
        
        if(e == null){
            throw new IllegalArgumentException("No se puede insertar un elemento nulo");
        }
        
    
        inicio();
        while (!esFin() && e.compareTo(recuperar()) > 0) {
            siguiente();
        }
        super.insertar(e);
    }
}

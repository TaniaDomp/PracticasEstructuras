
package examenfinalenero_mayo2022;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author sguardatb
 */
public class IteradorArreglos<T> implements Iterator <T> {	
    private int total;
    private int actual;
    private T contenido[];

    public IteradorArreglos(T contenido[], int total) {
    	this.contenido = contenido;
    	this.total = total;
    	this.actual = 0;
    }
    
    public boolean hasNext(){
    	return actual < total;
    }
    
    public T next() {     
    	if (!hasNext())
    		throw new NoSuchElementException();	
    	
        T resul = contenido[actual];
        actual++;
        return resul;     
    } 
}

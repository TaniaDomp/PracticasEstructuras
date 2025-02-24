
package examenfinalenero_mayo2022;

import java.util.Iterator;

/**
 *
 * @author pedi
 */
public interface ConjuntoADT <T> extends Iterable<T>{
    public boolean agrega(T dato);
    public boolean contiene(T dato);
    public boolean estaVacio();   
    public Iterator<T> iterator();
    public String toString();
    public int getCardinalidad();
 
}

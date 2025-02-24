package ConjuntoEE;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Interfaz que describle un Conjunto formado por nodos
 */
public interface ConjuntoADT <T>{
    
    public boolean agrega(T dato);
    
    public boolean contiene(T dato);
    
    public boolean estaVacio();
    
    public ConjuntoADT<T> union(ConjuntoADT<T> otro);
    
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro);
    
    public Iterator<T> iterator();
    
    public T elimina(T dato);
    
    public ConjuntoADT<T> diferencia (ConjuntoADT<T> otro);
    
    public String toString();
    
    public int getCardinalidad();
}

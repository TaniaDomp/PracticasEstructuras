package estructurasenlazadas;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que descreibe un iterador de una estructura enlazada
 */
public class IteradorEE <T> implements Iterator<T>{
    private Nodo<T> actual;

    public IteradorEE(Nodo<T> actual) {
        this.actual = actual;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if(this.hasNext()){
            T dato = actual.getDato();
            actual = actual.getDireccion();
            return dato;
        }
        throw new NoSuchElementException();
    }
    
    
}

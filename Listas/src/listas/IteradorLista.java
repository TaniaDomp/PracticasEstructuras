package listas;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describe un iterador de nodos dobles
 */
public class IteradorLista <T> implements Iterator<T>{
    private NodoDoble<T> actual;

    public IteradorLista(NodoDoble<T> actual) {
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
            actual = actual.getSiguiente();
            return dato;
        }
        throw new NoSuchElementException();
    }
}

package BolsaEE;
import estructurasenlazadas.Nodo;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *08/06/2022
 * Clase que describe un iterador de una Bolsa
 */
public class IteradorBolsa<T> implements Iterator<T>{
    private Nodo<T> actual;
    
    public IteradorBolsa(Nodo<T> actual){
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

package examenfinalenero_mayo2022;
import java.util.*;

/**
 * Clase para implementar la interface Iterator.
 * Implementa los métodos hasNext() y next().
 * @author Silvia Guardati
 */
public class IteradorEE <T> implements Iterator <T> {
    private Nodo <T> actual;

    public IteradorEE(Nodo <T> actual) {
        this.actual = actual;
    }    
  
    public boolean hasNext() {
        return actual != null;
    }

    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T resul = actual.getDato();
        actual = actual.getSig();
        return resul;
    }
}

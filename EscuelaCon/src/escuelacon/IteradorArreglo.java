package escuelacon;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *05/04/2022
 *Clase que representa un iterador
 */
public class IteradorArreglo<T> implements Iterator<T>{
    private int actual;
    private int total;
    private T[] coleccion;
    
    public IteradorArreglo(T[] coleccion, int total){
        actual = 0;
        this.total = total;
        this.coleccion = coleccion;
    }

    @Override
    public boolean hasNext() {
        return actual < total;
    }

    @Override
    public T next() {
        if(this.hasNext()){
            T res;
            
            res = coleccion[actual];
            actual++;
            return res;
        }
        else{
            throw new NoSuchElementException();
        }            
    }
    
}

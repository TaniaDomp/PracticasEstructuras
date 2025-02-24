package listas;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Interfaz que describe una lista doblemente ligada
 */
public interface ListaADT<T> extends Iterable<T>{
    
    public Iterator<T> iterator();
    
    public boolean estaVacia();
    
    public T quitaPrimero();
    
    public T quitaUltimo();
    
    public T quita(T dato);
    
    public String toString();
    
    public boolean contiene(T dato);
    
    public int calculaTamanio();
    
    public T consultaPrimero();
    
    public T consultaUltimo();
}

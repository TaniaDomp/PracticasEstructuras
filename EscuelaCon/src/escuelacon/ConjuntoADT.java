package escuelacon;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *05/04/2022
 *Interfaz del ConjuntoADT
 */
public interface ConjuntoADT <T> extends Iterable<T>{
    
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
    //faltan metodos
}

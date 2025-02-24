package BolsaEE;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *08/06/2022
 * Interfaz que describe una Bolsa
 */
public interface BolsaADT<T>{
    
    public void agrega(T dato);
    
    public boolean contiene(int n, T dato);
    
    public int getCantidad();
    
    public Iterator<T> iterator();
    
    public void quita(T dato);
    
    public Bolsa<T> junta(Bolsa<T> otra);
}

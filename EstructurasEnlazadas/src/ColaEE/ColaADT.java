package ColaEE;
import java.util.ArrayList;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Interfaz que describe el comportamiento de una cola
 */
public interface ColaADT <T>{
    
    public void agrega(T dato);
    
    public T quita();
    
    public boolean estaVacia();
    
    public T consultaPrimero();
    
    public T consultaFinal();
    
    public int cuentaElementos();
    
    public ArrayList<T> multiQuita(int n);
}

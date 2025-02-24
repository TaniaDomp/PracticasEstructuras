package cola_01;

import java.util.ArrayList;

/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que describe una interfaz de una cola
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

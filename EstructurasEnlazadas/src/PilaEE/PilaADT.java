package PilaEE;
/**Tania Ariadna Dominguez Palma
 *19/05/2022
 * Interfaz que describe el comportamiento de una pila de nodos
 */
public interface PilaADT <T>{
    
    public void push(T dato);
    
    public T pop();
    
    public boolean isEmpty();
    
    public T peek();
    
}

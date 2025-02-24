package pila_01;
/*Tania Ariadna Dominguez Palma
 *17/02/2022
 * Interfaz que indica los metodos que deben tener las clases que incluyen las pilas
 */
public interface PilaADT <T>{
    
    public void push(T dato);
    
    public T pop();
    
    public boolean isEmpty();
    
    public T peek();
}

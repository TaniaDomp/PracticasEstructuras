package pila_01;
/*Tania Ariadna Dominguez Palma
 *17/02/2022
 * Interfaz que indica los metodos que deben tener las clases que incluyen las pilas
 */
public interface PilaADT_1 <T>{
    
    public void push1(T dato);
    
    public void push2(T dato);
    
    public T pop1();
    
    public T pop2();
    
    public boolean isEmpty1();
    
    public boolean isEmpty2();
    
    public T peek1();
    
    public T peek2();
}

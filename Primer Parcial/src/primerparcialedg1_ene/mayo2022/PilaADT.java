package primerparcialedg1_ene.mayo2022;

/**
 * Interface para definir el comportamiento de una Pila.
 * @author SGUARDATB
 */
public interface PilaADT <T>{
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void push(T dato);
}

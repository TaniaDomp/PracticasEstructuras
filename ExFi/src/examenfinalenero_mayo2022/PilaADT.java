
package examenfinalenero_mayo2022;

/**
 *
 * @author pedi
 */
public interface PilaADT <T>{
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();    
}

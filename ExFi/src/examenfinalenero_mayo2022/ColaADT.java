package examenfinalenero_mayo2022;

/**
 *
 * @author Silvia Guardati  - Interface que describe el comportamiento
 * esperado de una estructura tipo Cola.
 */
public interface ColaADT <T> {
    public void agrega(T dato);
    public T quita();
    public boolean estaVacia();
    public T primero();
}

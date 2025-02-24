package examenfinalenero_mayo2022;

/**
 * @author Silvia Guardati
 */
public class Nodo <T> {
    private T dato;
    private Nodo<T> sig;

    public Nodo() {
        sig = null;
    }

    public Nodo(T dato) {
        this.dato = dato;
        sig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
}

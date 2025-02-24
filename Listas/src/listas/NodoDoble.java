package listas;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describe un nodo doblemente ligado
 */
public class NodoDoble <T>{
    private T dato;
    private NodoDoble<T> anterior;
    private NodoDoble<T> siguiente;

    public NodoDoble(T dato){
        this.dato = dato;
        anterior = null;
        siguiente = null;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public T getDato() {
        return dato;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }
    
    
}

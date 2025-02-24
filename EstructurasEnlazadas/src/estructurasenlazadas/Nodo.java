package estructurasenlazadas;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describe un nodo
 */
public class Nodo <T>{
    private T dato;
    private Nodo<T> dir;
    
    public Nodo(){
        dir = null;
    }
    
    public Nodo(T dato){
        this.dir = dir;
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getDireccion() {
        return dir;
    }

    public void setDireccion(Nodo<T> direccion) {
        this.dir = direccion;
    }
}

package PilaEE;
import estructurasenlazadas.Nodo;
/**Tania Ariadna Dominguez Palma
 *19/05/2022
 * Clase que describe una pila formada por nodos
 */
public class Pila <T> implements PilaADT<T>{
    private Nodo<T> primero;

    @Override
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        
        nuevo.setDireccion(primero);
        primero = nuevo;
    }

    @Override
    public T pop() {
        T resultado = null;
        
        if(!this.isEmpty()){
            if(primero.getDireccion() == null){
                resultado = primero.getDato();
                primero = null;
            }
            else{
                Nodo<T> actual = primero, siguiente = primero.getDireccion();
                
                resultado = actual.getDato();
                actual.setDireccion(null);
                primero = siguiente;
            }
        }
        return resultado;
    }

    @Override
    public boolean isEmpty() {
        return primero == null;
    }

    @Override
    public T peek() {
        T resultado = null;
        
        if(!this.isEmpty()){
            resultado = primero.getDato();
        }
        return resultado;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        Nodo<T> actual = primero;
        
        while(actual != null){
            cad.append("\n" + actual.getDato());
            actual = actual.getDireccion();
        }
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        Pila<T> otr = new Pila();
        boolean res = false;
        
        if(obj.getClass().equals(this.getClass())){
            otr = (Pila)obj;
            if(!otr.isEmpty() && isEmpty()){
                Nodo<T> actual1 = this.primero, actual2 = otr.primero;
                res = true;
                while(actual1 != null && actual2 != null && res){
                    res = actual1.getDato().equals(actual2.getDato());
                    actual1 = actual1.getDireccion();
                    actual2 = actual2.getDireccion();
                }
            }
        }
        return res;
    }
}

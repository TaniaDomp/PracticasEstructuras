package listas;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase abstracta que describe una una lista doblemente ligada
 */
public abstract class Lista<T> implements ListaADT<T>{
    protected NodoDoble<T> primero;
    protected NodoDoble<T> ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }
    
    public Iterator<T> iterator(){
        return new IteradorLista(primero);
    }
    
    public boolean estaVacia(){
        return primero == null && ultimo == null; //deberia alcanzar con una condicion
    }
    
    public T quitaPrimero(){
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = primero.getDato();
            if(primero == null){ //habia un solo nodo
                ultimo = null; //indica que la lista quedo vacia
            }
            else{
                NodoDoble<T> auxiliar = primero.getSiguiente(); //primero.getAnterior.setSiguiente(null);
                auxiliar.setAnterior(null);                   //primero.setAnterior(null);
                primero.setSiguiente(null);
                primero = auxiliar;
            }
        }
        return resultado;
    }
    
    public T quitaUltimo(){
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = ultimo.getDato();
            if(ultimo == null){
                primero = null;
            }
            else{
                NodoDoble<T> anterior = ultimo.getAnterior();
                
                anterior.setSiguiente(null);
                ultimo.setAnterior(null);
                ultimo = anterior;
            }
        }
        
        return resultado;
    }
    
    public T quita(T dato){
        T resultado = null;
        
        if(!this.estaVacia()){
            if(primero.getDato().equals(dato)){
                resultado = quitaPrimero();
            }
            else{
                if(ultimo.getDato().equals(dato)){
                    resultado = quitaUltimo();
                }
                else{
                    NodoDoble<T> actual = primero;
                    while(actual != null && !actual.getDato().equals(dato)){
                        actual = actual.getSiguiente();
                    }
                    if(actual != null){
                        NodoDoble<T> anterior = actual.getAnterior(), siguiente = actual.getSiguiente();
                        
                        resultado = actual.getDato();
                        anterior.setSiguiente(siguiente);
                        actual.setSiguiente(null);
                        siguiente.setAnterior(anterior);
                        actual.setAnterior(null);
                    }
                }
            }
        }
        return resultado;
    }
    
    private String toString(NodoDoble<T> actual, StringBuilder cad){
        if(actual == null){
            return cad.toString();
        }
        else{
            cad.append("\n" + actual.getDato());
            return toString(actual.getSiguiente(), cad);
        }
    }
    
    public String toString(){
        return toString(primero, new StringBuilder());
    }
    
    public T consultaPrimero() {
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = primero.getDato();
        }
        return resultado;
    }

    public T consultaUltimo() {
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = ultimo.getDato();
        }
        return resultado;
    }
    
    private int calculaTamanio(NodoDoble<T> actual, int contador){
        if(actual == null){
            return contador;
        }
        else{
            return calculaTamanio(actual.getAnterior(), contador + 1);
        }
    }
    
    public int calculaTamanio(){
        return calculaTamanio(ultimo, 0);
    }
    
    private boolean contiene(NodoDoble<T> actual, T dato){
        if(actual == null){
            return false;
        }
        else{
            if(actual.getDato().equals(dato)){
                return true;
            }
            else{
                return contiene(actual.getSiguiente(), dato);
            }
        }
    }
    
    public boolean contiene(T dato){
        return contiene(primero, dato);
    }
    
    public boolean equals(Object otro){
        boolean res = false;
        
        if(otro != null && otro.getClass().equals(this.getClass())){
            Lista<T> ot = (Lista)otro;
            if(!estaVacia() && !ot.estaVacia()){
                NodoDoble<T> actual1 = this.primero, actual2 = ot.primero;
                boolean res1 = true;
                while(actual1 != null && actual2 != null && res1){
                    res1 = actual1.getDato().equals(actual2.getDato());
                    actual1 = actual1.getSiguiente();
                    actual2 = actual2.getSiguiente();
                }
                res = res1 && actual1 == null && actual2 == null;
            }
        }
        return res;
    }
}

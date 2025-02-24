package listas;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describe una una lista doblemente ligadaordenada
 */
public class ListaOrdenada <T extends Comparable<T>> extends Lista<T> implements ListaOrdenadaADT<T>{
    
    @Override
    public void agrega(T dato) {
        NodoDoble<T> nuevo = new NodoDoble(dato);
        
        if(this.estaVacia()){
            primero = nuevo;
            ultimo = nuevo;
        }
        else{
            if(dato.compareTo(primero.getDato()) <= 0){ //convierte el nuevo en primero
                primero.setAnterior(nuevo);
                nuevo.setSiguiente(primero);
                primero = nuevo;
            }
            else{
                if(dato.compareTo(ultimo.getDato()) >= 0){ //convierte el nuevo en ultimo
                    ultimo.setSiguiente(nuevo);
                    nuevo.setAnterior(ultimo);
                    ultimo = nuevo;
                }
                else{  //se agrega en cualquier posicion
                    NodoDoble<T> actual = primero;
                    while(actual.getDato().compareTo(dato) <= 0){
                        actual = actual.getSiguiente();
                    }
                    nuevo.setAnterior(actual.getAnterior());
                    nuevo.setSiguiente(actual);
                    actual.getAnterior().setSiguiente(nuevo);
                    actual.setAnterior(nuevo);
                }
            }
        }
    }
    
    private boolean contiene(T dato, NodoDoble<T> actual){
        if(actual == null || actual.getDato().compareTo(dato) > 0){
            return false;
        }
        else{
            if(actual.getDato().compareTo(dato) == 0){
                return true;
            }
            else{
                return contiene(dato, actual.getSiguiente());
            }
        }
    }
    
    public boolean contiene(T dato){
        return contiene(dato, primero);
    }
    
    private T quita(T dato, NodoDoble<T> actual){
        if(actual == null || actual.getDato().compareTo(dato) > 0){
            return null;
        }
        else{
            if(primero.getDato().equals(dato)){
                return quitaPrimero();
            }
            else{
                if(ultimo.getDato().equals(dato)){
                    return quitaUltimo();
                }
                else{
                    if(actual.getDato().compareTo(dato) == 0){
                        NodoDoble<T> anterior = actual.getAnterior(), siguiente = actual.getSiguiente();
                        T resultado;
                            
                        resultado = actual.getDato();
                        anterior.setSiguiente(siguiente);
                        actual.setSiguiente(null);
                        siguiente.setAnterior(anterior);
                        actual.setAnterior(null);
                        return resultado;
                    }
                    else{
                        return quita(dato, actual.getSiguiente());
                    }
                }
            }
        }
    }
    
    public T quita(T dato){
        T res;
        
        if(estaVacia() ||  primero.getDato().compareTo(dato) > 0 || ultimo.getDato().compareTo(dato) < 0){
            res = null;
        }
        else{
            res = quita(dato, primero);
        }
        return res;
    }
    
    public boolean equals(Object otro){
        boolean res = false;
        
        if(otro != null && otro.getClass().equals(this.getClass())){
            ListaOrdenada<T> ot = (ListaOrdenada)otro;
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
    
    /*private boolean equalsRer(NodoDoble<T> actual1, NodoDoble<T> actual2, boolean otr){
        if(actual1 != null && actual2 != null && otr){
            return equalsRer(actual1.getSiguiente(), actual2.getSiguiente(), actual1.getDato().equals(actual2.getDato()));
        }
        else{
            return otr;
        }
    }
    
    public boolean equalsRer(Object otro){
        boolean res = false;
        
        if(otro != null && otro.getClass().equals(this.getClass())){
            ListaOrdenada<T> ot = (ListaOrdenada)otro;
            if(!estaVacia() && !ot.estaVacia()){
                NodoDoble<T> actual1 = this.primero, actual2 = ot.primero;
                boolean res1;
                res1 = equalsRer(actual1, actual2, true);
                res = res1 && actual1 == null && actual2 == null;
            }
        }
        return res;
    }*/
}

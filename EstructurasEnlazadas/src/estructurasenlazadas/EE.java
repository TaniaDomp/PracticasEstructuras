package estructurasenlazadas;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describe una estructura de datos enlazada
 */
public class EE <T> implements Iterable<T>{
    private Nodo<T> primero;
    
    public EE(){
        primero = null; //indica que esta vacia
    }
    
    public void agregaInicio(T nuevo){
        Nodo<T> nodoNuevo = new Nodo(nuevo);
        
        nodoNuevo.setDireccion(primero);
        primero = nodoNuevo;
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public void agregaFinal(T nuevo){
        Nodo<T> nodoNuevo = new Nodo(nuevo);
        
        if(estaVacia()){
            primero = nodoNuevo;
        }
        else{
            Nodo<T> actual = primero;
            while(actual.getDireccion() != null){ //permite llegar al ultimo nodo
                actual = actual.getDireccion();
            }
            actual.setDireccion(nodoNuevo);
        }
    }
    
    public T quitaPrimero(){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        T eliminado = primero.getDato();
        Nodo<T> temporal = primero;
        primero = primero.getDireccion();
        temporal.setDireccion(null); //rompe liga con el vecino
        return eliminado;
    }
    
    public T quitaUltimo(){        
        if(estaVacia()){
           throw new RuntimeException("No hay datos");
       }
       Nodo<T> temporal = primero;
       Nodo<T> temporal2 = primero;
       T eliminado = null;
       if(primero.getDireccion() == null){
           eliminado = primero.getDato();
           primero = null;
       }
       else{
           while(temporal.getDireccion() != null){
               temporal2 = temporal;
               temporal = temporal.getDireccion();
           }
           eliminado = temporal.getDato();
           temporal2.setDireccion(null);
       }
       return eliminado;
    }
    
    private boolean buscaDato(Nodo<T> actual, T dato){
        if(actual == null){
            return false;
        }
        else{
            if(actual.getDato().equals(dato)){
                return true;
            }
            else{
                return buscaDato(actual.getDireccion(), dato);
            }
        }
    }
    
    public boolean buscaDato(T dato){
        return buscaDato(primero, dato);
    }
    
    public T quitaDato(T dato){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        T eliminado = null;
        Nodo<T> actual = primero;
        Nodo<T> anterior= null;
        if(primero.getDato().equals(dato)){ //El dato se encuentra en el primer nodo
            eliminado = primero.getDato();
            primero = primero.getDireccion();
            actual.setDireccion(null);
        }
        else{
            while(actual != null && !actual.getDato().equals(dato)){
                anterior = actual;
                actual = actual.getDireccion();
            }
            if(actual != null){ //el dato fue encontrado
                eliminado = actual.getDato();
                anterior.setDireccion(actual.getDireccion());
                actual.setDireccion(null);
            }
        }
        return eliminado;
    }
    
    public boolean quitaSiguiente(T dato){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        boolean res = false;
        Nodo<T> actual = primero, eliminado;
        while(actual != null && !actual.getDato().equals(dato)){
            actual = actual.getDireccion();
        }
        if(actual != null && actual.getDireccion() != null){
            eliminado = actual.getDireccion();
            actual.setDireccion(eliminado.getDireccion());
            eliminado.setDireccion(null);
            res = true;
        }
        return res;
    }
    
    public boolean quitaAnterior(T dato){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        boolean res = false;
        Nodo<T> actual = primero, anterior = null, anteAnterior = null, eliminado;
        while (actual != null && !actual.getDato().equals(dato)){
            anteAnterior = anterior;
            anterior = actual;
            actual = actual.getDireccion();
        }
        if (actual != null)
            if (anteAnterior == null && anterior != null){
                primero = actual;
                res = true;
            }
            else 
                if (anterior == null)
                    res = false;
                else {
                    eliminado = anterior;
                    anteAnterior.setDireccion(eliminado.getDireccion());
                    eliminado.setDireccion(null);
                    res = true;
                }
        return res;
    }
    
    public boolean insertaAntesQue(T refer, T nuevo){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        boolean res = false;
        Nodo<T> actual = primero, anterior = null, nuevoNodo;
        
        while(actual != null && !actual.getDato().equals(refer)){
            anterior = actual;
            actual = actual.getDireccion();
        }
        if(actual != null){
            if(anterior == null){
                agregaInicio(nuevo);
            }
            else{
                nuevoNodo = new Nodo(nuevo);
                anterior.setDireccion(nuevoNodo);
                nuevoNodo.setDireccion(actual);
            }
            res = true;
        }
        return res;
    }
    
    public int eliminaTodosRepetidosOrdenado(){
        if(estaVacia()){
            throw new RuntimeException("No hay datos");
        }
        int elemEl = 0;
        Nodo<T> actual = primero, eliminado;
        
        while(actual != null && actual.getDireccion() != null){
            while(actual.getDato().equals(actual.getDireccion().getDato())){
                eliminado = actual.getDireccion();
                actual.setDireccion(eliminado.getDireccion());
                eliminado.setDireccion(null);
                elemEl++;
            }
            actual = actual.getDireccion();
        }
        return elemEl;
    }
    
    public void combinaEE(EE<T> objEE){
        if(objEE != null){
            if(this.estaVacia()){
                this.primero = objEE.primero;
            }
            else{
                Nodo<T> actual1 = primero, actual2 = objEE.primero, aux1, aux2;
                while(actual1 != null && actual2 != null){
                    aux1 = actual1.getDireccion();
                    aux2 = actual2.getDireccion();
                    actual1.setDireccion(actual2);
                    if(aux1 != null){
                        actual2.setDireccion(aux1);
                    }
                    actual1 = aux1;
                    actual2 = aux2;
                }
            }
        }
    }
    
    /*public String toString(){ 
        Nodo<T> actual = primero;
        StringBuilder cad = new StringBuilder();
        
        while(actual != null){
            cad.append(actual.getDato() + "\n");
            actual = actual.getDireccion();
        }
        return cad.toString();
    }*/
    
    //version recursiva 
    public String toString(Nodo<T> actual, StringBuilder cad){
        if(actual == null){
            return cad.toString();
        }
        else{
            cad.append("\n" + actual.getDato());
            actual = actual.getDireccion();
            return toString(actual, cad);
        }
    }
    
    public String toString(){
        Nodo<T> actual = primero;
        StringBuilder cad = new StringBuilder();
        
        return toString(actual, cad);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorEE(primero);
    }
}

package BolsaEE;
import estructurasenlazadas.Nodo;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *08/06/2022
 * Clase que describe una Bolsa
 */
public class Bolsa<T> implements BolsaADT<T>{
    private Nodo<T> primero;
    private int cantidad;
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    @Override
    public void agrega(Object dato) {
        Nodo<T> nuevo = new Nodo(dato);
        
        if(estaVacia()){
            primero = nuevo;
            cantidad++;
        }
        else{
            Nodo<T> actual = primero;
            while(actual.getDireccion() != null){
                actual = actual.getDireccion();
            }
            actual.setDireccion(nuevo);
            cantidad++;
        }
    }
    
    @Override
    public boolean contiene(int n, T dato) {
        Nodo<T> actual = primero;
        int con = 0;
        
        while(actual != null){
            if(actual.getDato().equals(dato)){
                con++;
            }
            actual = actual.getDireccion();
        }
        return con == n;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorBolsa(primero);
    }

    @Override
    public void quita(T dato) {
        if(!estaVacia()){
            if(primero.getDato().equals(dato) && primero.getDireccion() == null){
                primero = null;
            }
            else{
                Nodo<T> anterior = primero, actual = primero.getDireccion();
                while(actual != null){
                    if(anterior.getDato().equals(dato)){
                        anterior.setDireccion(null);
                        cantidad--;
                    }
                    anterior = actual;
                    actual = actual.getDireccion();
                }
            }
        }
    }

    @Override
    public Bolsa<T> junta(Bolsa<T> otra) {
        Bolsa<T> nueva = new Bolsa();
        
        nueva.primero = primero;
        nueva.cantidad = cantidad;
        if(nueva.estaVacia()){
            nueva.primero = otra.primero;
            nueva.cantidad = otra.cantidad;
        }
        else{
            Nodo<T> actual = nueva.primero;
            while(actual.getDireccion() != null){
                actual = actual.getDireccion();
            }
            actual.setDireccion(otra.primero);
            nueva.cantidad += otra.cantidad;
        }
        return nueva;
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
}

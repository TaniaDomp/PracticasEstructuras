package ColaEE;
import estructurasenlazadas.Nodo;
import java.util.ArrayList;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Clase que describle una Cola formada por nodos
 */
public class Cola <T> implements ColaADT<T>{
    private Nodo<T> primero;

    @Override
    public void agrega(T nuevo){
        Nodo<T> nodoNuevo = new Nodo(nuevo);
        
        if(estaVacia()){
            primero = nodoNuevo;
        }
        else{
            Nodo<T> actual = primero;
            while(actual.getDireccion() != null){ 
                actual = actual.getDireccion();
            }
            actual.setDireccion(nodoNuevo);
        }
    }

    @Override
    public T quita() {
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = primero.getDato();
            if(primero.getDireccion() == null){
                primero = null;
            }
            else{
                Nodo<T> auxiliar = primero.getDireccion();
                primero.setDireccion(null);
                primero = auxiliar;
            }
        }
        return resultado;
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public T consultaPrimero() {
        T resultado = null;
        
        if(!this.estaVacia()){
            resultado = primero.getDato();
        }
        return resultado;
    }

    @Override
    public T consultaFinal() {
        T resultado = null;
        
        if(!this.estaVacia()){
            Nodo<T> actual = primero;
            while(actual.getDireccion() != null){
                actual = actual.getDireccion();
            }
            resultado = actual.getDato();
        }
        return resultado;
    }

    @Override
    public int cuentaElementos() {
        Nodo<T> actual = primero;
        int cont = 0;
        
        while(actual != null){
            cont++;
            actual = actual.getDireccion();
        }
        return cont;
    }

    @Override
    public ArrayList<T> multiQuita(int n) {
        ArrayList<T> list = new ArrayList();
        int el;
        Nodo<T> actual = primero;
        
        el = this.cuentaElementos();
        if(n < el){
            for(int i = 0; i < n; i++){
                list.add(actual.getDato());
                actual = actual.getDireccion();
            }
        }
        else{
            while(actual != null){
                list.add(actual.getDato());
                actual = actual.getDireccion();
            }
        }
        return list;
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
        Cola<T> otr = new Cola();
        boolean res = false;
        
        if(obj.getClass().equals(this.getClass())){
            otr = (Cola)obj;
            if(!otr.estaVacia() && !estaVacia()){
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

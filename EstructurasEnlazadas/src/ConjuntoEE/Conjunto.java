package ConjuntoEE;
import estructurasenlazadas.IteradorEE;
import estructurasenlazadas.Nodo;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que describle un Conjunto formado por nodos
 */
public class Conjunto <T> implements ConjuntoADT<T>{
    private Nodo<T> primero;
    
    @Override
    public boolean agrega(T dato) {
        boolean res = false;
        
        if(!this.contiene(dato)){
            Nodo<T> nodoNuevo = new Nodo(dato);
            if(estaVacio()){
                primero = nodoNuevo;
            }
            else{
                Nodo<T> actual = primero;
                while(actual.getDireccion() != null){
                    actual = actual.getDireccion();
                }
                actual.setDireccion(nodoNuevo);
            }
            res = true;
        }
        return res;
    }

    @Override
    public boolean contiene(T dato) {
        boolean res = false;
        
        if(!estaVacio()){
            Nodo<T> actual = primero;
            res = primero.getDato().equals(dato);
            while(actual != null && !res){
                res = actual.getDato().equals(dato);
                actual = actual.getDireccion();
            }
        }
        return res;
    }

    @Override
    public boolean estaVacio() {
        return primero == null;
    }

    @Override
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        Conjunto<T> cUnion = new Conjunto();
        Iterator<T> it2;
        
        it2 = otro.iterator();
        cUnion.primero = this.primero;
        while(it2.hasNext()){
            cUnion.agrega(it2.next());
        }
        return cUnion;
    }

    @Override
    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro) {
        Conjunto<T> cInter = new Conjunto(), cGran;
        T dato;
        int car1, car2;
        Iterator<T> it;
        
        car1 = this.getCardinalidad();
        car2 = otro.getCardinalidad();
        if(car1 < car2){
            it = this.iterator();
            cGran = (Conjunto)otro;
        }
        else{
            it = otro.iterator();
            cGran = this;
        }
        while(it.hasNext()){
            dato = it.next();
            if(cGran.contiene(dato)){
                Nodo<T> nodoNuevo = new Nodo(dato), actual = cInter.primero;
                if(cInter.estaVacio()){
                    cInter.primero = nodoNuevo;
                }
                else{
                    while(actual.getDireccion() != null){
                        actual = actual.getDireccion();
                    }
                    actual.setDireccion(nodoNuevo);
                }
            }
        }
        return cInter;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorEE(primero);
    }

    @Override
    public T elimina(T dato) {
        T eliminado = null;
        
        if(!estaVacio()){
            Nodo<T> actual = primero;
            if(primero.getDato().equals(dato)){
                eliminado = actual.getDato();
                primero = primero.getDireccion();
                actual.setDireccion(null);
            }
            else{
                Nodo<T> anterior = null;
                while(actual != null && !actual.getDato().equals(dato)){
                    anterior = actual;
                    actual = actual.getDireccion();
                }
                if(actual != null){
                    eliminado = actual.getDato();
                    anterior.setDireccion(actual.getDireccion());
                    actual.setDireccion(null);
                }
            }
        }
        return eliminado;
    }

    @Override
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro) {
        Conjunto<T> cDif = new Conjunto();
        Iterator<T> it = this.iterator();
        T dato;
        
        while(it.hasNext()){
            dato = it.next();
            if(!otro.contiene(dato)){
                Nodo<T> nodoNuevo = new Nodo(dato), actual = cDif.primero;
                if(cDif.estaVacio()){
                    cDif.primero = nodoNuevo;
                }
                else{
                    while(actual.getDireccion() != null){
                        actual = actual.getDireccion();
                    }
                    actual.setDireccion(nodoNuevo);
                }
            }
        }
        return cDif;
    }

    @Override
    public int getCardinalidad() {
        Nodo<T> actual = primero;
        int card = 0;
        
        while(actual != null){
            card++;
            actual = actual.getDireccion();
        }
        return card;
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        Conjunto<T> otr;
        
        if(obj.getClass().equals(this.getClass())){
            otr = (Conjunto)obj;
            if(!otr.estaVacio() && !estaVacio()){
                Nodo<T> actual2 = otr.primero;
                res = true;
                while(actual2 != null && res){
                    res = this.contiene(actual2.getDato());
                    actual2 = actual2.getDireccion();
                }
            }
        }
        return res;
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

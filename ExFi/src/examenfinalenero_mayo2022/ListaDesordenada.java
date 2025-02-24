package examenfinalenero_mayo2022;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *Clave Unica: 200267
 * Solucion al Problema 3
 * Define una lista cuyos elementos no tienen órden entre ellos. * 
 * @author Silvia Guardati
 */
public class ListaDesordenada<T> implements Iterable<T>{
    private Nodo<T> primero;

    public ListaDesordenada() {
        primero = null;
    }   
    
    public boolean estaVacia() {
        return primero == null;
    }

    public Iterator<T> iterator() {
        return new IteradorEE <T> (primero);
    }
    
    public void agregaFinal(T dato) {
        Nodo <T> nuevo = new Nodo <T> (dato);
        if (estaVacia())
            primero = nuevo;
        else{
            Nodo <T> apuntador = primero;
            while (apuntador.getSig() != null)
                apuntador = apuntador.getSig();
            apuntador.setSig(nuevo);
        }
    }  
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        Nodo<T> temp = primero;
        while (temp != null){
            cad.append(temp.getDato() + " ");
            temp = temp.getSig();
        }          
        return cad.toString();
    }
    
    public void ordenaConDato(T dato){
        if(!estaVacia()){
            if(primero.getSig() != null){
                Nodo<T> actual = primero, anterior = null, quitado;
            
                while(actual != null){
                    if(actual.getDato().equals(dato)){
                        if(anterior != null){
                            quitado = actual;
                            actual = anterior;
                            anterior.setSig(quitado.getSig());
                            quitado.setSig(primero);
                            primero = quitado;
                        }
                    }
                    anterior = actual;
                    actual = actual.getSig();
                }
            }
        }
    }
}

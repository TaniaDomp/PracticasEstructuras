package cola_01;
import java.util.ArrayList;

/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que describe una cola
 */
public class ColaA <T> implements ColaADT<T> {
    private T[] cola;
    private int inicio;
    private int fin;
    private final int MAX = 20;
    
    public ColaA(){
        cola = (T[]) new Object[MAX];
        inicio = -1;
        fin = -1;
    }

    public ColaA(int max){
        cola = (T[]) new Object[max];
        inicio = -1;
        fin = -1;
    }
    
    @Override
    public void agrega(T dato) {
        if(estaVacia()){
            inicio = 0;
        }
        else{
            if((fin + 1) % cola.length == inicio){
                expande();
            }
        }
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;
    }

    private void expande(){
        int tam = cola.length;
        T[] masGrande = (T[]) new Object[tam * 2];
        
        for(int i = 0; i < tam; i++){
            masGrande[i] = cola[(inicio + 1) % tam];
        }
        inicio = 0;
        fin = tam - 1;
        cola = masGrande;
    }
    
    @Override
    public T quita() {
        T res; 
  
        if(estaVacia()){
            throw new ColeccionVaciaException("Cola vacia");
        }
        res = cola[inicio];
        if(inicio == fin){
            inicio = -1;
            fin = -1;
        }
        else{
            inicio = (inicio + 1) % cola.length;
        }
        return res;
    }

    @Override
    public boolean estaVacia() {
        return inicio == -1;
    }

    @Override
    public T consultaPrimero() {
        if(!estaVacia())
            return cola[inicio];
        throw new ColeccionVaciaException("Cola vacia"); 
    }
    
    @Override
    public T consultaFinal() {
        if(!estaVacia()){
            return cola[fin];
        }
        throw new ColeccionVaciaException("Cola vacia");
    }

    @Override
    public int cuentaElementos() {
        int num = 0;
        
        if(inicio < fin+1){
            num = fin - inicio + 1;
        }
        else{
            num = cola.length - inicio + fin + 1;
        }
        return num;
    }

    @Override
    public ArrayList<T> multiQuita(int n) {
        int el;
        ArrayList<T> ar = new ArrayList();
        
        el = this.cuentaElementos();
        if(n < el){
            ColaADT<T> aux = new ColaA();
            for(int i = 0; i < n; i++){
                ar.add(this.quita());
            }
            while(!this.estaVacia()){
                aux.agrega(this.quita());
            }
            for(int i = 0; i < ar.size(); i++){
                this.agrega(ar.get(i));
            }
            while(!aux.estaVacia()){
                this.agrega(aux.quita());
            }
        }
        else{
            while(!this.estaVacia()){
                ar.add(this.quita());
            }
            for(int i = 0; i < ar.size(); i++){
                this.agrega(ar.get(i));
            }
        }
        return ar;
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        ColaA a;
        int i = 0, j;
        
        if(this.getClass().equals(obj.getClass())){
            a = (ColaA)obj;
            if(this.inicio == a.inicio && this.fin == a.fin){
                res = true;
                j = (inicio + i) % cola.length;
                while(j != fin +1 && res){
                    res = cola[j].equals(a.cola[j]);
                    i++;
                    j = (inicio + i) % cola.length;
                } 
            }
        }
        return res;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        if(!this.estaVacia()){
            int i = 0, j;
            j = (inicio + i) % cola.length;
            while(j != fin +1){
                cad.append(cola[j] + "\n");
                i++;
                j = (inicio + i) % cola.length;
            } 
        }
        return cad.toString();
    }
}

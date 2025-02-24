package proyect;
/**Clase: PilaA
 * Clase que nos permite trabajar con pilas
 * @version Numero de version: 1
 */
public class PilaA <T> implements PilaADT<T>{
    private T[] pila;
    private int tope;
    private final int MAXIMO = 20;
    
    /**PilaA
     * Permite crear una pila de cualquier tipo
     */
    public PilaA() {
        pila = (T[]) new Object[MAXIMO];
        tope = -1;
    }
    
    /**isEmpty
     * Indica cuando una pila esta vacia 
     * @return boolean true si esta vacia, false si no lo esta
     */
    public boolean isEmpty(){
        return tope == -1;
    }

    public void push(T dato) {
        if(tope == pila.length - 1)
            expand();
        tope++;
        pila[tope] =  dato;
    }

    private void expand(){  //Metodo que sirve para generar mas espacio en los arreglos
        T[] nuevo = (T[]) new Object[pila.length * 2];
        
        for(int i = 0; i <= tope; i++)
            nuevo[i] = pila[i];
        pila = nuevo;
    }
    
    public T pop() {
        T resultado;
        
        if(isEmpty()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        resultado = pila[tope];
        pila[tope] = null;
        tope--;
        return resultado;
    }

    public T peek() {
        if(isEmpty()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        /*
        else
            return pila{tope} --> no es necesarop poner el else porque el throw interrumpe el programa
        */
        return pila[tope];
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        for (int i = tope; i >= 0; i--){
            cad.append("\n" + pila[i]);
        }
        return cad.toString();
    }
}

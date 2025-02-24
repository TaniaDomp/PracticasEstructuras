package pila_01;
/*Tania Ariadna Dominguez Palma
 *17/02/2022
 * Clase que implementa las pilas
 */
public class PilaA_1 <T> implements PilaADT_1<T>{
    private T[] pila;
    private int tope1;
    private int tope2;
    private final int MAXIMO = 20;

    public PilaA_1() {
        pila = (T[]) new Object[MAXIMO];
        tope1 = -1;
        tope2 = pila.length;
    }
    
    public boolean isEmpty1(){
        return tope1 == -1;
    }

    public boolean isEmpty2(){
        return tope2 == pila.length;
    }
    
    public void push1(T dato) {
        if(tope1 == tope2 - 1)
            expand();
        tope1++;
        pila[tope1] =  dato;
    }

    public void push2(T dato) {
        if(tope2 == tope1 + 1)
            expand();
        tope2--;
        pila[tope2] =  dato;
    }
    
    private void expand(){  //Metodo que sirve para generar mas espacio en los arreglos
        T[] nuevo = (T[]) new Object[pila.length * 2];
        
        for(int i = 0; i <= tope1; i++)
            nuevo[i] = pila[i];
        for(int i = pila.length-1; i >= tope2; i--)
            nuevo[i] = pila[i];
        pila = nuevo;
    }
    
    public T pop1() {
        T resultado;
        
        if(isEmpty1()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        resultado = pila[tope1];
        pila[tope1] = null;
        tope1--;
        return resultado;
    }

    public T pop2() {
        T resultado;
        
        if(isEmpty2()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        resultado = pila[tope2];
        pila[tope2] = null;
        tope2++;
        return resultado;
    }
    
    public T peek1() {
        if(isEmpty1()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        /*
        else
            return pila{tope} --> no es necesarop poner el else porque el throw interrumpe el programa
        */
        return pila[tope1];
    }
    
    public T peek2() {
        if(isEmpty2()){
            throw new ColeccionVaciaException("Pila vacia");
        }
        /*
        else
            return pila{tope} --> no es necesarop poner el else porque el throw interrumpe el programa
        */
        return pila[tope2];
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        for (int i = 0; i <= tope1; i++){
            cad.append("\n" + pila[i]);
        }
        for(int i = pila.length-1; i >= tope2; i--)
            cad.append("\n" + pila[i]);
        return cad.toString();
    }
    
}



package examenfinalenero_mayo2022;

import java.util.Iterator;

/**
 *
 * @author SG
 */
public class ConjuntoA<T> implements ConjuntoADT<T> {
    private int cardinalidad;
    private T[] conjunto;
    private final int MAX = 20;
    
    public ConjuntoA(){
        conjunto = (T[]) new Object[MAX];
        cardinalidad = 0;        
    }
    
    public ConjuntoA(int max){
        conjunto = (T[]) new Object[max];
        cardinalidad = 0;        
    }
    
    public int getCardinalidad(){
        return cardinalidad;
    }
    
    public boolean estaVacio(){
        return cardinalidad == 0;
    }
    
    public boolean contiene(T dato){
        return contiene(dato, 0);
    }
    
    private boolean contiene(T dato, int indice){
        if (indice == cardinalidad)
            return false;
        else
            if (conjunto[indice].equals(dato))
                return true;
            else
                return contiene(dato, indice + 1);
    }
    
    public boolean agrega(T dato){
        boolean respuesta;
        
        respuesta = contiene(dato);
        if (!respuesta){
            if (cardinalidad == conjunto.length)
                expande();
            conjunto[cardinalidad] = dato;
            cardinalidad++;
        }
        return !respuesta;
    }
    
    private void expande(){
        T[] masGrande = (T[]) new Object[conjunto.length * 2];        
        expande(masGrande, 0);
        conjunto = masGrande;
    }
    
    private void expande(T[] arreglo, int indice){
        if (indice < cardinalidad){
            arreglo[indice] = conjunto[indice];
            expande(arreglo, indice + 1);
        }
    }
    
    public String toString(){
        return toString(0, new StringBuilder());
    }
    
    private String toString(int indice, StringBuilder sB){
        if (indice < cardinalidad){
            sB.append(conjunto[indice]).append("\n");
            return toString(indice + 1, sB);
        }
        else
            return sB.toString();
    }
    
    public Iterator<T> iterator(){
        return new IteradorArreglos(conjunto, cardinalidad);
    }
    
}

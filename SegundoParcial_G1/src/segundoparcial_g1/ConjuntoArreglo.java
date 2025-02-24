package segundoparcial_g1;
import java.util.Iterator;

/**Tania Ariadna Dominguez Palma
 * CU: 200267
 * 28/04/2022
 * Segundo Examen parcial, Estructura de Datos
 * Preguntas 1 
 */

public class ConjuntoArreglo <T> implements ConjuntoADT <T >  {
	private T conjunto[];
	private int cardinalidad;
	private final int CAPACIDAD = 20;	

    public ConjuntoArreglo() {
    	conjunto = (T[])(new Object[CAPACIDAD]);
    	cardinalidad = 0;
    }
    
     public ConjuntoArreglo(int cantidad) {
    	conjunto = (T[])(new Object[cantidad]);
    	cardinalidad = 0;
    }
    
    @Override
    public String toString(){
    	StringBuilder cad = new StringBuilder();
    	
        for (int i = 0; i < cardinalidad; i++)
            cad.append(conjunto[i]).append(" ");    
    	return cad.toString();
    }
    
    public int getCardinalidad(){
    	return cardinalidad;
    }
        
    private void expande(){
    	T masGrande[] = (T[]) (new Object[conjunto.length * 2]);
    	int i;
    	
    	for (i= 0; i < conjunto.length; i++)
    		masGrande[i] = conjunto[i];
    	conjunto = masGrande;
    }    
  
   public boolean agrega(T elemento){
        boolean resultado;

        resultado = false;
        if (!contiene(elemento)){
            if (cardinalidad == conjunto.length)
                    expande();
            conjunto[cardinalidad] = elemento;
            cardinalidad++;
            resultado = true;
        }
        return resultado;
    }
    
    public boolean estaVacio(){
    	return cardinalidad == 0;
    }    
    
    private int buscaDato(T dato, int indice){
        if (indice < cardinalidad)
            if (conjunto[indice].equals(dato))
                return indice;
            else
                return buscaDato(dato, indice + 1);
        else
            return -1;
    }
    
    public T quita(T dato){
        if (!this.estaVacio()){
            int pos;        
            
            pos = buscaDato(dato, 0);
            if (pos >= 0){    // Si lo encuentra
                T resultado;
                resultado = conjunto[pos];
                cardinalidad--;
                conjunto[pos] = conjunto[cardinalidad];
                conjunto[cardinalidad] = null;
                return resultado;  
            }          
        }
        throw new EmptyCollectionException("Conjunto vacío o dato no encontrado");   
    }
    
    public boolean contiene(T elemento){
        return this.buscaDato(elemento, 0) >= 0;
    }
       	
    public Iterator<T> iterator() {
    	return new IteradorArreglo<T> (conjunto, cardinalidad);
    }
    
    public boolean esSuperConjuntoDe(Iterator<T> it, boolean otr){
        if(it.hasNext() && otr){
            otr = this.contiene(it.next());
            return esSuperConjuntoDe(it, otr);
        }
        else{
            return otr;
        }
    }
    
    public boolean esSuperConjuntoDe(ConjuntoADT<T> otro){
        Iterator<T> it;
        boolean res = false, otr = true;
        
        if(otro != null && this != null && otro.getCardinalidad() > 0 && otro.getClass().equals(this.getClass()) && this.cardinalidad >= otro.getCardinalidad()){
            it = otro.iterator();
            res = esSuperConjuntoDe(it, otr);
        }
        return res;
    }
}

   
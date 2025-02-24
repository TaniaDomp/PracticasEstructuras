package conjuntos;
import java.util.Iterator;
/**Tania Ariadna Dominguez Palma
 *05/04/2022
 *Clase que representa un conjunto
 */
public class ConjuntoA <T> implements ConjuntoADT <T> {
    private int cardinalidad;
    private T[] conjunto;
    private final int MAX = 20;
    
    public ConjuntoA (){
        conjunto = (T[]) new Object[MAX];
        cardinalidad  = 0;
    }
    
    public ConjuntoA (int max){
        conjunto = (T[]) new Object[max];
        cardinalidad  = 0;
    }
    
    public int getCardinalidad (){
        return cardinalidad;
    }
    
    public boolean estaVacio (){
        return cardinalidad == 0;
    }
    
    public boolean contiene (T dato){
        return contiene (dato, 0);
    }
    
    private boolean contiene (T dato, int indice){
        if (indice == cardinalidad){
            return false; 
        }
        else {
            if (conjunto[indice].equals(dato)) {
                return true;
            }
            else{
                return contiene (dato, indice + 1);
            }
        }
    }
    
    public boolean agrega (T dato){
        boolean res = contiene(dato);
        if (!res){
            if (cardinalidad == conjunto.length){
                expande();
            }
            conjunto[cardinalidad] = dato;
            cardinalidad++;
        }
        return !res;
    }
    
    public Iterator <T> iterator (){
        return new IteradorArreglo(conjunto, cardinalidad);
    }
    
    public ConjuntoADT <T> union (ConjuntoADT <T> otro){
        ConjuntoA <T> cUnion = new ConjuntoA();
        
        for (int i = 0; i < cardinalidad; i++){
            cUnion.conjunto[i] = this.conjunto[i];
        }
        cUnion.cardinalidad = this.cardinalidad;
        
        Iterator<T> it = otro.iterator();
        while(it.hasNext()){
            cUnion.agrega(it.next());
        }
        return cUnion;
    }
    
    public ConjuntoADT <T> interseccion (ConjuntoADT <T> otro){
        ConjuntoA <T> cInter;
        if (this.cardinalidad < otro.getCardinalidad()){
            cInter = new ConjuntoA(this.cardinalidad);
            interseccion(this.iterator(), otro, cInter);
        }
        else{
            cInter = new ConjuntoA(otro.getCardinalidad());
            interseccion(otro.iterator(), otro, cInter);
        }
        return cInter;    
    }
        
    private void interseccion (Iterator <T> it, ConjuntoADT<T> otro, ConjuntoA<T> cInter) {
        T dato;
        while (it.hasNext()){
            dato = it.next();
            if (otro.contiene(dato)){
                cInter.conjunto[cInter.cardinalidad] = dato;
                cInter.cardinalidad++;
            }
        }
    }
    
    private int busSecDesordenada(T[]conjunto, int cardinalidad, T dato) {
	int pos, i = 0;
		
	while (i < cardinalidad && !conjunto[i].equals(dato)) {
		i++;
	}
	if (i == cardinalidad) {
		pos = -1;
	}
	else {
		pos = i;
	}
	return pos;
    }
    
    private void unCorrimientoIzq(T[]conjunto, int cardinalidad, int pos) {
            for (int i = pos; i < cardinalidad-1; i++) {
		conjunto[i] = conjunto[i+1];
            }
    }
    
    public T elimina(T dato){
        int pos;
        T elem = null;
        
        pos = busSecDesordenada(conjunto, cardinalidad, dato);
        if(pos >= 0){
            unCorrimientoIzq(conjunto, cardinalidad, pos);
            cardinalidad--;
            elem = conjunto[cardinalidad];
            conjunto[cardinalidad] = null;
        }
        return elem;
    }
    
    private void diferencia (int indice, ConjuntoADT<T> otro, ConjuntoA conDif){
        if (indice < cardinalidad){
            if(!otro.contiene(this.conjunto[indice])){
                conDif.conjunto[conDif.cardinalidad] =  this.conjunto[indice];
                conDif.cardinalidad++;
            }
            diferencia (indice + 1, otro, conDif);
        }
    }
    
    public ConjuntoADT<T> diferencia (ConjuntoADT<T> otro){
        ConjuntoA<T> conDif = new ConjuntoA(this.cardinalidad);
        
        diferencia(0, otro, conDif);
        return conDif;
    }
    
    public void expande(){
        T[] masGrande = (T[]) new Object[conjunto.length*2];
        expande(masGrande, 0);
        conjunto = masGrande;
    }
    
    private void expande (T[]arreglo, int indice){
        if (indice < cardinalidad){
            arreglo[indice] = conjunto[indice];
            expande(arreglo, indice+1);
        }
    }
    
    private String toString (int indice, StringBuilder sB){
        if (indice < cardinalidad){
            sB.append(conjunto[indice]).append("\n");
            return toString (indice+1, sB);
        }
        else
            return sB.toString();
    }
    
    public String toString(){
        return toString(0, new StringBuilder());
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        ConjuntoA aux;
        int i;
        
        if(obj != null && obj.getClass().getSimpleName().equals("ConjuntoA")){
            aux = (ConjuntoA)obj;
            if(aux.cardinalidad == this.cardinalidad){
                res = true;
                i = 0;
                while(i < aux.cardinalidad && res){
                    res = aux.contiene(this.conjunto[i]);
                    i++;
                }
            }
        }
        return res;
    }
}

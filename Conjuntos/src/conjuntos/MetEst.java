package conjuntos;

import java.util.Iterator;

/**Tania Ariadna Dominguez Palma
 *05/04/2022
 *Clase que contiene metodos estaticos que usan la clase ConjuntoA
 */
public class MetEst {
    
    public static <T> boolean equals(ConjuntoADT<T> c1, ConjuntoADT<T> c2){
        boolean res = false;
        Iterator<T> it1;
        
        if(c2 != null && c1 != null && c1.getClass().equals(c2.getClass()) && c1.getCardinalidad() == c2.getCardinalidad()){
            it1 = c1.iterator();
            res = true;
            while(it1.hasNext() && res){
                res = c2.contiene(it1.next());
            }
        }
        return res;
    }
        
}

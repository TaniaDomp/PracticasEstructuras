package cola_01;
import pila_01.PilaADT;
import pila_01.PilaA;
/**Tania Ariadna Dominguez Palma
 * 19/04/2022
 * Clase que contiene metodos estaticos para el manejo y control de clases con colas
 */
public class MetodosExt {
    
    public static <T> void copiaColas(ColaADT<T> cop, ColaADT<T> ori){
        ColaADT<T> aux = new ColaA();
        
        while(!ori.estaVacia()){
            aux.agrega(ori.quita());
        }
        while(!cop.estaVacia()){
            ori.agrega(cop.quita());
        }
        while(!aux.estaVacia()){
            ori.agrega(aux.quita());
        }
    }
    
    public static <T> void copiaColasFinal(ColaADT<T> cop, ColaADT<T> ori){
        while(!cop.estaVacia()){
            ori.agrega(cop.quita());
        }
    }
    
    public static <T> boolean equals(ColaADT<T> c1, ColaADT<T> c2){
        boolean res = false;
        ColaADT<T> col1 = new ColaA();
        ColaADT<T> col2 = new ColaA();
        int i;
        
        if(!c1.estaVacia() && !c2.estaVacia()){
            if(c1 == c2){
                res = true;
            }
            else{
                i = 0;
                while(!c1.estaVacia() && !c2.estaVacia() && c1.consultaPrimero().equals(c2.consultaPrimero())){
                    col1.agrega(c1.quita());
                    col2.agrega(c2.quita());
                    i++;
                }
                res = c1.estaVacia();
                copiaColas(col1, c1);
                copiaColas(col2, c2);
            }
        }
        return res;
    }
    
    public static <T> ColaADT<T> invierte(ColaADT<T> col){
        PilaADT<T> aux = new PilaA();
        
        while(!col.estaVacia()){
            aux.push(col.quita());
        }
        while(!aux.isEmpty()){
            col.agrega(aux.pop());
        }
        return col;
    }
    
    private static <T> ColaADT<T> invierteEst1(ColaADT<T> col, PilaADT<T> aux){
        if(!aux.isEmpty()){
            col.agrega(aux.pop());
            return invierteEst1(col, aux);
        }
        else{
            return col;
        }
    }
    
    private static <T> ColaADT<T> invierteEst(ColaADT<T> col, PilaADT<T> aux){
        if(!col.estaVacia()){
            aux.push(col.quita());
            return invierteEst(col, aux);
        }
        else{
            return invierteEst1(col, aux);
        }
    }
    
    public static <T> ColaADT<T> invierteEst(ColaADT<T> col){
        PilaADT<T> aux = new PilaA();
        
        invierteEst(col, aux);
        return col;
    }
    
    
    public static <T> void quitaRepetidos(ColaADT<T> col){
        T dato;
        
        if(!col.estaVacia() && col != null){
            ColaADT<T> aux = new ColaA();
            while(!col.estaVacia()){
                dato = col.quita();
                aux.agrega(dato);
                while(!col.estaVacia() && dato.equals(col.consultaPrimero())){
                    col.quita();
                }
            }
            while(!aux.estaVacia()){
                col.agrega(aux.quita());
            }
        }
    }
    
    public static <T> void quitaOcurrencias(ColaADT<T> col, T ocu){
        
        if(!col.estaVacia() && col != null){
            ColaADT<T> aux = new ColaA();
            T dato;
            while(!col.estaVacia()){
                dato = col.quita();
                if(!dato.equals(ocu)){
                    aux.agrega(dato);
                }
            }
            copiaColasFinal(aux, col);
        }
    }
    
    private static <T> void quitaOcuRec(ColaADT<T> col, ColaADT<T> aux, T ocu){
        if(!col.estaVacia()){
            T dato;
            dato = col.quita();
            if(!dato.equals(ocu)){
                aux.agrega(dato);
            }
            quitaOcuRec(col, aux, ocu);
        }
        else{
            copiaColasFinal(aux, col);
        }
    }
    
    public static <T> void quitaOcuRec(ColaADT<T> col, T ocu){
        if(!col.estaVacia() && col != null){
            T dato;
            ColaADT<T> aux = new ColaA();
            quitaOcuRec(col, aux, ocu);
        }
    }
    
    
}

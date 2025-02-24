package recursividad;
/**Tania Ariadna Dominguez Palma
 *15/03/2022
 *Clase que representa un arreglo generico
 */
public class ArregloGenerico <T extends Comparable<T>>{
    private T[] arreglo;
    private int total;
    private final int MAX = 10;
    
    public ArregloGenerico(){
        arreglo = (T[]) new Comparable[MAX];
        total = 0;
    }
    
    public ArregloGenerico(int MAXIMO){
        arreglo = (T[]) new Comparable[MAXIMO];
        total = 0;
    }
    
    public boolean agrega(T dato){
        boolean resp = false;
        
        if(total < arreglo.length){
            arreglo[total] = dato;
            total++;
            resp = true; 
        }
        return resp;
    }
    
    private void recorreIzq (int pos){
        if (pos < total-1){
            arreglo[pos] = arreglo[pos+1];
            recorreIzq(pos+1);
        }
        else{   
            total--;
            arreglo[total] = null;
        }
    }
    
    private int busquedaBinaria(T dato, int inicio, int fin){
        if(inicio <= fin && !arreglo[(inicio + fin)/2].equals(dato)){
            if(arreglo[(inicio + fin)/2].compareTo(dato) > 0){
                fin = ((inicio + fin) / 2) - 1;
            }
            else{
                inicio = ((inicio + fin) / 2) + 1;
            }
            return busquedaBinaria(dato, inicio, fin);
        }
        else{
            if(inicio <= fin){
                return (inicio + fin) / 2;
            }
            else{
                return -inicio+1;
            }
        }
    }
    
    public int busquedaBinaria(T dato){
        return busquedaBinaria(dato, 0, total-1);
    }
    
    private int busquedaDesordenada(T dato, int indice){
        if(indice == total){
            return -1;
        }
        else{
            if(arreglo[indice].equals(dato)){
                return indice;
            }
            else{
                return busquedaDesordenada(dato, indice+1);
            }
        }
    }
    
    public int busquedaDesordenada(T dato){
        return busquedaDesordenada(dato, 0);
    }
    
    private int posMayor(int may, int indice){
        if(indice < total){
            if(arreglo[indice].compareTo(arreglo[may])> 0){
                return posMayor(indice, indice+1);
            }
            else{
                return posMayor(may, indice+1); 
            }
        }
        else{
            return may;
        }
    }
    
    public int posMayor(){
        if(total > 0){
            return posMayor(0, 1);
        }
        else{
            return -1;
        }    
    }
    
    private void eliminaElem(T dato, int indice){
        if(indice < total){
            if(arreglo[indice].equals(dato)){
                arreglo[indice] = arreglo[total-1];
                total--;
            }
            else{
                indice++;
            }
            eliminaElem(dato, indice);
        }
    }
    
    public void eliminaElem(T dato){
        eliminaElem(dato, 0);
    }
    
    private void seleccionDirecta(int i, int j, int pos, T menor){
        if(i < total){
            if(j < total){
                if(arreglo[j].compareTo(menor) < 0){
                    menor = arreglo[j];
                    pos = j;
                }
                seleccionDirecta(i, j + 1, pos, menor);
            }
            else{
                arreglo[pos] = arreglo[i];
                arreglo[i] = menor;
                seleccionDirecta(i + 1, i + 2, i + 1, arreglo[i + 1]);
            }
        }
    }
    
    public void seleccionDirecta(){
        if(total > 0){
            seleccionDirecta(0, 1, 0, arreglo[0]);
        }
    }
    
    private void eliminaRepetidos(int ind){
        if(ind < total){
            for(int i = ind; i < total; i++){
                if(arreglo[ind - 1].equals(arreglo[i])){
                    recorreIzq(i);
                    eliminaRepetidos(ind);
                }
                else{
                    eliminaRepetidos(ind + 1);
                }
            }
        }
    }
    
    public void eliminaRepetidos(){
        eliminaRepetidos(1);
    }
    
    private String toString(StringBuilder cad, int indice){
        if(indice == total){
            return cad.toString();
        }
        else{
            cad.append(arreglo[indice] + " ");
            return toString(cad, indice + 1);
        }
    }
    
    
    public String toString(){
        return toString(new StringBuilder(), 0);
    }
   
}

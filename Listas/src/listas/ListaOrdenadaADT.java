package listas;
/**Tania Ariadna Dominguez Palma
 *03/05/2022
 * Interfaz que describe una lista ordenada
 */
public interface ListaOrdenadaADT <T extends Comparable<T>> extends ListaADT<T>{
    
    public void agrega(T dato);
    
}

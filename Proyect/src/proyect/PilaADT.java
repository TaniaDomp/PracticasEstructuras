package proyect;
/**Interfaz: PilaADT
 * Interfaz que nos permite trabajar con pilas
 * @version Numero de version: 1
 */
public interface PilaADT <T>{
    
    /**push
     * Permite insertar datos
     * @param dato de cualquier tipo
     */
    public void push(T dato);
    
    /**pop
     * Regresa el dato eliminado
     * @return T del tipo de la pila
     */
    public T pop();
    
    /**isEmpty
     * Parametriza el metodo que pregunta si la cadena esta vacia
     * @return boolean true si esta vacia y false si no lo esta
     */
    public boolean isEmpty();
    
    /**peek
     * Regresa el ultimo dato de la pila
     * @return T el ultimo dato de la pila
     */
    public T peek();
}

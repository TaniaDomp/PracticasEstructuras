package proyect;
/**Clase: ColeccionVaciaException
 * Clase que nos permite mandar excepciones a las pilas
 * @version Numero de version: 1
 */
public class ColeccionVaciaException extends RuntimeException{
    
    /**ColeccionVacia
     * Permite parametrizar la clase principal
     */
    public ColeccionVaciaException(){
        super();
    }
    
    /**ColeccionVaciaExeption
     * Permite parametrizar la excepcion la clase principal
     * @param mensaje una cadena que indique la excepcion 
     */
    public ColeccionVaciaException(String mensaje){
        super(mensaje);
    }
}

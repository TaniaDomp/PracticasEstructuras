package pila_01;
/*Tania Ariadna Dominguez Palma
 *17/02/2022
 * Clase que incica la excepcion manejada en las pilas
 */
public class ColeccionVaciaException extends RuntimeException{
    
    public ColeccionVaciaException(){
        super();
    }
    
    public ColeccionVaciaException(String mensaje){
        super(mensaje);
    }
}

package porblemascola;
import cola_01.ColaA;
import cola_01.ColaADT;
/**Tania Ariadna Dominguez Palma
 * 27/04/2022
 * Clase que describe a una impresora
 */
public class Impresora {
    private String marca;
    private ColaADT<Archivo> pendientes;
    
    public Impresora(){
        pendientes = new ColaA();
    }
    
    public Impresora(String marca){
        this();
        this.marca = marca;
    }
    
    public void altaArchivo(double tamano, String nombre, String dueno, String fecha, double resolucion){
        Archivo ar = new Foto(tamano, nombre, dueno, fecha, resolucion);
        
        pendientes.agrega(ar);
    }
    
    public void altaArchivo(double tamano, String nombre, String dueno, String fecha, String tipoProcesador){
        Archivo ar = new Documento(tamano, nombre, dueno, fecha, tipoProcesador);
        
        pendientes.agrega(ar);
    }
    
    public String imprime(){
        Archivo dato;
        String res = "Sin archivos pendientes";
        
        if(!pendientes.estaVacia()){
            dato = pendientes.quita();
            res = dato.toString();
        }
        return res;
    }
    
    public void eliminaFotos(){
        ColaADT<Archivo> aux = new ColaA();
        Archivo dato;
        
        if(!pendientes.estaVacia()){
            while(!pendientes.estaVacia()){
                dato = pendientes.quita();
                if(dato.getClass().getSimpleName().equals("Documento")){
                    aux.agrega(dato);
                }
            }
            while(!aux.estaVacia()){
                pendientes.agrega(aux.quita());
            }
        }
    }
    
    public void eliminaDocTam(){
        ColaADT<Archivo> aux = new ColaA();
        Archivo dato;
        
        if(!pendientes.estaVacia()){
            while(!pendientes.estaVacia()){
                dato = pendientes.quita();
                if(dato.getTamano() <= 500){
                    aux.agrega(dato);
                }
            }
            while(!aux.estaVacia()){
                pendientes.agrega(aux.quita());
            }
        }
    }
}

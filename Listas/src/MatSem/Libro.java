package MatSem;
import java.util.NoSuchElementException;
/**Tania Ariadna Dominguez Palma
 *21/05/2022
 * Clase que describe un Libro
 */
public class Libro implements Comparable<Libro>{
    private String clave;
    private String nombre;
    private String autor;
    
    public Libro(String clave){
        this.clave = clave;
    }
    
    public Libro(String clave, String nombre, String autor){
        this.clave= clave;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Libro Clave: ");
        cad.append(clave);
        cad.append("\n      Nombre: ");
        cad.append(nombre);
        cad.append("\n      Autor: ");
        cad.append(autor);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        
        if(obj.getClass().equals(this.getClass())){
            Libro lib = (Libro)obj;
            res = this.clave.equals(lib.clave);
        }
        return res;
    }

    @Override
    public int compareTo(Libro lib) {
        return this.clave.compareTo(lib.clave);
    }
}

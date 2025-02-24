package porblemascola;
/**Tania Ariadna Dominguez Palma
 * 26/04/2022
 * Clase que describe a una persona
 */
public class Persona{
    private String nombre;
    private String clave;
    private int edad;
    
    public Persona(String clave){
        this.clave = clave;
    }
    
    public Persona(String nombre, String clave, int edad){
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getEdad() {
        return edad;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Persona Clave: ");
        cad.append(clave);
        cad.append("\n        Nombre: ");
        cad.append(nombre);
        cad.append("\n        Edad: ");
        cad.append(edad);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        Persona p;
        boolean res = false;
        
        if(obj.getClass().equals(this.getClass())){
            p = (Persona)obj;
            res = p.clave == this.clave;
        }
        return res;
    }
}

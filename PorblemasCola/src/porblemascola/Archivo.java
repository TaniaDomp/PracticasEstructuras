package porblemascola;
/**Tania Ariadna Dominguez Palma
 * 27/04/2022
 * Clase que describe a un archivo
 */
public class Archivo {
    private double tamano;
    private String nombre;
    private String dueno;
    private String fecha;
    
    public Archivo (double tamano, String nombre, String dueno, String fecha){
        this.tamano = tamano;
        this.nombre = nombre; 
        this.dueno = dueno;
        this.fecha = fecha;
    }

    public double getTamano() {
        return tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public String getFecha() {
        return fecha;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append("Archivo Nombre: ");
        cad.append(nombre);
        cad.append("\n        Tamano: ");
        cad.append(tamano);
        cad.append("\n        Dueno: ");
        cad.append(dueno);
        cad.append("\n        Fecha: ");
        cad.append(fecha);
        return cad.toString();
    }
    
    public boolean equals(Object obj){
        boolean res = false;
        Archivo ar;
        
        if(obj.getClass().equals(this.getClass())){
            ar = (Archivo)obj;
            res = this.nombre.equals(ar.nombre);
        }
        return res;
    }
}

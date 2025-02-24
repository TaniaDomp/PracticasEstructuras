package porblemascola;
/**Tania Ariadna Dominguez Palma
 * 27/04/2022
 * Clase que describe a un archivo tipo Foto
 */
public class Foto extends Archivo{
    private double resolucion;
    
    public Foto(double tamano, String nombre, String dueno, String fecha, double resolucion){
        super(tamano, nombre, dueno, fecha);
        this.resolucion = resolucion;
    }

    public double getResolucion() {
        return resolucion;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n        Resolucion: ");
        cad.append(resolucion);
        return cad.toString();
    }
}
